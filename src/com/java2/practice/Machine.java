package com.java2.practice;

import java.util.ArrayList;
import java.util.List;

public class Machine {

	List<Drink> drink = new ArrayList<>();

	public void no() {
		for (int a = 0; a < drink.size(); a++) {
			Drink d = drink.get(a);
			System.out.println(d.getId() + "." + "\t" + d.getName() + "\t" + d.getPrice());

		}
	}

}
