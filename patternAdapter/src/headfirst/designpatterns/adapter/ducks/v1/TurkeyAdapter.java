package headfirst.designpatterns.adapter.ducks.v1;

//                                    IS-A
public class TurkeyAdapter implements Duck {
	
	//HAS-A
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	@Override
	public void quack() {
		turkey.gobble(); //<== Pattern Adapter
	}
  
	@Override
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
