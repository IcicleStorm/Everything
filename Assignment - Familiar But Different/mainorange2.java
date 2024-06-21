public class mainorange2 {
        public static void main(String[] args) {
            
        int foodChange = 0;
        int h = 1;

        // Create Animals

        Chicken chicken = new Chicken(6);
        Duck duck = new Duck(4);
        Pig pig = new Pig(2);
        Cow cow = new Cow(1);

        // Food stuff

        Food storage = new Food(10);


        foodChange = 2000;
        storage.foodIn(foodChange);

        while (foodChange >= 0) {
            System.out.println("-------------------------------");
            System.out.println("Hour " + h + " beginning:");
            storage.printFood();
            chicken.printPop();
            duck.printPop();
            pig.printPop();
            cow.printPop();
            System.out.println("-------------------------------");

            foodChange = storage.foodOut(foodChange);

            chicken.moreAnimals();
            duck.moreAnimals();
            
            foodChange = chicken.eatFood(foodChange);
            foodChange = duck.eatFood(foodChange);
            foodChange = pig.eatFood(foodChange);
            foodChange = cow.eatFood(foodChange);
            if (foodChange <= 0) {
                break;                
            }
            storage.foodIn(foodChange);


            System.out.println("Hour " + h + " end:");
            storage.printFood();
            chicken.printPop();
            duck.printPop();
            pig.printPop();
            cow.printPop();

            pig.moreAnimals();
            cow.moreAnimals();

            storage.foodIn(foodChange);
            storage.moreFood();
            foodChange = storage.foodOut(foodChange);
            h++;
        }

        System.out.println("-------------------------------");
        System.out.println("There is no more food.");
        System.out.println("Final Populations:");
        chicken.printPop();
        duck.printPop();
        pig.printPop();
        cow.printPop();
        }
    }
