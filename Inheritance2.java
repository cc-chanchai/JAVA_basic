public class Inheritance2 extends Employee{
    String role;

    public Inheritance2(){
        System.out.println("I'm Inheritance2");
    }
    public Inheritance2(String name){
        super(name);
        System.out.println("I'm Inheritance2 + name");
    }
}