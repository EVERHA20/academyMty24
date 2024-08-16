package com.curso.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		String[] cadenas = {"Tercio","andronico","777","Filologo"};
		
		//Arrays.sort(cadenas);
		//System.out.println(Arrays.toString(cadenas));
		
		List<String> listaCadena = Arrays.asList(cadenas);
		
		Collections.sort(listaCadena);
		
		for(String cadena:listaCadena)
			System.out.println(cadena);
		
		//777, Filologo, Tercio, andronico
		
	}

}
