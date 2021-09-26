package hw6Q3Inheritance;
/*i) Create another class "Cobra".
Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class").
 */
//Child class
public class Cobra extends Snake{
    public void cobraInfo(){
        System.out.println("This method is from Cobra Class");

        Cobra cbs= new Cobra();
        cbs.snakeInfo();
    }
}
