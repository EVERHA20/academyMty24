package com.curso.v1;

public class CalculoFinanciero {
	
	//@Autowired
	CalculoFinancieroCloud cfc;

    double calcula(long principal, int years, float annualRate, byte compoundingsPerYear) {
        return cfc.calculoExterno(principal,years,annualRate,compoundingsPerYear);
    }

}

