public abstract class Abstract {
    private String id;
    private String name;

    //abstract method
    public abstract void register();
    public abstract void preTest();
    public abstract void abstractBonus();

    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}