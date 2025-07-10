# ☕ Cafe Management System - Java + MySQL

A simple console-based Cafe Management System built using Java and MySQL with JDBC.

---

## 📁 Folder Structure

cafe_java_/

├── src/

│ ├── dao/

│ ├── db/

│ ├── models/

│ └── Main.java

├── lib/

│ └── mysql-connector-j-9.3.0.jar

├── out/ (compiled .class files)

├── TestDriver.java

├── run.bat (optional launcher)

├── README.md


---

## 🛠️ Setup Instructions

### ✅ Prerequisites

- Java JDK 11+ installed
- MySQL Server installed and running
- Git (optional)
- MySQL JDBC driver: [`mysql-connector-j-9.3.0.jar`](https://dev.mysql.com/downloads/connector/j/)

---

## 🗄️ MySQL Setup

1. Create the database:

```sql
CREATE DATABASE cafe_db;
USE cafe_db;

CREATE TABLE menu_items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE
);

CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100),
    quantity INT,
    total_price DOUBLE
);


###   🚀 How to Compile and Run

1. Compile:

javac -cp ".;lib/mysql-connector-j-9.3.0.jar" -d out ^



2. Run:

java -cp ".;lib/mysql-connector-j-9.3.0.jar;out" Main


