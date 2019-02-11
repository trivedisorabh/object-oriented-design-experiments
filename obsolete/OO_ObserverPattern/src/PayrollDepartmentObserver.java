
public class PayrollDepartmentObserver implements IObserver{
    
    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Payroll department notified ...");
        System.out.println (msg + emp.getName());
    }

}
