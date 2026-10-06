import './App.css'
import Admin from './Admin'
import Home from './Home'
import { Routes, Route, Link } from 'react-router-dom'

function App() {
  return (
    <div>
      <header>
        <h1>Placement Management System</h1>

        <nav>
          <Link to="/">Home</Link>
          <Link to="/admin">Admin</Link>
        </nav>
      </header>

      <Routes>
        <Route path="/admin" element={<Admin />} />
        <Route path='/' element={<Home/>}/>
      </Routes>
  
    </div>
  )
}

export default App