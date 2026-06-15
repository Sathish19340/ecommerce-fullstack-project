E-Commerce Full Stack Project

A full-stack ecommerce web application built using Java, Spring Boot, MySQL, HTML, CSS, Bootstrap, and JavaScript.

🚀 Features

- User Registration
- User Login
- BCrypt Password Encryption
- Product Management
- Product Images
- Add to Cart
- Cart Total Calculation
- Place Orders
- Order History
- Admin Panel
- Add Products
- Update Products
- Delete Products
- REST API Integration
- MySQL Database Connectivity

🛠️ Technologies Used

Backend

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- REST APIs

Frontend

- HTML
- CSS
- Bootstrap
- JavaScript

Database

- MySQL


📊 Database Tables

User

- id
- name
- email
- password

Product

- id
- name
- price
- quantity
- imageUrl

Cart

- id
- userId
- productId
- productName
- price
- quantity

Orders

- id
- userId
- totalAmount
- status

▶️ Run Locally

Clone the project

git clone https://github.com/Sathish19340/ecommerce-fullstack-project.git

Go to the project directory

cd ecommerce-fullstack-project

Configure MySQL in:

src/main/resources/application.properties

Run the application

mvn spring-boot:run

Open:

http://localhost:8080/login.html

📸 Application Modules

- Login Page
- Register Page
- Products Page
- Cart Page
- Orders Page
- Admin Panel

👨‍💻 Author

Sathishkumar M

GitHub:
https://github.com/Sathish19340
