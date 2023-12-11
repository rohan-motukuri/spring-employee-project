package org.rohan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private String query = "";

    Connection connection;

    public EmployeeDaoImpl(){
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        query = "INSERT INTO employee (name, email) VALUES (?, ?);";  // '?' -> User Input.
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());

        int count = preparedStatement.executeUpdate();
        if(count > 0){
            System.out.println("Employee has been added");
        }
        else {
            System.out.println("!OOOps , Something went wrong");
        }

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployee(Employee employee) {

        return null;
    }

    @Override
    public Employee getEmployee(int i) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<Employee>();

        query = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt         (1);
            String name = resultSet.getString (2);
            String email = resultSet.getString(3);

            Employee employee = new Employee (id, name, email);
            employeeList.add(employee);
        }

        return employeeList;
    }
}
