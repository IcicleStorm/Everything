public class mainpineapple {
    public static void main(String[] args) {
        System.out.println("There's something about pineapples.");
        
        // initialize objects
        FoodStorage storage = new FoodStorage();
        Food pineapples = new Food(storage);
        Animal fish = new Animal(storage);

        // Inserts the objects in a thread class to start them side by side.
        Thread t2 = new Thread(pineapples);
        t2.start();
        Thread t1 = new Thread(fish);
        t1.start();

    }
}