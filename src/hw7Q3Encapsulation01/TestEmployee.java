package hw7Q3Encapsulation01;

public class TestEmployee {
    public static void main(String[] args) {
Employee employee=new Employee();
        employee.setEmployeename("Shaila");
        employee.setEmployeage(30);
        employee.setEmployeesex('F');
        employee.setEmployeeCitizenship(true);

        System.out.println("Name:"+ employee.getEmployeename()+" "+",Age:"+ employee.getEmployeage()
        +" "+",Sex:"+ employee.getEmployeesex()+" "+",Citizenship:"+ employee.getEmployeeCitizenship());

    }

}
