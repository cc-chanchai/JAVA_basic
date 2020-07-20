class Employee{
    
    private String id;
    private String name;
    private Double saraly;
    
    // Default Constructor
    public Employee(){
        // System.out.println("create obj in constructor.");
        System.out.println("I'm Employee.");
    }

    //example super() from inheritance
    public Employee(String name){
        this.name = name;
        printEmployee();
    }
    // Dynamic Constructor
    public Employee(String id,String name){
        this.id = id;
        this.name = name;
    }

    // Dynamic Constructor
    public Employee(String id, String name, Double saraly){
        this.id = id;
        this.name = name;
        this.saraly = saraly;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSaraly(Double saraly){
        this.saraly = saraly;
    }
    
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getSaraly(){
        return this.saraly;
    }

    public void printEmployee(){
        System.out.println("Employee.java ::: id : " + this.id + ", name : " + this.name + ", saraly : " + this.saraly);
    }
}