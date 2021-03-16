package ro.ase.csie.cts.sem3;

public class DebitBankAccount extends BankAccount implements Payable, Receivable {

	
	public DebitBankAccount(String iban, Person accountHolder,long balance) {
		this.iban=iban;
		this.balance=0;
		this.accountHolder=accountHolder;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
	
	
	// METODE
	
	//retragere
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount> balance) {
			throw new InsuficientFundsException("Insuficient funds "+ balance);
		}
		System.out.println("withdrawing "+ amount +" from " +iban);
		balance-=amount;
	}
	
	//depundere
	@Override
	public void deposit(long amount) {
		System.out.println("depositing "+ amount +" from " +iban);
		balance+=amount;
	}

	
	
}