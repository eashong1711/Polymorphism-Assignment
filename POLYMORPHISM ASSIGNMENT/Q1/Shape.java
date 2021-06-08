

/**  The Superclass shape has the common properties of all shapes*/
 class Shape {
	 //private member variable
	 private String color;
	 
	 /** Construction of a shape instance with a given color */
	 public Shape (String color) {
		 this.color = color;
	 }
   /**  Expect to return a self descriptive string*/
	 @Override
	 public String toString() {
		 return "Shape[color=" + color + "]";
	 }
		 /**We want all shapes to provide a method called getArea() */
	    public double getArea() {
	    	System.err.println("What shape is it! Otherwise cannot compute area!");
	    	return 0;
	    }
	 }
	 
    /** The Rectangle class which is a subclass of Shape */
   class Rectangle extends Shape {
	   private int length, width;
	   
	/** Construction of a Rectangle instance from a given color, lengt and width*/
	 public Rectangle(String color, int length, int width) {
	 super(color);
	 this.length = length;
	 this.width = width;
	  }
 /**Expect to returns a self-descriptive string */
	 @Override
	 public String toString() {
		 return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() +	"]"; }
	 
   
   /** Overriding the inherited getArea() to provide the proper implementation for Rectangle */
   @Override 
   public double getArea() {
	   return length*width;
   }
   }
	
   /**The Triangle class is a subclass of Shape */
   class Triangle extends Shape {
	   // Private member variables
	   private int base, height;
	   
   /** Construction of a Triangle instance with a given color,base and height */
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	/** Expect to returns a self-descriptive string */
	@Override
	public String toString() {
		return "Triangle[base=" + ",height=" + height + "," + super.toString() + "]";
		}
			/** Overriding the inherited getArea() to provide the proper implementation for Triangle */
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
	}
   
   /** Inserting a test driver for shape and its subclasses */
    class TestShape {
	   public static void main(String[] args) {
		   Shape s1 = new Rectangle("red", 5, 5);  //upset
		   System.out.println(s1);  //Run Rectangle's getArea()

		   //Rectangle[length=2,width=6,Shape[color=red]]
		   System.out.println("Area is " + s1.getArea()); //Run Triangle's getArea()
		   
		   
		   Shape s2 = new Triangle("blue", 3, 5);  //upset
		   System.out.println(s2);  //Run Triangle's getArea()
//Rectangle[base=3,height=5,Shape[color=blue]]
		   System.out.println("Area is " + s2.getArea()); //Run Triangle's getArea()
		  
	   }
   
}

