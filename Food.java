// creates a sub-class called Food from the Super class Item
public class Food extends Item {
  // properties of food class
  private int nutrition;
  private int quantity;
  // constructor
  public Food (int weight,  
                String name,
                int nutrition,
                int quantity) {
    super(name, weight);
    this.nutrition = nutrition;
    this.quantity = quantity;
  }
     // methods getter/setters
  
  public int getNutrition() {
    return this.nutrition;
  }
  
  public void setNutrition(int nutrition) {
    this.nutrition = nutrition;
  }
public int getQuantity() {
    return this.quantity;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
  
  