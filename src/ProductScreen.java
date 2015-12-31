import java.util.Iterator;
import java.util.List;

public class ProductScreen {
  ProductScreen(List clothes) {
    Iterator<Cloth> it = clothes.iterator();
    while (it.hasNext()) {
      Cloth cloth = it.next();
      cloth.registerObserver(this);
    }
  }

  public void changed(Object o) {
    Cloth cloth = (Cloth) o;

  }
}
