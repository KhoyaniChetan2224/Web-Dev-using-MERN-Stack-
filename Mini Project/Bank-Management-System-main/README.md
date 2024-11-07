# Bank-Management-System
Welcome to the Bank Management System repository! This repository contains a Java and Swing package for managing various banking operations. The package includes classes for user authentication, account management, transactions, and other banking services. This system uses JDBC to connect to a MySQL database.

# Table of Contents
Introduction
Folder Structure
Getting Started
Class Overview
Database Configuration
Contributing
License

# Introduction
The Bank Management System is designed to handle common banking operations efficiently. It supports user registration and login, balance enquiries, deposits, withdrawals, fast cash, mini statements, PIN changes, and various transactions.

# Folder Structure
The repository is organized as follows:<br>
Bank_Management_System/<br>
├── src/<br>
│   ├── BalanceEnquiry.java<br>
│   ├── Conn.java<br>
│   ├── Deposit.java<br>
│   ├── FastCash.java<br>
│   ├── Login.java<br>
│   ├── MiniStatement.java<br>
│   ├── PinChange.java<br>
│   ├── SignUpOne.java<br>
│   ├── SignUpThree.java<br>
│   ├── SignUpTwo.java<br>
│   ├── Transactions.java<br>
│   ├── Withdrawal.java<br>
├── bank_management_system.sql<br>
├── README.md<br>
└── LICENSE<br>
<br>
# Getting Started
To get started with the Bank Management System, follow these steps:
<br>
Clone the repository:
<br>
git clone https://github.com/yourusername/Bank_Management_System.git<br>
cd Bank_Management_System<br>
Set up the MySQL database:<br>
<br>
Create a new MySQL database named bank_management_system.<br>
Import the bank_management_system.sql script to set up the necessary tables and data.<br>
Configure the database connection:<br>
<br>
Update the Conn.java class with your database credentials.<br>
Compile and run the application:<br>

javac -d bin src/*.java<br>
java -cp bin Login<br>

# Class Overview
Core Classes<br>
BalanceEnquiry: Handles balance enquiries for user accounts.<br>
Conn: Manages the database connection using JDBC.<br>
Deposit: Manages deposit transactions.<br>
FastCash: Handles fast cash withdrawal operations.<br>
Login: Manages user login functionality.<br>
MiniStatement: Generates and displays mini statements for user accounts.<br>
PinChange: Allows users to change their PIN.<br>
SignUpOne: Manages the first step of user registration.<br>
SignUpThree: Manages the third step of user registration.<br>
SignUpTwo: Manages the second step of user registration.<br>
Transactions: Handles various transactions related to user accounts.<br>
Withdrawal: Manages withdrawal transactions.<br>

# Contributing
We welcome contributions to this project! If you have any improvements or new features to add, please follow these steps:
<br>
Fork the repository.<br>
Create a new branch (git checkout -b feature-branch).<br>
Commit your changes (git commit -m 'Add new feature').<br>
Push to the branch (git push origin feature-branch).<br>
Create a new Pull Request.<br>
License<br>
This project is licensed under the MIT License. See the LICENSE file for more details.
