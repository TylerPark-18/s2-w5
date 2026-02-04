public class Plant{
    private final String SPECIES;
    public static final Boolean USESCHLOROPHYLL = true;
    private static int numPlants;
    private int age;
    private String name;
    private double height;

    public Plant (String name, String species){
          age = 0;
          this.name = name;
          height = 0;
          this.SPECIES = species;
          numPlants ++;
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
    public static int numPlants(){
        return numPlants;
    }
    public static void main(String[] args) {
        boolean v = Plant.USESCHLOROPHYLL;
        Plant b = new Plant("rose", "c");
        Plant c = new Plant("rose", "c");
        Plant d = new Plant("rose", "c");
        System.out.println(d.numPlants());
        Plant e = new Plant("rose", "c");
        Plant f = new Plant("rose", "c");
        System.out.println(Plant.numPlants());

        

    }
}
