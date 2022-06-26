package strategy;

public class Duck {
	IFlyStrategy flyBehaviour;
	IEatStrategy eatBehaviour;
	IQuackStrategy quackBehaviour;
	
	public Duck(IFlyStrategy f,IEatStrategy e,IQuackStrategy q) {
		this.flyBehaviour = f;
		this.eatBehaviour = e;
		this.quackBehaviour = q;
	}
	

}
