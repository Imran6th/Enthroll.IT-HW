package hw3Q3JavaBasics;

public class MyAddress {

    static String MyName= "Imran Ali";
    static int houseNumber =6126;
    static char houseDirection='e';
    static int streetNumber= 164;
    static String CityName = "New York";
    static String State="NY";
    static int zipCode=11365;
    static boolean usCitizen= false;
//
    public static void myInfo(){
        System.out.println(MyName+"\n"+houseNumber+ houseDirection+" "+streetNumber+"th St\n"+CityName
        +","+State+" "+zipCode+"\n");
        System.out.println("usCitizen :"+usCitizen);
    }
    public static void main(String[] args) {
myInfo();
    }
}
