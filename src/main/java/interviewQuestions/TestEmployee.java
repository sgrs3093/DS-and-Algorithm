package interviewQuestions;

public class TestEmployee
{

    public static void main (String[] args)
    {

        Employee employee = new Employee();

        System.out.println(employee.id);//0
        System.out.println(employee.address);//null
        System.out.println(employee.empName);//null

        employee.getEmployeeName();

        int id = employee.getEmployeeId(10);
        System.out.println("Employee id : " + id);//Employee id : 20

    }

}
