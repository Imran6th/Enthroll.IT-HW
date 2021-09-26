package hw6Q4Abstraction01;

/*Now, answer how many keywords are used for the inheritance of Abstract Class?
-One extends.
Can an Abstract Class inherit other Abstract Class or a regular class or interface?
-yes
How many inheritances is possible by an Abstract Class?
-One regular or abstract class and more than one interface
Use the all of above Abstract Classes (3) to answer my questions.
-shown below
 */

public abstract class MedicalSchool extends ColumbiaUniversity implements University,Hospital,College {

    public abstract void anatomyLab();

    public void biochemistryLab(){
        System.out.println("Test OutPut");
    }


}



