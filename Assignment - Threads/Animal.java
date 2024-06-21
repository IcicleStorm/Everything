public class Animal extends Thread {
    int animals = 10;
    int multiplier = 2;
    int food;

    // Creates the foodStorageA variable
    public FoodStorage foodStorageA;
    
    // Uses a foodStorageA object to set the local foodStorageA and int values.
    public Animal(FoodStorage n) {
        food = n.food; 
        this.foodStorageA = n;
    }

    // doubles animals
    public void moreAnimals() {
        animals *= multiplier;
    }

    // returns animals
    public int animalCount() {
        return animals;
    }

    public void run() {
        while(true) {
            // Checks if there is enough food to feed the animals
            if (foodStorageA.food <= animals) {
                foodStorageA.keepGoing = false;  
                throw new RuntimeException();
            }

            // Feeds the animals then doubles them and prints the new number of animals
            foodStorageA.food = foodStorageA.food - animals;
            animals *= multiplier; 
            System.out.println("animals: " + animals);

            // the thread sleeps for 3 seconds
            try { 
                Thread.sleep(300);
            } catch (Exception e) { 
                System.out.println("sleep error");
            }
        }
    }
}