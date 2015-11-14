package bank;

import java.math.BigDecimal;
import java.util.Date;

public class Transference extends BankTransactionImplement {

	public Transference(Account source, Account target, BigDecimal amount,
			Date date, Long id) {
		super(source, target, amount, date, id);
		// TODO Auto-generated constructor stub
	}
	
	public void Process(){
		this.getSource().Debit(this.getAmount());
		this.getTarget().Credit(this.getAmount());
		this.setProcessed();
	}
	
	public String toString(){
		String d = "Tranference";
		return d.concat(" "+this.getDate().toString());
	}
}
