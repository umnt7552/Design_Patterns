package Step2;

public class Step2Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();
		
		System.out.println("------------------------------");
		
		Duck duck2 = new FakeDuck();
		duck2.quack();
		duck2.swim();
		duck2.display();
		duck2.fly();
		
//		상속받은 클래스에서 메소드 내용 변경이 필요할 때는 오버라이딩이 필요하다 -> Step3
	}
}
