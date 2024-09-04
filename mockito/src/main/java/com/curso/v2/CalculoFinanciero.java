package com.curso.v2;

public class CalculoFinanciero {
	
	private CalculoFinancieroCloud cfc;
	
	//@Autowired
    public CalculoFinanciero(CalculoFinancieroCloud cfc) {
		this.cfc = cfc;
	}

	double calcula(long principal, int years, float annualRate, byte compoundingsPerYear) {
        return cfc.calculoExterno(principal,years,annualRate,compoundingsPerYear);
    }

}

