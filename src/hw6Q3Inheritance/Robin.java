package hw6Q3Inheritance;
/*g) Create another class "Robin".
Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class").
 */
//Child class
public class Robin extends Animal {
public void robinInfo() {
    System.out.println("This method is from Robin Class");

    Robin rba=new Robin();
    rba.animalInfo();
}
}
