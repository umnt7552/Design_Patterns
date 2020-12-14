package Step1;

public abstract class Duck {
	protected void quack() {
		System.out.println("quack");
	}
	
	protected void swim() {
		System.out.println("swim");
	}
	
	abstract void display(); 
}
