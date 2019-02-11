import java.util.Date;

public class Employee {

    private long id;
    private String name;
    private Date hireDate;
    private long salary;
    private boolean fired = false;

    private static int STATIC_COUNT = 0;

    public Employee(String name, Date hireDate, long salary, boolean fired) {
        super();
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.fired = fired;

        this.id = ++STATIC_COUNT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + ", id=" + id + ", fired=" + fired + "]";
    }
}
