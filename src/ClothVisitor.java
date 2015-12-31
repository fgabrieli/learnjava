
class ClothVisitor implements MyVisitor {
  private static int prodNumber = 0;
  
  ClothVisitor() {
    // Nothing to do here
  }
  
  public Cloth visit(Object clothObj) {
    Cloth cloth = (Cloth) clothObj;
    System.out.println("I am visiting: " + cloth.getName());
    
    cloth.setId(prodNumber++);
    
    return cloth;
  }
}