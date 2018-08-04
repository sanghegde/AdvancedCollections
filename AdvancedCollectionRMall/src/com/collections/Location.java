package com.collections;

//Location class
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Location {
	
	
	int token = 0;
	int section = 1;
	int floor = 1;
	HashMap<Integer, Object> map = new HashMap<Integer, Object>();
	Set<Parked_CarOwner_Details> set = new LinkedHashSet<>();

	public void find(Parked_CarOwner_Details ownercarno) {
		map.put(1, ownercarno);
		verify();

		System.out.println(ownercarno.getCarNo() + " added to floor" + floor + " at section" + section
				+ " with token no=" + token);
	}

	// function for checking space to park
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
