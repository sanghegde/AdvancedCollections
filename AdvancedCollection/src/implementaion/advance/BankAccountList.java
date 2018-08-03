//class which contains 5 different objects in arraylist and displays the objects one by one
package implementaion.advance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BankAccountList {

	public static void main(String[] args) {
		ArrayList<SavingAccount> list = new ArrayList<SavingAccount>();
		SavingAccount sa1 = new SavingAccount(1000000, 101, "sangeeta", true);
		SavingAccount sa2 = new SavingAccount(100000, 102, "john", true);
		SavingAccount sa3 = new SavingAccount(1000, 103, "sam", false);
		SavingAccount sa4 = new SavingAccount(200000, 104, "geeta", true);
		SavingAccount sa5 = new SavingAccount(50000, 105, "ajam", false);

		list.add(sa1);
		list.add(sa2);
		list.add(sa3);
		list.add(sa4);
		list.add(sa5);

		list.stream().forEach((list1) -> System.out.println(list1));

	}

}
