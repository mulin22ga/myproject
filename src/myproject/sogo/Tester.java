package myproject.sogo;

import java.beans.Customizer;
import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		// Customer c1 = new Customer(10000);
		// SilverCustomer c2 = new SilverCustomer(10000);

		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));

		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}

		ArrayList<Integer> list = new ArrayList<>();// <>泛型
		list.add(94);// 0
		list.add(87);// 1
		list.add(55);// 2
		list.add(4);
		int n = list.get(2);
		int n2 = list.get(3);
		System.out.println(list.get(1));
		System.out.println(list.size());// 有幾個
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Customer c1 = new Customer(1000);
		c1.print();
		SilverCustomer c2 = new SilverCustomer(1000);
		c2.print();
	}

}
