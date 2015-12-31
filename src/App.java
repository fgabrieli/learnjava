import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
  private static ClothVisitor clothVisitor = new ClothVisitor();
  
  public static void main(String[] args) {
    List<Cloth> clothList = new LinkedList<Cloth>();
    
    clothList.add(new Cloth("Blue tshirt"));
    clothList.add(new Cloth("Red tshirt"));
    clothList.add(new Cloth("Yellow tshirt"));

    // visit
    Iterator<Cloth> it = clothList.iterator();
    while (it.hasNext()) {
      Cloth c = it.next();
      clothVisitor.visit(c);
    }
    
    // print after visiting
    Iterator<Cloth> it2 = clothList.iterator();
    while (it2.hasNext()) {
      Cloth c = it2.next();
      System.out.println("Id=" + c.getId());
    }
  }
}
