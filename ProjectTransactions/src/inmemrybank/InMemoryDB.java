package inmemrybank;

import java.util.HashMap;
import java.util.Map;

import bank.Account;
import bank.BankTransaction;

public class InMemoryDB {

	private static InMemoryDB instance = null;

	private Map<Long, BankTransaction> bankTransactionMap;
	private Map<Long, Account> accountMap;
	private InMemoryDB() {
		super();
		this.bankTransactionMap = new HashMap<>();
		this.accountMap = new HashMap<>();
	}
	
	public static InMemoryDB getInstance() {

		if (InMemoryDB.instance == null)
			InMemoryDB.instance = new InMemoryDB();

		return InMemoryDB.instance;
	}

	public Map<Long, BankTransaction> getBankTransactionMap() {
		return bankTransactionMap;
	}

	public Map<Long, Account> getAccountMap() {
		return accountMap;
	}
	

}
