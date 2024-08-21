package com.curso.v1;

import java.util.Optional;

public class Principal2 {

	public static void main(String[] args) {
		
		Integer value = Integer.valueOf(5);

		Optional o = (value == null) ? Optional.empty() : Optional.of(value);
		
		Object other = o.get();
	}

}
