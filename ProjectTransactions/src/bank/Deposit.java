package bank;

import java.math.BigDecimal;
import java.util.Date;

public class Deposit extends BankTransactionImplement {

	public Deposit(Account source, BigDecimal amount,
			Date date, Long id) {
		super(source, null, amount, date, id);
		// TODO Auto-generated constructor stub
	}
	
	public void Process(){
		Deposit.this.getSource().Credit(this.getAmount());
		this.setProcessed();
			
	}
	
	public String toString(){
		String d = "Deposit";
		return d.concat(" "+this.getDate().toString());
	}
}
