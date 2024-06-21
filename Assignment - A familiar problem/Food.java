public class Food {
    
    public int food;

    public Food (int numFood){
        food = numFood;
    }

    public void moreFood(){
        food += 4000;
    }

    public void printNum(){
        System.out.println("Food: " + food);
    }

    public void removeFood(int foodEaten){
        food -= foodEaten;
    }
}
