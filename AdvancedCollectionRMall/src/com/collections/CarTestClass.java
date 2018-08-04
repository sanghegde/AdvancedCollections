package com.collections;

import java.util.HashMap;
import java.util.function.Predicate;

public class CarTestClass {
	public static void main(String[] args) {

		Parked_CarOwnerList list = new Parked_CarOwnerList();
		Location location = new Location();

		// creating objects for Parked_Owner_Details
		Parked_CarOwner_Details detail1 = new Parked_CarOwner_Details("manasa", 2017, "KA0478", 812379998, "Mysore");
		Parked_CarOwner_Details detail2 = new Parked_CarOwner_Details("sangi", 2017, "KA0576", 781379998, "Mangalore");
		Parked_CarOwner_Details detail3 = new Parked_CarOwner_Details("mangi", 2017, "KA0598", 23784998, "Bangalore");
		Parked_CarOwner_Details detail4 = new Parked_CarOwner_Details("naksha", 2017, "MH0488", 8467898, "Mumbai");

		/*
		 * HashMap<Integer, Object> map = new HashMap<Integer, Object>(); map.put(1,
		 * detail1); map.put(2, detail2); map.put(3, detail3);
		 */

		// adding elements to list
		list.add_new_car(detail1);
		list.add_new_car(detail2);
		list.add_new_car(detail3);
		list.add_new_car(detail4);

		list.display();
		boolean findByName = list.findByCarno("KA0576");
		if (findByName) {
			String carno = "KA0576";
			list.verify();
			// location.verify();

			System.out.print("Parked at floor" + list.floor + " section ->");
			System.out.print(list.section);

		} else
			System.out.println("Not found");

	}

}
