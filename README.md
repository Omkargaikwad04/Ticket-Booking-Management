# Ticket Booking Backend - Spring Boot

This project is a **Ticket Booking / Course Management Backend Application** developed using **Spring Boot** and **Spring JDBC**.
It provides **CRUD operations** with **REST APIs** and an **HTML-based UI** to add, update, delete, and view records.

---

## 🚀 Features
- Add new ticket / course
- Update existing ticket / course
- Delete ticket / course
- Retrieve all records (list view)
- Retrieve record by ID
- HTML pages with forms and list
- RESTful APIs using GET, POST, PUT, DELETE

---

## 🔁 REST API Endpoints

| HTTP Method | Endpoint           | Description                  |
|------------|--------------------|------------------------------|
| GET        | `/tickets`         | Get all records              |
| GET        | `/ticket/{id}`     | Get record by ID             |
| POST       | `/addTicket`       | Add new record               |
| PUT        | `/updateTicket`    | Update existing record       |
| DELETE     | `/delete/{id}`     | Delete record by ID          |

---

## 🧾 HTML Pages
- List all tickets in table format
- Form to add new ticket
- Form to update ticket
- Delete button for each record

---

## 🧱 Tech Stack
- Java 17
- Spring Boot
- Spring JDBC
- Maven
- MySQL
- HTML
- CSS
- Git & GitHub

---

## 📂 Project Structure
src └── main ├── java │   └── com.example.ticketbooking │       ├── controller │       ├── dao │       ├── model │       └── TicketBookingApplication.java └── resources ├── templates ├── static └── application.properties
Copy code

---

## 🗄️ Database Structure

**Table Name:** `ticket`

| Column Name  | Data Type |
|-------------|-----------|
| id          | int (PK)  |
| name        | varchar   |
| source      | varchar   |
| destination | varchar   |
| price       | double    |

---

## ⚙️ How to Run the Project
1. Clone the repository
   ```bash
   git clone https://github.com/akshaykhenat1811/ticket-booking-backend-springboot.git
Open the project in Eclipse / IntelliJ
Configure database details in application.properties
Run TicketBookingApplication.java
Open browser and access the application
📌 Learning Outcomes
Spring Boot project setup
Spring JDBC CRUD operations
REST API development (GET, POST, PUT, DELETE)
HTML integration with backend
Git & GitHub workflow
👤 Author
Omkar Gaikwad
