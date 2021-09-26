package hw6Q4Abstraction01;
/*  Create a package name "hw6Q4Abstraction01" inside your HW project. Inside the package,
a) Create an interface "University". Declare some methods inside the interface named--> classSize, field, and teacher.
b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria.
c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub.
d) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class
- one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab.
Print something inside the non abstract or implemented method
e) Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class -
one is abstract and another one is non abstract name -- mechanicalLab and computerLab.
Print something inside the non abstract or implemented method . Now,
i) Can you create a Constructor inside the interface? If yes, create default Constructor on each interface.
If no, comment out the 'created constructor' and answer why not?
Now, answer how many keywords are used for the inheritance for Interface?
Can an interface inherit other Interface, or a regular class or abstract class?
How many inheritance is possible? Use the Interface -- "University" to answer my questions.
ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool,
 create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name
 -- hygiene and caring. Print something inside the non-abstract or implemented method.
 Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class.
 If no, comment out the created constructor and answer why not?
 Now, answer how many keywords are used for the inheritance of Abstract Class?
 Can an Abstract Class inherit other Abstract Class or a regular class or interface?
 How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
 iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract
 name -- chemistry and biology. if any of them is not possible to create, simply comment out the method and explain why in comment out.
 Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class?
 If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 iv) Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract
 name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out.
 Print something inside the non-abstract or implemented method.
 Can you create a Constructor inside a regular Class? If yes, create default Constructor.
 If no, comment out the created constructor and answer why not?
 v) Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract
 name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out.
 Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class?
 If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 Now, answer how many keywords are used for the inheritance for a regular Class?
 Can a regular Class inherit other Abstract Class or regular class or interface?
 How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions.
 You don't need to execute anything as the main method is absent. Organize the code.
 Push the code in Github. Paste your github link below.
 */


public class ColumbiaUniversity {

    /*Can you create a Constructor inside a regular Class?
    If yes, create default Constructor. If no, comment out the created constructor and answer why not?
    -we can create a default constractor as below.
     */
    public ColumbiaUniversity(){

    }
    /*public abstract void chemistry();
    since the abstract method cannot be implemented in a regular class also cannot instantiate it,
    so there is no point of having it in a regular class */

    public void biology(){
        System.out.println("life");


    }
}
