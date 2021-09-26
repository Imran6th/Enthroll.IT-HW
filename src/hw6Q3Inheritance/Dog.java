package hw6Q3Inheritance;
/*e) Create another class "Dog".
Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class").
 */
//Child class
public class Dog extends Animal{
    public void dogInfo(){
        System.out.println("This method is from Dog Class");
        Dog dga=new Dog();
        dga.animalInfo();
    }
}
