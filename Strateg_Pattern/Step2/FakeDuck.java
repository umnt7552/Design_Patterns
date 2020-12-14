package Step2;

public class FakeDuck extends Duck{

	@Override
	void display() {
		System.out.println("This is a Fake Duck");
	}

	@Override
	protected void fly() {
		System.out.println("Fake dock can't fly");
	}

	@Override
	protected void swim() {
		System.out.println("Fake dock can't swim");
	}

	@Override
	protected void quack() {
		System.out.println("BBICK");
	}
}
