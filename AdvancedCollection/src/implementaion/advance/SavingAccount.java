//class savingaccount
package implementaion.advance;

public class SavingAccount {

	private double acc_balance;
	private int acc_id;
	private String accountHolderName;
	private boolean isSalaryAccount;

	public SavingAccount(double acc_balance, int acc_id, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(acc_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + acc_id;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SavingAccount))
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(acc_balance) != Double.doubleToLongBits(other.acc_balance))
			return false;
		if (acc_id != other.acc_id)
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	public double withDraw(double ammount) {
		return acc_balance;

	}
	public double deposit(double ammount) {
		return acc_balance;

	}

	/*@Override
	public int compareTo(SavingAccount arg0) {
		
		return this.getAcc_id().comapareTo(sa.getAcc_id());
	}*/

}


	

	
	

	

	





















