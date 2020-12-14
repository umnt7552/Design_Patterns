package Step3;

public class FakeDuck extends Duck implements Quackable{

	@Override
	void display() {
		System.out.println("This is a FakeDuck");
	}

	@Override
	public void quack() {
		System.out.println("BBICK");
	}

}
