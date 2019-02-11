import java.util.Date;

public class App {

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Creating observers
        IObserver hrObserver = new HRDepartmentObserver();
        IObserver payrollObserver = new PayrollDepartmentObserver();

        // Registering observers
        ems.registerObserver(hrObserver);
        ems.registerObserver(payrollObserver);

        // Hiring new employee
        Employee newEmployee = new Employee("Jack", new Date(), 2500000, false);
        ems.hireNewEmployee(newEmployee);

        // Changing name
        ems.changeEmployeeName(1, "Drake");

    }

}
