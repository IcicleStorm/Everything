import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Test {
  public Map<String, DataOb> data;

  public Test() {
    // if data file exists, load it, otherwise create new hashmap
    File f = new File("c:/Users/jduong/OneDrive - Simcoe County District School Board/Documents/CS/ICS4U/Serializable/movieDB.txt"); 
    if(f.exists() && !f.isDirectory()) { 
      loadData();
    } else {
      data = new HashMap<String, DataOb>(); 
    }
  }

  public void addItem(String k, String t, int r) {
    DataOb dbo = new DataOb(t, r);
    data.put(k, dbo);

    // serialize the hashmap after every add, just in case
    this.persistData();
  }

  private void persistData() {
    try { 
      FileOutputStream myFileOutStream = new FileOutputStream("c:/Users/jduong/OneDrive - Simcoe County District School Board/Documents/CS/ICS4U/Serializable/movieDB.txt"); 
 
      ObjectOutputStream myObjectOutStream = new ObjectOutputStream(myFileOutStream); 
 
      myObjectOutStream.writeObject(data); 
  
      // closing FileOutputStream and 
      // ObjectOutputStream 
      myObjectOutStream.close(); 
      myFileOutStream.close(); 
    } catch (IOException e) { 
      e.printStackTrace(); 
    } 
  }

  @SuppressWarnings("unchecked")
  private void loadData() {
    try { 
      FileInputStream fileInput = new FileInputStream("c:/Users/jduong/OneDrive - Simcoe County District School Board/Documents/CS/ICS4U/Serializable/movieDB.txt"); 
  
      ObjectInputStream objectInput = new ObjectInputStream(fileInput); 
  
      data = (HashMap<String, DataOb>)objectInput.readObject(); 
  
      objectInput.close(); 
      fileInput.close(); 
    } catch (Exception e) { 
      e.printStackTrace(); 
    } 
  }

  public void printMap() {
    @SuppressWarnings("rawtypes")
    Iterator it = data.entrySet().iterator();
    while (it.hasNext()) {
      @SuppressWarnings("rawtypes")
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println(pair.getKey() + " = " + ((DataOb)pair.getValue()).title + "(" + ((DataOb)pair.getValue()).rating + " *)");
      it.remove();
    }
  }
}
