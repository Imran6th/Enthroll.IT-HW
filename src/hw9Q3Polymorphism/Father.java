package hw8Q3UseOfSuper01;
/*a) Create a class name Father. declare some variable like Name, age, sex, usCitizen, FamilyName.
Declare default and parameterized constructor from the first 4 variables.
Use FamilyName variable for use by super keyword. Create a regular void method father() which is implemented,
 declare a sysout.
Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout
 */
public class Father {
    String name;
    int age;
    char sex;
    boolean usCitizen;
    String familyName;

    public Father(){
        System.out.println("This is a default contractor from Father class");
    }
public Father(String name,int age,char sex,boolean usCitizen){
        this.name=name;
        this.age=age;
        this.usCitizen=usCitizen;
        this.sex=sex;
    String familyName1 = familyName;
}
public void father(){
    System.out.println("Father loves Son");
}

public void fatherInfo(String name,int age,boolean usCitizen,char sex){
    System.out.println("All about Father");

}
}
