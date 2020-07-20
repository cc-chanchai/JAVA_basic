public class Main {
    public static void main(String[] arges) {
        Employee employee1 = new Employee(); //create object
        employee1.setId("1");
        employee1.setName("chanchai");
        employee1.setSaraly(1500.123);
        employee1.printEmployee();
        System.out.println("Main.java ::: id : " + employee1.getId() + ", name : " + employee1.getName() + ", saraly : " + employee1.getSaraly());

        Employee employee2 = new Employee(); //create object
        employee2.setId("2");
        employee2.setName("chitipat");
        employee2.setSaraly(2500.123);
        employee2.printEmployee();
        System.out.println("Main.java ::: id : " + employee2.getId() + ", name : " + employee2.getName() + ", saraly : " + employee2.getSaraly());
        
        //Constructor
        Employee employee3 = new Employee();
        employee3.printEmployee();

        Employee employee4 = new Employee("4", "custom constructor");
        employee4.printEmployee();

        Employee employee5 = new Employee("5", "custom constructor", 20090.0);
        employee5.printEmployee();

        //Non Access Modifier
        // String id = AccessModifier.id;  // error cuase id isn't static
        // System.out.println(id);
        String name = NonAccessModifier.name;
        System.out.println(name);
        NonAccessModifier.printText();
        NonAccessModifier.name = "AAAAA";
        System.out.println(NonAccessModifier.name);

        // Inheritance
        Inheritance1 inh1 = new Inheritance1();
        inh1.setId("1");
        inh1.setName("inheritance");
        inh1.setSaraly(1234.5);
        inh1.skill = "JAVA";
        inh1.printEmployee();
        System.out.println(inh1.skill);

        Inheritance2 inh2 = new Inheritance2();
        inh2.setId("1");
        inh2.setName("wutti");
        inh2.setSaraly(3000.3);
        inh2.printEmployee();

        Inheritance1 in1 = new Inheritance1("in1");
        Inheritance2 in2 = new Inheritance2("in2");
        

        // final
        FinalClass finalClass = new FinalClass();
        // finalClass.companyName = "AAB"; // companyName มีการกำหนด final ทำให้ assign ค่าไม่ได้
        System.out.println(finalClass.companyName);
    }
}