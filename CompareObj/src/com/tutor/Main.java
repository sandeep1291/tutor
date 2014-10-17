package com.tutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Customer;

public class Main {

	public static void main(String[] args) {
		final Customer c1 = new Customer("praveen", "dande", 32);
		final Customer c2 = new Customer("pavan", "nomula", 80);
		final Customer c3 = new Customer("sandeep", "muparaju", 45);

		List<Integer> intList = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(1);
				add(2);
				add(10);
				add(4);
			}
		};

		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);

		ArrayList<Customer> customers = new ArrayList<Customer>() {
			private static final long serialVersionUID = 1L;
			{
				add(c1);
				add(c2);
				add(c3);
			}
		};
		System.out.println(customers);

		Collections.sort(customers);

		System.out.println(customers);

	}
}
