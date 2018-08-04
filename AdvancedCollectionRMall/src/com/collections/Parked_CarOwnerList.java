package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Parked_CarOwnerList {
	int token = 1;
	int section = 1;
	int floor = 1;

	Set<Parked_CarOwner_Details> set = new LinkedHashSet<>();

	// method to add new car
	public void add_new_car(Parked_CarOwner_Details ownercarno) {
		set.add(ownercarno);
		verify();
		System.out.println(ownercarno.getCarNo() + " added to floor" + floor + " at section" + section
				+ " with token no=" + token);

	}

	// method to remove car
	public void remove_car(String carno) {
		// creating predicate
		Predicate<Parked_CarOwner_Details> removecar = Parked_CarOwner_Details -> Parked_CarOwner_Details.getCarNo()
				.equals(carno);
		set.removeIf(removecar);
	}

	public boolean findByCarno(String carno) {
		Predicate<Parked_CarOwner_Details> findcar = Parked_CarOwner_Details -> Parked_CarOwner_Details.getCarNo()
				.equals(carno);
		return set.stream().anyMatch(findcar);
	}

	// method to get car location
	public void get_parked_car_location(int token, int floor, int section) {

	}

	public void display() {
		// creating consumer
		Consumer<Parked_CarOwner_Details> disp = Parked_CarOwner_Details -> System.out.println(Parked_CarOwner_Details);
		set.stream().forEach(disp);
	}

	// method to check conditions
	public void verify() {
		token++;
		if (token > 2) {
			token = 0;
			section++;

		}
		if (section > 4) {
			section = 1;
			floor++;
		}
		if (floor > 3) {
			System.out.println("No space");
		}
	}

}
