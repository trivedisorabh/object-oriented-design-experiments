import java.util.HashSet;

public class EmployeeDAO {

    private static HashSet<Employee> employees = new HashSet<Employee>() {

        private static final long serialVersionUID = 1L;
        {
            add(new Employee("Rohan", null, 10000000, false));
            add(new Employee("Rajat", null, 50000000, false));
            add(new Employee("Bob", null, 60000000, false));
        }
    };

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public Employee udpateEmployeeName(long id, String newName){
        for (Employee emp : employees) {
            if (emp.getId() == id){
                emp.setName(newName);
                return emp;
            }
        }
        return null;
    }
    
    public void getAllEmployees(){
        System.out.println("Current employees:-");
        for (Employee emp : employees){
            System.out.println(emp);
        }
    }
}
