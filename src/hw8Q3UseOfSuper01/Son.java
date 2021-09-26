package hw8Q3UseOfSuper01;

public class Son extends Father{
int ID;
int grade;

public Son(){

}
public Son(int ID,int grade){

}
public void son(){
    System.out.println("Son loves Father");
}
public void sonInfo(int ID,int grade){

    super.fatherInfo("Kuddus",81,true,'M');
    super.familyName="Talukder";
}
}
