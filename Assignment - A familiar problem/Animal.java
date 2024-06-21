public class Animal {
    
    public int animals;


    public Animal (int numAnimals){
        animals = numAnimals;
    }

    public void moreAnimals(){
        animals *= 2;
    }

    public void printNum(){
        System.out.println("Animals: " + animals);
    }


}
