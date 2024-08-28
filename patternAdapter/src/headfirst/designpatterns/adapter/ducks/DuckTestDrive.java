package headfirst.designpatterns.adapter.ducks;


public class DuckTestDrive {
	public static void main(String[] args) {
		//INSTANCIA DEL PATO
		Duck duck = new MallardDuck();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);

		//INSTANCIA DEL PAVO
		Turkey turkey = new WildTurkey();
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		//ADAPTER
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("\nThe TurkeyAdapter  says...");
		testDuck(turkeyAdapter);
		
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
