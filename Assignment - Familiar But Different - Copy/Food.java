public class Food{
    public int food;

    public Food(int numFood){
        food = numFood;
    }

    public void printFood(){
        System.out.println("Food: " + food);
    }

    public void moreFood(){
        food += 5000;
    }

    public int foodOut(int foodChange){
        foodChange = this.food;
        return foodChange;
    }

    public void foodIn(int foodChange){
        food = foodChange;
    }

}