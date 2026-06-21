# 🎓 Student Database Management System (Java + MySQL)

## 📌 Overview
The Student Database Management System is a Java console-based application integrated with MySQL database. It allows users to perform full CRUD (Create, Read, Update, Delete) operations on student records using JDBC connectivity.

This project demonstrates backend development skills using Java and database management using MySQL.

---

## 🚀 Features
- Add new student records  
- View all student records  
- Update existing student details  
- Delete student records  
- Persistent storage using MySQL database  

---

## 🛠️ Tech Stack
- Java (Core Java)
- MySQL Database
- JDBC (Java Database Connectivity)
- VS Code (IDE)
- Git & GitHub

---

## 📁 Project Structure
Student-DBMS-Java/
│
├── DBConnection.java
├── Student.java
├── StudentDAO.java
├── Main.java
├── lib/
│ └── mysql-connector-j.jar
└── database.sql

---

## ⚙️ Setup Instructions

### 1. Clone the repository
git clone https://github.com/Sudiksha2507/Student-DBMS-Java.git

---

### 2. Create Database in MySQL
Run the following SQL commands:

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100),
    email VARCHAR(100)
);

3. Add MySQL Connector
Download MySQL Connector/J
Place .jar file inside lib/ folder
Add it to project classpath

5. Configure Database Connection

Edit DBConnection.java:

String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = "your_password";

5. Run the Project
javac -cp ".;lib/*" *.java
java -cp ".;lib/*" Main

▶️ How to Use

After running, you will see:

===== STUDENT DBMS =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Enter your choice and perform operations.

📸 Sample Output
Student Added Successfully
1 | Rahul | 21 | Computer Science | rahul@gmail.com
Student Updated Successfully
Student Deleted Successfully

🎯 Key Learnings
Java OOP concepts
JDBC database connectivity
MySQL CRUD operations
Project structuring
Git & GitHub usage

👨‍💻 Author

Sudiksha
