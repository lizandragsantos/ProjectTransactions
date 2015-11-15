package inmemrybank;

import java.math.BigDecimal;

import bank.Account;
import bank.AccountManager;

public class InMemoryAccountManager implements AccountManager {

	private static InMemoryAccountManager instance = null;
	
	private InMemoryAccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static InMemoryAccountManager getInstance(){
		
		if(InMemoryAccountManager.instance == null)
			InMemoryAccountManager.instance = new InMemoryAccountManager();
		
		return InMemoryAccountManager.instance;
	}

	@Override
	public Account getAccount(Long id) {
		
		return InMemoryDB.getInstance().getAccountMap().get(id);
	}

	@Override
	public Account createNewAccount(Long id, BigDecimal balance, Number number) {
		
		return new Account(id, balance, number);
	}

	@Override
	public void remove(Account a) {
		
		InMemoryDB.getInstance().getAccountMap().remove(a);

	}

	@Override
	public void insert(Account a) {
		
		InMemoryDB.getInstance().getAccountMap().put(a.getId(), a);

	}

	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub

	}

}
