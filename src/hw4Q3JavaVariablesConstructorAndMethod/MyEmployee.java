package hw4Q3JavaVariablesConstructorAndMethod;

public class MyEmployee {
    public String EmployeeName;
    private long EmployeeID;
    public char EmployeeGender;
    boolean USCitizenship;
    public int YearlySalary;
    public byte WorkExperience;
    public double YearlyIncrement;
    public float CellPhoneBill;

    public MyEmployee(float Phonebill,double Increment)
    {
CellPhoneBill=Phonebill;
YearlyIncrement=Increment;
        System.out.println("Employee Name:"+EmployeeName+"  "+"Employee ID:"+EmployeeID+" "+"Employee Gender:"+EmployeeGender
        +" "+"Yearly Salary:"+YearlySalary+"\n"+"Work Experience:"+WorkExperience+" "+"Yearly Increment:"+YearlyIncrement+" "+"CellPhone Bill:"+CellPhoneBill);
    }










}
