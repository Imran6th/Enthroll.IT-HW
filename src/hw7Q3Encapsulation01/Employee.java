package hw7Q3Encapsulation01;

public class Employee {
    private String Employeename;
    private int Employeage;
    private char Employeesex;
    private boolean EmployeeCitizenship;

    public String getEmployeename(){
    return Employeename;
}
    public void setEmployeename(String employeename) {
        this.Employeename = employeename;
    }

    public int getEmployeage() {
        return Employeage;
    }

    public void setEmployeage(int employeage) {
        this.Employeage = employeage;
    }

    public char getEmployeesex() {
        return Employeesex;
    }
    public void setEmployeesex(char employeesex) {
        this.Employeesex = employeesex;
    }
    public boolean getEmployeeCitizenship() {
        return EmployeeCitizenship;
    }
    public void setEmployeeCitizenship(boolean employeeCitizenship) {
        this.EmployeeCitizenship = employeeCitizenship;
    }
}
