public class Main {
    public static void main(String [] arges) {
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
    }
}