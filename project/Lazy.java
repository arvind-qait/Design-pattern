package project;

public class Lazy  
{ 
  
  private static Lazy instance; 
  
  private Lazy()  
  { 
    
  } 
  
  public void show() {
	  System.out.println("Lazy show");
  }
  
  
  public static Lazy getInstance()  
  { 
    if (instance == null)  
    { 
        instance = new Lazy(); 
    } 
    return instance; 
  } 
} 
