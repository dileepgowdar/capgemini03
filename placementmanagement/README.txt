BACKEND (Spring Boot, port 8076)
  1. Start PostgreSQL, create database "Dileep11" (user postgres / password 1234, see application.properties)
  2. cd backend
  3. ./mvnw spring-boot:run     (or run PlacementmanagementdemoprogramApplication in Eclipse)
  4. Test: http://localhost:8076/getadmin

FRONTEND (React + Vite, port 5173)
  1. cd frontend
  2. npm install
  3. npm run dev
  4. Open http://localhost:5173/admin

Changes made: frontend API URL now http://localhost:8076 (was 8080), @CrossOrigin added to Admincontroller,
nav uses <Link>, show-sql property fixed.
