package hw6Q3Inheritance;
/*Now create a class "TestAnimal". Under the main method create an object from each class
and call their own method by their own object.
Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class,
for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc.
An object Can call other methods if the class is extended, if yes, show all the possible calls.
Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above.
Also, show by java comments who is Parent class and who is child class. Organize the code. Push the code in Github.
Paste your github link below.

 */
public class TestAnimal extends Animal {
    public static void main(String[] args) {
        Animal anm=new Animal();
        anm.animalInfo();
        Birds brd=new Birds();
        brd.birdsInfo();
        BullDog bdg=new BullDog();
        bdg.bullDogInfo();
        Cobra cbr=new Cobra();
        cbr.cobraInfo();
        Dog dg=new Dog();
        dg.dogInfo();
        Mammal mml=new Mammal();
        mml.mammalInfo();
        Reptile rpt=new Reptile();
        rpt.reptileInfo();
        Robin rbn=new Robin();
        rbn.robinInfo();
        Snake snk=new Snake();
        snk.snakeInfo();


    }

}
