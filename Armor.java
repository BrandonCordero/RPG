// creates a sub-class called Armor from the Super class Item
public class Armor extends Item{
  // properties of armor class
  private int defense; 
  
  // constructor
  public Armor (int weight,  
                String name,
                int defense) {
    super(name, weight);
    this.defense = defense;
  }
    // methods getters/setters
  public int getDefense() {
    return this.defense;
  }
  
  public void setDefense(int defense) {
    this.defense = defense;
  }
   
}