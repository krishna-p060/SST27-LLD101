package exercise;

public class EmployeeAdapterFactory {
    public EmployeeAdapterFactory() {
    }
    public static Employee getEmployee(Object employeeData) {
        if (employeeData instanceof EmployeeCSV) {
            return new EmployeeCSVAdapter((EmployeeCSV) employeeData);
        } 
        else if (employeeData instanceof EmployeeLDAP) {
            return new EmployeeLDAPAdapter((EmployeeLDAP) employeeData);
        }
        else if(employeeData instanceof EmployeeDB) {
            return new EmployeeDBAdapter((EmployeeDB) employeeData);
        }
        else {
            throw new IllegalArgumentException("Unsupported employee data type");
        }
    }
    
}
