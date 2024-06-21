public class Animal {
    public int pop = 0;
    public int repMult = 0;
    public int eatMult = 0;
    public String animalType;
    
    public Animal (int population, int repRate, int eatRate, String animalName){
        pop = population;
        repMult = repRate;
        eatMult = eatRate;
        animalType = animalName; 
    }

    public Animal (int population){
        pop = population;
    }


    public Animal (){
        pop = 0;
    }

    public void moreAnimals(){
        this.pop *= this.repMult;
    }

    public int eatFood(int foodChange){
        foodChange -=  this.eatMult * this.pop;
        return foodChange;
    }

    public void printPop(){
        System.out.println("Population: " + pop + " " + this.animalType);
    } 
} 