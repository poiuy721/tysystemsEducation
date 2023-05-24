package ch10;

import cafe.ade.LemonAde;
import cafe.ade.OrangeAde;
import cafe.coffee.Americano;
import cafe.coffee.CafeLatte;

public class App {
	public static void main(String[] args) {
		LemonAde la=new LemonAde();
		la.println();
		
		OrangeAde oa=new OrangeAde();
		oa.println();
		
		Americano a=new Americano();
		a.println();
		
		CafeLatte c=new CafeLatte();
		c.println();
	}
}
