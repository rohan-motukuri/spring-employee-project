package org.rohan;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void addEmployee (Employee employee) throws SQLException;
    void updateEmployee (Employee employee);
    void deleteEmployee (Employee employee);
    Employee getEmployee (Employee employee);
    List<Employee> getEmployees() throws SQLException;
    Employee getEmployee (int i);
}
