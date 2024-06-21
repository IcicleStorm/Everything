import java.io.Serializable;

public class DataOb implements Serializable {
  public String title;
  public int rating;

  public DataOb(String t, int r) {
    this.title = t;
    this.rating = r;
  }
}