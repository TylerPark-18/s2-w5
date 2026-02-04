public class Plant{
    private final String SPECIES;
    private int age;
    private String name;
    private double height;

    public Plant (String name, String species){
          age = 0;
          this.name = name;
          height = 0;
          this.SPECIES = species;
    }

    public String type(){
         return "I am a plant and my name is: " + this.name;
    }

    public void increaseAge(int years){
         age +=years;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public String species(){
        return SPECIES;
    }
}
