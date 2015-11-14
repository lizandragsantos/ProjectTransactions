package transaction;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.management.RuntimeErrorException;

public class TransactionManager {
	
	private List<Transaction> executed = new ArrayList<>();
	private List<Transaction> notexecuted = new ArrayList<>();
	
	public void AddTransaction(Transaction t){
		if (!notexecuted.contains(t))
			notexecuted.add(t);
		else
		throw new RuntimeErrorException(null, "Transação Já Existe");
	}
	public void RemoveTransaction(Transaction t){
		if (notexecuted.contains(t))
			notexecuted.remove(t);
		else
		throw new RuntimeErrorException(null, "Transação não Existe");
	}
	public Iterator<Transaction> getExecuted() {
		return executed.iterator();
	}
	public Iterator<Transaction> getNotexecuted() {
		return notexecuted.iterator();
	}
	public void ExecuteTransactions(){
		Date data = new Date();
	    List<Transaction> aux = new ArrayList<>();
		for (Transaction t : notexecuted) {
			if(!data.after(t.GetDate())){
				t.Execute();
				aux.add(t);
			}
		}
		for (Transaction a : aux) {
			executed.add(a);
			notexecuted.remove(a);
		}	
	}
	
	public void ClearExecutedTransactions(){
		if(executed == null || executed.isEmpty())
			executed.removeAll(executed);
	}
}
