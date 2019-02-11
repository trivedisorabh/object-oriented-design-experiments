import java.util.ArrayList;

public class EmployeeManagementSystem implements ISubject {

    private EmployeeDAO employeeDAO;
    private ArrayList<IObserver> observerDepartments;

    private Employee currentEmployee;
    private String notifyMsg;

    public EmployeeManagementSystem() {
        this.employeeDAO = new EmployeeDAO();
        this.observerDepartments = new ArrayList<IObserver>();
    }

    public void hireNewEmployee(Employee emp) {
        synchronized (this) {
            employeeDAO.addEmployee(emp);
            this.currentEmployee = emp;
            this.notifyMsg = "Hired new employee: ";
            this.notifyObsevers();
        }
    }

    public void changeEmployeeName(long id, String name) {
        synchronized (this) {
            Employee emp = employeeDAO.udpateEmployeeName(id, name);
            this.currentEmployee = emp;
            this.notifyMsg = "Changing employee name to: ";
            this.notifyObsevers();
        }
    }

    @Override
    public void registerObserver(IObserver observer) {
        observerDepartments.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerDepartments.remove(observer);
    }

    @Override
    public void notifyObsevers() {
        for (IObserver department : observerDepartments) {
            department.callMe(currentEmployee, notifyMsg);
        }
    }

    public void showEmployeeList() {
        employeeDAO.getAllEmployees();
    }

}
