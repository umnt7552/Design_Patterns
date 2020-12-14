package Step1;

public class Step1Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.display();
		// 만약 fly()라는 기능이 추가된다면? -> Step2
	}
}
