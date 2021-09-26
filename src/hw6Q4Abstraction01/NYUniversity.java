package hw6Q4Abstraction01;
/*Create a regular Class NYUniversity, create 2 methods inside the class
- one is abstract and another one is non-abstract name -- anthropology and physics.
if not possible to create, simply comment out the method and explain why in comment out.
Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class?
 If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 */

public class NYUniversity {
    /*Can you create a Constructor inside a regular Class?
   If yes, create default Constructor. If no, comment out the created constructor and answer why not?
   -we can create a default constractor as below.
    */
    public NYUniversity(){

    }
    /*public abstract void anthropology();
    since the abstract method cannot be implemented in a regular class also cannot instantiate it,
    so there is no point of having it in a regular class */

    public void physics(){
        System.out.println("Theory");
    }
}
