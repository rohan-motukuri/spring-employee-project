package org.rohan;

import java.sql.*;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws SQLException {
        /* BN: SQL Connector Basics */
//            // Step 1: Register the driver
//            // Class.forName(); // ??
//
//            // Step 2: Create Connection
//            String url = "jdbc:mysql://localhost:3306/on_14_08";
//            String username = "root";
//            String password = "root";
//            Connection connection = DriverManager.getConnection(url, username, password);
//
//            // Step 3: Create Statement Object
//            Statement statement = connection.createStatement();
//
//            // Execute Queries
//            String query = "SELECT * FROM employee;";
//            ResultSet result =  statement.executeQuery(query);
//            while(result.next()) {
//                System.out.println("Id: " + result.getInt(1) + " Name: " + result.getString(2));
//            }
//
//            // Insert Query
//            query = "INSERT INTO employee(id, name) values(4, 'Marks');";
//
//            int count = statement.executeUpdate(query);
//            System.out.println("No of Rows Inserted: " + count);
//
//            // Delete Query
//            query = "DELETE FROM employee WHERE id = 1;";
//            count = statement.executeUpdate(query);
//            System.out.println(count + " Rows deleted in Set");
//
//            // Create a table - DDL Statement
//            query = "CREATE TABLE student(" +
//                    "id int NOT NULL AUTO_INCREMENT," +
//                    "name varchar(45) NOT NULL," +
//                    "occupation varchar(35) NOT NULL," +
//                    "age int NOT NULL," +
//                    "PRIMARY KEY(id)" +
//                    ")";
//
//            boolean status = statement.execute(query);
//            System.out.println("Table Creation Status: " + !status);

        EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();

        // Insert Record into Database
        Employee employee = new Employee();
        employee.setName("Tester"); employee.setEmail("Tester@Gmail.com");
        employeeDao.addEmployee(employee);

        // View
        List<Employee> employeeList = employeeDao.getEmployees();
        System.out.println("The list of employees: " + employeeList);
        for(Employee e : employeeList) System.out.println(e.toString());
    }
}
