public abstract class Interface1 {
    private String name;
    private int age;
    private String job;

    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public void setJob(String job){
        this.job = job;
    }

    public void showData(){
        System.out.println("name : " + this.name + ", age : " + this.age);
    }
    public abstract void skill(String skill);
}