package hw6Q4Abstraction01;

public interface University extends College,Hospital {
    /*Can an interface inherit other Interface, or a regular class or abstract class?
    -interface can inherit more than one interface,it cannot inherit regular or abstract class
    How many inheritance is possible? Use the Interface -- "University" to answer my questions.
    -more than one,explained as above
    */
/*Now, answer how many keywords are used for the inheritance for Interface?
    One,extends*/
    /* public University(){
       Primary condition for creating default constractor is, it has to be from a class and
       the constractor name is exactly the same as class name.
    }*/
    public int classsize();

    public void field();

    public void teacher();

}
