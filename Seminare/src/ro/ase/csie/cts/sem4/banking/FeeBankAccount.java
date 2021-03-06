package ro.ase.csie.cts.sem4.banking;

public class FeeBankAccount extends DebitBankAccount {
	
	
	//comision
	private long fee=2;

	public FeeBankAccount(NotificationService notificationService,String iban, Person person, long balance) {
		super(notificationService, iban, person,balance);
		
	}
	
	public FeeBankAccount(NotificationService notificationService,String iban, Person person) {
		super(notificationService, iban, person);
		
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding "+ fee +" fee to withdrawal");
		super.withdraw(amount+fee);
	}
	

}
