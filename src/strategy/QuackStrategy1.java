package strategy;

public class QuackStrategy1 implements IQuackStrategy{

	public QuackStrategy1() {
	}

	@Override
	public void quack() {
		System.out.println("Quack strategy 1");
	}
	
}
