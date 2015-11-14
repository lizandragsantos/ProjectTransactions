package application;
import bank.*;

import java.util.Date;

import transaction.CompoundTransaction;
import transaction.Transaction;

public class AppTransaction implements Transaction {
	
	private BankTransaction adaptee;
	
	
	public AppTransaction(BankTransaction adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void Execute() {
		adaptee.Process();
	}

	@Override
	public Date GetDate() {
		return adaptee.getDate();
	}

	@Override
	public Boolean Executed() {
		return adaptee.Processed();
	}

	@Override
	public CompoundTransaction getCompuond() {
		return null;
	}

	public String toString(){
		return this.adaptee.toString();
	}
}
