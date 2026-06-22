# 🎓 Student Database Management System

A console-based Student Database Management System developed using **Java, JDBC, and MySQL**. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a menu-driven interface while storing data in a MySQL database.

---

## 📌 Features

* ➕ Add new student records
* 📋 View all student records
* ✏️ Update existing student information
* 🗑️ Delete student records
* 🔗 JDBC-based MySQL database connectivity
* 📂 Menu-driven console interface
* ⚠️ Exception handling and input validation
* 🗄️ Persistent database storage

---

## 🛠️ Technologies Used

* **Java**
* **JDBC (Java Database Connectivity)**
* **MySQL**
* **MySQL Connector/J**
* **VS Code**
* **Git & GitHub**

---

## 📁 Project Structure

```text
Student-Management-System
│
├── lib
│   └── mysql-connector-j-9.7.0.jar
│
├── src
│   ├── Main.java
│   ├── Student.java
│   ├── StudentDAO.java
│   └── DBConnection.java
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database Schema

### Database

```sql
CREATE DATABASE studentdb;
```

### Table

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    department VARCHAR(50),
    email VARCHAR(100)
);
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Student-Management-System.git
cd Student-Management-System
```

### 2. Configure MySQL

Create the database and table using the SQL commands provided above.

### 3. Download MySQL Connector/J

Download MySQL Connector/J and place the JAR file inside the `lib` folder.

### 4. Update Database Credentials

Edit `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = "your_mysql_password";
```

### 5. Compile the Project

```bash
javac -cp ".;lib\mysql-connector-j-9.7.0.jar" src\*.java
```

### 6. Run the Application

```bash
java -cp ".;lib\mysql-connector-j-9.7.0.jar;src" Main
```

---

## 📸 Sample Output

```text
===== Student DBMS =====

1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Enter choice: 1

Name: Sudiksha
Age: 19
Department: AIML
Email: sudiksha@gmail.com

Student Added Successfully
```

---

## 🧩 Core Components

### Student.java

Represents the student entity and stores student information.

### DBConnection.java

Handles database connectivity using JDBC.

### StudentDAO.java

Implements CRUD operations:

* Add Student
* View Students
* Update Student
* Delete Student

### Main.java

Provides a menu-driven interface for user interaction.

---

## 🎯 Learning Outcomes

Through this project, I gained hands-on experience in:

* Object-Oriented Programming (OOP) using Java
* JDBC-based database connectivity
* SQL query execution and database management
* CRUD application development
* Exception handling and debugging
* Project organization and version control using Git

---

## 🚀 Future Enhancements

* Graphical User Interface (GUI) using Java Swing or JavaFX
* Student search functionality
* Authentication and role-based access
* Export records to CSV/Excel
* Advanced validation and error handling

---

## 👩‍💻 Author

**Sudiksha Gopisetty**

Computer Science Student | Java Developer | Database Enthusiast


