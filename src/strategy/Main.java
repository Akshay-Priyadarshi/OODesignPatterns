package strategy;

/**
 * STRATEGY PATTERN
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable. Strategy
 * lets the algorithm vary independently from clients that use it.
 *
 * This patter states to favor composition over inheritance
 * has a > is a 
 */

public class Main {
	public static void main(String[] args) {
		IEatStrategy e1 = new EatStrategy1();
		IEatStrategy e2 = new EatStrategy2();
		IFlyStrategy f1 = new FlyStrategy1();
		IFlyStrategy f2 = new FlyStrategy2();
		IQuackStrategy q1 = new QuackStrategy1();
		IQuackStrategy q2 = new QuackStrategy2();
		
		// f1 e1 q1
		Duck d1 = new Duck(f1,e1,q1);
		// f1 e1 q2
		Duck d2 = new Duck(f1,e2,q2);
		// f1 e2 q1
		Duck d3 = new Duck(f2,e1,q2);
		
		// d1
		d1.flyBehaviour.fly();
		d1.eatBehaviour.eat();
		d1.quackBehaviour.quack();
		
		// d2
		d2.flyBehaviour.fly();
		d2.eatBehaviour.eat();
		d2.quackBehaviour.quack();
		
		// d3
		d3.flyBehaviour.fly();
		d3.eatBehaviour.eat();
		d3.quackBehaviour.quack();
	}
}
