public class Main {
  public static void main(String[] args) {
    Test t = new Test();
    t.addItem("0001", "Top Gun", 5);
    t.addItem("0002", "Goonies", 4);
    t.addItem("0003", "Lord Of The Rings", 5);
    t.addItem("0004", "The Matrix", 5);
    t.addItem("0005", "The Great Wall", 2);

    t.printMap();
  }
}