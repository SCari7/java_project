package homework_15;

public class Person {
    String profession;
    String name;
    int workExperience;

//    public Person(String profession,String personName){
//        name = personName;
//        this.profession = profession;
//
//
//    }
    public Person(String profession, String personName, int workExperience){
        this.name = personName;
        this.profession = profession;
        this.workExperience = workExperience;
    }
    public Person(){

    }
    public void working(){
        System.out.println("im working");
    }
    public void treat(){
        System.out.println("i treat people");
    }
    public void whoAm (){
        System.out.printf("im a person: %s, my name: %s, my work experience: %d\n", profession, name, workExperience);
    }
}
