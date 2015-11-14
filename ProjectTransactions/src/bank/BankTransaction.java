package bank;

import java.math.BigDecimal;
import java.util.Date;

public interface BankTransaction extends DomainObject {

	public Date getDate();
	
	public Boolean Processed();
	
	public BigDecimal getAmount();
	
	public Account getSource();
	
	public Account getTarget();
	
	public void Process();
}
