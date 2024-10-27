# Employee Management System using Spring MVC

This project implements an Employee Management System using Spring MVC framework. It provides functionalities to manage employee records, including adding, updating, deleting, and listing employees. Below is an overview of the controller and its features:

## Controller Overview

The `EmployeeController` manages HTTP requests related to employee operations:

- **List Employees**
  - **Endpoint**: `GET /employees/list`
  - **Description**: Fetches employees from the database using `EmployeeService` and adds them to the model for rendering in the `list-employees` view.

- **Show Form for Adding an Employee**
  - **Endpoint**: `GET /employees/showFormForAdd`
  - **Description**: Initializes a new `Employee` object and adds it to the model for rendering in the `employee-form` view.

- **Save Employee**
  - **Endpoint**: `POST /employees/save`
  - **Description**: Saves the employee using `EmployeeService`, redirects to the list of employees to prevent duplicate form submission.

- **Show Form for Updating an Employee**
  - **Endpoint**: `GET /employees/showFormForUpdate`
  - **Parameters**: `employeeId` (Employee ID)
  - **Description**: Fetches the employee by ID using `EmployeeService` and adds it to the model for rendering in the `employee-form` view.

- **Delete Employee**
  - **Endpoint**: `GET /employees/delete`
  - **Parameters**: `employeeId` (Employee ID)
  - **Description**: Deletes the employee using `EmployeeService` and redirects to the list of employees.

## Technologies Used

- **Spring MVC**: Framework for building web applications in Java.
- **Spring Boot**: Simplifies Spring application development.
- **Thymeleaf**: Server-side Java template engine for web and standalone environments.
- **Maven**: Build automation tool and dependency management.
- **MySQL**: Relational database for storing employee data.

## Getting Started

### Prerequisites

- Java 8 or higher installed on your machine.
- Maven installed to build and run the application.
- MySQL database server running locally or remotely.

### Installation and Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/employee-management.git

2. **Navigate to the project directory:**
    cd employee-management
   
3. **Configure MySQL database settings:**
   Update database configuration in application.properties file located in src/main/resources.

Update database configuration in application.properties file located in src/main/resources.
   
### Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

### License
This project is not licensed; feel free to use it as you like!
