public class Interface2 extends Interface1 implements Interface3, Interface4{

    public void skill(String skill){
        System.out.println("Skill : " + skill);
    }

    public void moving(String moving){
        System.out.println("speed moving : " + moving);
    }

    public void weapon(String weapon){
        System.out.println("weapon : " + weapon);
    }
    public void setNation(String nation){
        System.out.println("nation : " + nation);
    }
}