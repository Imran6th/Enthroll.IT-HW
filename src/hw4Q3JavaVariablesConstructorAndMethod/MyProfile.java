package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
    public static String Myname;
    public static int myAge;
    public static char mySex;
    public static boolean usaCitizen;
    public static byte myWorkingexperience;
    public static int myYearlyincome;
    public static long myNID;
    public static double myaverageMonthlyinstallment;
    public static float myEducationgradegrade;

    public MyProfile(String Myn, int myAge, char mySex, boolean usaCitizen,
                     int myWorkingexperience,
                     int myYearlyincome, int myNID, double myaverageMonthlyinstallment,
                     float myEducationgrade) {


    this.Myname=Myn;
    this.myAge=myAge;
    this.mySex=mySex;
    this.usaCitizen=usaCitizen;
    this.myWorkingexperience= (byte) myWorkingexperience;
    this.myYearlyincome=myYearlyincome;
    this.myNID=myNID;
    this.myaverageMonthlyinstallment=myaverageMonthlyinstallment;
    this.myEducationgradegrade=myEducationgrade;
    }
    public void myProfile(){

        System.out.println("My name:"+Myname+" "+"My Age:"+myAge+"My Gender:"+mySex +"\n"+
                "Citizenship Status:"+usaCitizen+"Job Experience:"+myWorkingexperience+"\t"
                +"Yearly Income:"+myYearlyincome+" "+"ID:"+myNID
                +"Monthly Installment:"+myaverageMonthlyinstallment+"Grade:"+myEducationgradegrade);
    }

    public static void main(String[] args) {
        MyProfile ia = new MyProfile("Imran",33,'M',false,
                5,72000,
                123456789,786.189465713540,3.15f);
        ia.myProfile();
        MyProfile aat = new MyProfile("Arish",9,'M',false,
                0,00000,123456789,
                120.2456789,4.25f);
        aat.myProfile();

    }

}
