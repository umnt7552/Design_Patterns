package Step3;

public class Step3Test {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.swim();
		
		System.out.println("-----------------------");
		
		FakeDuck duck2 = new FakeDuck();
		duck2.quack();
		duck2.display();
		duck2.swim();
		
//		인터페이스로 메서드를 구현하게 되면 그 메서드에 대한 코드 재사용성을 기대할 수 없게 된다. 각 구현된 클래스 내에서 다른 방식으로 작동할 수도 있기 때문에 일일이 다 찾아 수정해야되는 경우도 발생 -> Step4
	}
}
