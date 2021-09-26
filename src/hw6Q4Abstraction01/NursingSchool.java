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

public abstract class NursingSchool extends MedicalSchool implements University,Hospital,College {

    public NursingSchool(){
        /*Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class.
        If no, comment out the created constructor and answer why not?
        -Since it is a class so default constractor is possible .
         */
    }
    public abstract void hygiene();

    public void caring(){
        System.out.println("Recover");
    }
}
