package com.class32_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test_Card {
	public static void main(String[] args) {
		
		CreditCard visa=new Visa("Visa");
		CreditCard master=new MasterCard("MasterCard");
		CreditCard amex=new Amex("Amex");
		
		ArrayList<CreditCard> obj=new ArrayList(Arrays.asList(visa,master,amex));
		
		
		Iterator<CreditCard> it=obj.iterator();
		while(it.hasNext()) {
			CreditCard a=it.next();
			a.annualFee();
		}
		
		for(CreditCard card:obj) {
			System.out.println(card.creditCardName);
			card.interestRate();
		}
		
	}

}
