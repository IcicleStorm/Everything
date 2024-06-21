public class Food extends Thread {
    
    public int food;

    // Creates the foodStorageB variable
    public FoodStorage foodStorageB;

    // Uses a foodStorageB object to set the local foodStorageB and int values.
    public Food(FoodStorage n) {
        food = n.food;
        this.foodStorageB = n;
    }

    // Runs the thread loop
    public void run(){
        while (true){
            // throws an exception once there are too many animals. (the foodStorageB.food value will change to -1)
            if (foodStorageB.keepGoing == false) {
                throw new RuntimeException();
            }
            // adds 2000 food
            foodStorageB.food+= 2000;
            // sets food to print
            food = foodStorageB.food;
            System.out.println("food: " + food);

            // sleeps for 2 seconds
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println("Unable to sleep");
                }
        }
    }


}