package bank;

import java.math.BigDecimal;

import javax.management.RuntimeErrorException;

public class Account extends DomainObjectImplement {

	private BigDecimal balance;
	private Number number;

	public Account(Long id, BigDecimal balance, Number number) {
		super(id);
		if(number == null)
			throw new RuntimeErrorException(null,"Campo numero obrigatório");
		this.balance = BigDecimal.ZERO;
		this.number = number;
	}


	public BigDecimal getBalance() {
		return balance;
	}
	
	public void Debit(BigDecimal amount){
		this.balance = this.balance.subtract(amount);
	}
	public void Credit(BigDecimal amount){
		this.balance = this.balance.add(amount);
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}
	
}
