public class Inheritance1 extends Employee{
    
    String skill;
    //constructor
    public Inheritance1(){
        System.out.println("I'm Inheritance1");
    }
    public Inheritance1(String name){
        super(name);
        System.out.println("I'm Inheritance1 + name");
    }
    // public void useMethodFromEmployee(){
    //     setId("2");
    //     setName("SSSS");
    //     setSaraly(10000.0);
    //     printEmployee();
    // }
}