
 /**The superclass Monster defines the expected common behaviors for its subclasses.
  **/
  
      class Monster {

	 String name;
	
	/** Construction of a Monster instance with a given name */
   public Monster(String name) {
	   this.name = name;
   }
   
   /** defining a common behavior called attack() for all for all subclasses */
   
   public String attack() {
	   return "!^_&^$@+%$* I do not know how to attack!";
	   
   }
   }
    

//Subclass FireMonster

    class FireMonster extends Monster {
	   /**Constructs a FireMonster with the given name */
	   public FireMonster(String name) {
		   super(name);
	}
	   
 /** FireMonster subclass provides actual implementation for attack()  */
	  
	   @Override
	   public String attack() {
		   return "Attack with fire";
	   }
	   }
   
   
   // Subclass WaterMonster.java
    
    class WaterMonster extends Monster {
	   /** Construction of a WaterMonster instance with a given name  */
   public WaterMonster(String name) {
	   super(name);
	   }
   
   /**WaterMonster subclass provides the actual implementation for attack() */
   @Override
   public String attack() {
	   return "Attack with water!";
   }
   
   }
   
  //  Subclass StoneMonster.java
       class StoneMonster extends Monster {
	   /**Constructs a StoneMonster instance with the given name*/
	   public StoneMonster(String name) {
		   super(name);
 }
	   /** StoneMonster subclass provides actual implementation for attack() */
	   @Override
	   public String attack() {
		   return "Attack with stones!";
	   }
   }  
	   
   // A Test Driver TestMonster.java
      class TestMonster {
      public static void main(String[] args) {
	
	   Monster m1 = new FireMonster("r2u2"); //upcast
	   Monster m2 = new WaterMonster("u2r2");  //upcast
	   Monster m3 = new StoneMonster("r2r2");  //upcast
	   
	   // Invoke the actual Implementation
	   System.out.println(m1.attack());//Run FireMonster's attack()
	   
	   System.out.println(m2.attack()); //Run WaterMonster's attack()
	   
	   System.out.println(m3.attack()); //Run StoneMonster's attack()
       
	   
	   
	   //We have a problem here!!!
	   Monster m4 = new Monster("u2u2");
	   System.out.println(m4.attack()); //garbage!!!
	   // !^_&^$@+%$* I do not know how to attack!
   }
   }


