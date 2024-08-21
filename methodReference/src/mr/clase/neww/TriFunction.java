package mr.clase.neww;

@FunctionalInterface
public interface TriFunction<T,U,V,X> {
	
	//UN SOLO METODO ABSTRACT
	X apply(T t,U u,V v);
	
	//n Default, n Static, n Private
	
}
