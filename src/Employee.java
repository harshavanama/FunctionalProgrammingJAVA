import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    //EMPLOYEE ( EMP_ID (PK), F_NAME, L_NAME, DOB, STATE )
    //EMPLOYEE_CONTACT ( CONTACT_ID (FK), EMP_ID (FK), TYPE, VALUE )

//    select e.F_NAME, e.L_NAME, e.DOB, e.STATE from Employee e where e.State = "FL";
//
//    select e.F_NAME, e.L_NAME, e.DOB, e.STATE, c.Contact_id, c.type  from Employee e
//            left join employee_contact c on e.emp_id = c.emp_id;
//
//    select e.F_NAME, e.L_NAME, e.DOB, e.STATE  from Employee e
//    left join employee_contact c on e.emp_id = c.emp_id where c.Contact_id = NULL;
//
//    select e.F_NAME, e.L_NAME, e.DOB, e.STATE  from Employee e
//    left join employee_contact c on e.emp_id = c.emp_id Group by c.contact_id having Count(c.type) = 1;

    private int employeeId;
    private String fName;
    private String lName;
    private String dob;
    private String state;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Employee(int employeeId, String fName, String lName, String dob, String state) {
        this.employeeId = employeeId;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.state = state;
    }

    public static void main(String[] args) {
       Employee employee1 = new Employee(123, "sdff", "last", "2-3-3232", "TX");
        Employee employee2 = new Employee(2423, "sdff", "last", "2-3-3232", "FL");
        Employee employee3 = new Employee(234, "sdff", "last", "2-3-3232", "TX");

        List<Employee> employeeList = List.of(employee1, employee2, employee3);

        List<Employee> fl = employeeList.stream().filter(i -> i.getState().equals("TX")).collect(Collectors.toList());

        fl.forEach(i -> System.out.println(i.employeeId));
    }
}
