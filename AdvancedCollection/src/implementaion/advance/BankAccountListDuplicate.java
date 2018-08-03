//class bankaccountlist which will maintain the objects with no duplicate values and sorted order
package implementaion.advance;

import java.util.*;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class BankAccountListDuplicate {

	public static void main(String[] args) {
		// to remove the duplicate values
		Set<Object> set = new LinkedHashSet<>();
		set.add(new SavingAccount(1000000, 102, "sangeeta", true));
		set.add(new SavingAccount(100000, 101, "john", true));
		set.add(new SavingAccount(100000, 101, "john", true));
		set.stream().forEach((list1) -> System.out.println(list1));

		System.out.println("\n");
		// to sort the data based on accound id
		ArrayList arr = new ArrayList();
		arr.add(new SavingAccount(1000000, 102, "sangeeta", true));
		arr.add(new SavingAccount(100000, 101, "john", true));
		arr.add(new SavingAccount(1000, 103, "sam", false));
		arr.add(new SavingAccount(1000, 103, "sam", false));
		Collections.sort(arr, new SortByID());
		arr.stream().forEach((list2) -> System.out.println(list2));

	}

}
