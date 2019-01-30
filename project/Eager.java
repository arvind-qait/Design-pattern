package project;
public class Eager  
{ 
  
  public static Eager instance = new Eager(); 
  
  private Eager() 
  { 
	  
  } 
  public void show() {
	  System.out.println("Eager show");
  }
} 
