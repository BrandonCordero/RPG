// creates a sub-class called Weapon from the Super class Item
public class Weapon extends Item {
  // properties of weapon class
  private int damage;
   // constructor
  public Weapon (int weight,  
                String name,
                int damage) {
    super(name, weight);
    this.damage = damage;
  }
    // methods getters/setters
  public int getDamage() {
    return this.damage;
  }
  
  public void setDefense(int damage) {
    this.damage = damage;
  }
   
}
