package inmemrybank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bank.*;


public class InMemoryBankTransactionManager implements BankTransactionManager {
	
	private static InMemoryBankTransactionManager instance = null;

	private InMemoryBankTransactionManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static InMemoryBankTransactionManager getInstance(){
		
		if(InMemoryBankTransactionManager.instance == null)
			InMemoryBankTransactionManager.instance = new InMemoryBankTransactionManager();
		
		return InMemoryBankTransactionManager.instance;
	}

	@Override
	public BankTransaction getBankTransaction(Long id) {
		
		return InMemoryDB.getInstance().getBankTransactionMap().get(id);
	
	}

	@Override
	public List<BankTransaction> getBankTransactionByDate(Date begin, Date end) {
		List<BankTransaction> bankTransaction = new ArrayList<>();
		List<BankTransaction> result = new ArrayList<>();
		bankTransaction = (List<BankTransaction>) InMemoryDB.getInstance().getBankTransactionMap().values();
		
		for (BankTransaction b : bankTransaction) {
			if((!(b.getDate().before(begin)) || ((!b.getDate().after(end)))))
					result.add(b);
		}
		return result;
	}

	@Override
	public BankTransaction createNewBankTransaction(Long id, Date date,
			Account source, Account target, BigDecimal amount,
			Boolean processed, String typecod) {
		
		if(typecod.equals("t"))
			return new Transference(source, target, amount, date, id);
		if(typecod.equals("d"))
			return new Deposit(source, amount, date, id);	

		return null;
	}

	@Override
	public void remove(BankTransaction b) {
		InMemoryDB.getInstance().getBankTransactionMap().remove(b);

	}

	@Override
	public void insert(BankTransaction b) {
		InMemoryDB.getInstance().getBankTransactionMap().put(b.getId(), b);

	}

	@Override
	public void update(BankTransaction b) {
		// TODO Auto-generated method stub

	}

}
