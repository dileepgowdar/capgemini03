import { useState } from "react"
import "./Admin.css"
const API = "http://localhost:8076"

function Admin() {

    const [name, setName] = useState("")
    const [password, setPassword] = useState("")
    const [message, setMessage] = useState("")
    const [admins, setAdmins] = useState([])
    const [selectedId, setSelectedId] = useState(null)


    // SAVE ADMIN - POST
    const saveAdmin = () => {

        fetch(`${API}/saveadmin`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                name: name,
                password: password
            })
        })
        .then(response => {
            return response.json()
        })
        .then(data => {
            console.log(data)

            setMessage("Admin saved successfully!")

            // Clear input fields
            setName("")
            setPassword("")

            // Refresh admin list
            getAdmins()
        })
    }


    // GET ADMINS - GET
    const getAdmins = () => {

        fetch(`${API}/getadmin`)
            .then(response => {
                return response.json()
            })
            .then(data => {
                console.log(data)
                setAdmins(data)
            })
    }


    // SELECT ADMIN FOR UPDATE
    const selectAdmin = (admin) => {

        setSelectedId(admin.id)
        setName(admin.name)
        setPassword(admin.password)

        setMessage("Admin selected for update")
    }


    // UPDATE ADMIN - PUT
    const updateAdmin = () => {

        if (selectedId === null) {
            setMessage("Please select an admin first!")
            return
        }

        fetch(`${API}/updateadmin/${selectedId}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                name: name,
                password: password
            })
        })
        .then(response => {
            return response.json()
        })
        .then(data => {

            console.log(data)

            setMessage("Admin updated successfully!")

            setName("")
            setPassword("")
            setSelectedId(null)

            getAdmins()
        })
    }


    // DELETE ADMIN - DELETE
    const deleteAdmin = (id) => {

        fetch(`${API}/deleteadmin/${id}`, {
            method: "DELETE"
        })
        .then(() => {

            setMessage("Admin deleted successfully!")

            getAdmins()
        })
    }


    return (
    <div className="admin-container">

        <h1>Admin Management</h1>

        <div className="admin-form">

            <h2>{selectedId ? "Update Admin" : "Add Admin"}</h2>

            <label>Name</label>
            <input
                type="text"
                value={name}
                onChange={(e) => setName(e.target.value)}
                placeholder="Enter admin name"
            />

            <label>Password</label>
            <input
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                placeholder="Enter password"
            />

            <div className="button-group">

                <button className="save-btn" onClick={saveAdmin}>
                    Save Admin
                </button>

                <button className="update-btn" onClick={updateAdmin}>
                    Update Admin
                </button>

                <button className="get-btn" onClick={getAdmins}>
                    Get Admins
                </button>

            </div>

            <p className="message">{message}</p>

        </div>


        <div className="admin-list">

            <h2>Admin List</h2>

            <table>

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Password</th>
                        <th>Actions</th>
                    </tr>
                </thead>

                <tbody>

                    {admins.map(admin => (

                        <tr key={admin.id}>

                            <td>{admin.id}</td>

                            <td>{admin.name}</td>

                            <td>{admin.password}</td>

                            <td>

                                <button
                                    className="edit-btn"
                                    onClick={() => selectAdmin(admin)}
                                >
                                    Edit
                                </button>

                                <button
                                    className="delete-btn"
                                    onClick={() => deleteAdmin(admin.id)}
                                >
                                    Delete
                                </button>

                            </td>

                        </tr>

                    ))}

                </tbody>

            </table>

        </div>

    </div>
)
}

export default Admin