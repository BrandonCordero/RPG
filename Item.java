import java.util.Random;
// Creating Item Class
public class Item {
  
  // properties 
  private String name;
  private int weight;  
  
  // constructer
  public Item(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  // Methods:

  // getters/setters
   public String getName() {
    return this.name;
  }
  
  public int getWeight() {
    return this.weight;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
//  prints discription of item (name and weight)
  public void examine()
  {
    System.out.println("Name: "+this.name);
    System.out.println("Weight: "+weight);
  }
}
  