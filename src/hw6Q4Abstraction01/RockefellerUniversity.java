package hw6Q4Abstraction01;
/*Create a regular Class RockefellerUniversity, create 2 methods inside the class -
one is abstract and another one is the non-abstract name -- maths and statistics.
if not possible to create, simply comment out the method and explain why in comment out.
 -answer as below
 Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class?
 If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 -answer as below
 Now, answer how many keywords are used for the inheritance for a regular Class?
 -two extends and implements
 Can a regular Class inherit other Abstract Class or regular class or interface?
 -yes
 How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions.
 -one regular or abstract class and multiple interface
 You don't need to execute anything as the main method is absent. Organize the code. Push the code in Github.
 Paste your github link below.
 */
public class RockefellerUniversity extends EngineeringSchool implements College,Hospital,University {

    public RockefellerUniversity(){

    }

    @Override
    public void hygiene() {

    }

    /*public abstract void maths();
    since the abstract method cannot be implemented in a regular class also cannot instantiate it,
            so there is no point of having it in a regular class */
    public void statistics(){
        System.out.println("Trend");


    }

    @Override
    public void emergencyRoom() {

    }

    @Override
    public void surgeryRoom() {

    }

    @Override
    public void Cafeteria() {

    }

    @Override
    public void commonRoom() {

    }

    @Override
    public void labratory() {

    }

    @Override
    public void languageClub() {

    }

    @Override
    public int classsize() {
        return 0;
    }

    @Override
    public void field() {

    }

    @Override
    public void teacher() {

    }

    @Override
    public void mechanicalLab() {

    }

    @Override
    public void anatomyLab() {

    }
}
