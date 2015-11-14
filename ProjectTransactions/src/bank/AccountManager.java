package bank;

import java.math.BigDecimal;

public interface AccountManager {
	
	public Account getAccount(Long id);
	
	public Account createNewAccount(Long id, BigDecimal balance, Number number);
	
	public void remove(Account a);
	
	public void insert(Account a);
	
	public void update(Account a);

}
