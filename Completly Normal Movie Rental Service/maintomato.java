public class maintomato{
    public static void main (String[] args){
        System.out.println("Filler text");
        System.out.println("||||||||||||||||||");
        
        // initialize lists
        rental movie1 = new rental("Top Gun: Mavrick");
        rental movie2 = new rental("Generic Racing Movie");

        // Manage lists
        movie1.push("that person over there");
        System.out.println(movie1);
        movie1.pop();
        System.out.println(movie1);

        movie2.push("this person over here");
        System.out.println(movie2);

        // Sorting line
        System.out.println("||||||||||||||||||");
    }
}
