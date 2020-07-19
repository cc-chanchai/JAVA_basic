class Employee{
    //acess modifier ==> public, portected(inheritan), private(in class)
    private String id;
    private String name;
    private Double saraly;
    

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