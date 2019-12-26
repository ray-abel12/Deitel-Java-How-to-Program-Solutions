package abstact;

public class ConcreteSubclass extends AbstactSubclass {
	@override
	void test2() {
		System.out.println("test2");
	}
	
	@override
	void test3() {
		System.out.println("test3");
	}
	public static void main(String... args) {
	ConcreteSubclass sub = new ConcreteSubclass();
	sub.test1();
	sub.test2();
	sub.test3();
}
	}
