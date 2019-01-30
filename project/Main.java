package project;

public class Main {
 public static void main(String[] args) {
	 Eager ob = Eager.instance;
	 ob.show();
	 Lazy ob2 = Lazy.getInstance();
	 ob2.show();
	 Thread ob3 = Thread.getInstance();
	 ob3.show();
 }
}
