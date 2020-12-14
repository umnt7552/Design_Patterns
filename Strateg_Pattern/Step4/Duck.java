package Step4;


public abstract class Duck {
	FlyBehavior flyBehavior; // Fly행동 인터페이스 변수
	QuackBehavior quackBehavior; // Quack행동 인터페이스 변수
	
	public Duck() {
	}
	public void performQuack() {
		quackBehavior.quack(); // 행동 클래스에 위임함
	}
	
	public void performFly() {
		flyBehavior.fly(); // 행동 클래스에 위임함
	}
	
	public void SetFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void SetQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	abstract void display();
}
