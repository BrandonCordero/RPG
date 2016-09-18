public class homeworkOneTest
{
  public static void main(String args[])
  {
    
    // giving variables a name and weight
    
    Item phone = new Item("Brandon's Phone", 1);
    
    // storing value
    Weapon sword = new Weapon(10, "Sword",15);
    Armor helmet = new Armor(5, "Helmet", 20);
    Food apple = new Food (1, "Apple", 1, 1);
      
      // Item class Name and weight (getters)
    System.out.println( phone.getName()     );
    System.out.println( "Phone's weight");
    System.out.println(      phone.getWeight()     );
    
    // Weapon class Name,weight, and damage (getters)
    System.out.println( sword.getName());
    System.out.println(" Sword's weight");
    System.out.println(      sword.getWeight()     );
    System.out.println(" Sword's Damage");
    System.out.println( sword.getDamage());
    
    // Armor class name, weight, defense (getters)
    System.out.println( helmet.getName());
    System.out.println("Helmet's weight");
     System.out.println(      helmet.getWeight()     );
     System.out.println("Helmet's defense");
     System.out.println( helmet.getDefense());

    // Food class name, weight, nutrition, quantity (getters)
    System.out.println( apple.getName());
    System.out.println( "Apple's weight");
    System.out.println(      apple.getWeight()     );
     System.out.println( "Apple's nutrition");
    System.out.println( apple.getNutrition());
     System.out.println( "Apple quantity");
    System.out.println( apple.getQuantity());
    
    // testing setters
   apple.setQuantity(2);
    // testing getters
   System.out.println( "Apple's new Quantity");
    System.out.println(   apple.getQuantity()        );
    
    
   
   
  }
}