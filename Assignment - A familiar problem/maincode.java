public class maincode {

    public static void main(String[] args) {

        // Variable setting
        int hours = 0;

        Animal animal = new Animal(10);
        Food storage = new Food(1000);

        // Creates a spacer
        System.out.println("____________");
        System.out.println();

        // Calculations loop

        while(storage.food > 0) {
            System.out.println("Hour "+ hours + " beginning:");
            animal.printNum();
            storage.printNum();
            System.out.println("____________");
            System.out.println();

            storage.removeFood(animal.animals);
            animal.moreAnimals();
            storage.moreFood();

            // Break loop if food = 0
            if (storage.food <= 0){
                break;
            }

            System.out.println("Hour "+ hours + " end:");
            animal.printNum();
            storage.printNum();
            System.out.println("____________");
            System.out.println();
            hours++;
        }


        // scrapped idea

        /*

        System.out.println("Hour "+ hours + " beginning:");
        animal.printNum();
        storage.printNum();
        System.out.println("____________");
        System.out.println();

        System.out.println("Hour "+ hours + " end:");
        System.out.println("Final Population: " + animal.animals);
        System.out.println("Food: 0");
        System.out.println("____________");
        System.out.println();
        */
    }

}

