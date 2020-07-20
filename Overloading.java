public class Overloading{
    
    public void skill(){
        System.out.println("No Programming Skill.");
    }

    public void skill(String language){
        System.out.println("Skill : " + language);
    }

    public void skill(String l1,String l2) {
        System.out.println("Skills : " + l1 + " and " + l2);
    }

    public void skill(String...language){
        for(int index = 0; index < language.length; index++){
            System.out.println("Skills : " + language[index]);
        }
    }
}