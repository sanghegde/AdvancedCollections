//sortbyis comaparator method
package implementaion.advance;

import java.util.Comparator;

public class SortByID implements Comparator<SavingAccount> {

	@Override
	public int compare(SavingAccount a, SavingAccount b) {

		return a.getAcc_id() - b.getAcc_id();
	}

}
