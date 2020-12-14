package Step2;

public abstract class Duck {
	protected void quack() {
		System.out.println("quack");
	}
	
	protected void swim() {
		System.out.println("swim");
	}
	
	protected void fly() {
		System.out.println("fly");
	}
	
	
	abstract void display(); 
}
