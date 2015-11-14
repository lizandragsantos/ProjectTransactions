package bank;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface BankTransactionManager {

	public BankTransaction getBankTransaction(Long id);
	
	public List<BankTransaction> getBankTransactionByDate(Date begin, Date end);
	
	public BankTransaction createNewBankTransaction(Long id, Date date, Account source, Account target, BigDecimal amount, Boolean processed, String typecod);

	public void remove(BankTransaction b);
	
	public void insert(BankTransaction b);
	
	public void update(BankTransaction b);
}
