package bank;

import java.math.BigDecimal;
import java.util.Date;

import javax.management.RuntimeErrorException;

public abstract class BankTransactionImplement extends DomainObjectImplement implements BankTransaction {

	private Account source;
	private Account target;
	private BigDecimal amount;
	private Date date;
	private Boolean processed;
	
	
		
	protected BankTransactionImplement(Account source, Account target,
			BigDecimal amount, Date date, Long id) {
			super(id);
		if(source == null)
			throw new RuntimeErrorException(null,"Campo, conta de origem obriatória");
		this.source = source;
		this.target = target;
		this.amount = amount;
		this.date = date;
		this.processed = false;
	}


	@Override
	public Date getDate() {
		return this.date;
	}

	@Override
	public Boolean Processed() {
		return this.processed;
	}

	@Override
	public BigDecimal getAmount() {
		return this.amount;
	}

	@Override
	public Account getSource() {
		return this.source;
	}

	@Override
	public Account getTarget() {
		return this.target;
	}

	protected void setProcessed() {
		this.processed = true;
	}
	
	

}
