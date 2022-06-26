package strategy;

public class FlyStrategy1 implements IFlyStrategy{

	public FlyStrategy1() {
	}

	@Override
	public void fly() {
		System.out.println("Fly strategy 1");
	}

}
