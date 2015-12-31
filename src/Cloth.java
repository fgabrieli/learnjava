import java.util.LinkedList;
import java.util.List;

public class Cloth {
  private String name = "";
  private int id = 0;
  private List<Object> observers = new LinkedList<Object>(); 
  
  Cloth(String clothName) {
    name = clothName;
  }
  
  private void notifyObservers() {
    for (Object o : observers) {
      (Observer) observer.changed(this);
    }
  }

  public void registerObserver(Object observer) {
    observers.add(observer);
  }

  public String getName() {
    return name;
  }
  
  public void setId(int prodNumber) {
    id = prodNumber;
  }
  
  public int getId() {
    return id;
  }
}
