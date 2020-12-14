package Step4;

public class Step4Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.SetFlyBehavior(new FlyWithWings());
		duck.SetQuackBehavior(new Squack());
		duck.performFly();
		duck.performQuack();
	}
}
