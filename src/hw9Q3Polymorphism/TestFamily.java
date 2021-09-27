package hw8Q3UseOfSuper01;
/* a) Create a class name Father. declare some variable like Name, age, sex, usCitizen, FamilyName.
 Declare default and parameterized constructor from the first 4 variables. Use FamilyName variable for use by super keyword.
  Create a regular void method father() which is implemented, declare a sysout.
Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout
 */
public class TestFamily extends Son{

    public void main(String[] args) {

        Son sn= new Son();
        sn.father();
        sn.sonInfo(1234,3);
        TestFamily tfs = new TestFamily();

        tfs.fatherInfo("Kuddus",81,true,'M');


    }

}
