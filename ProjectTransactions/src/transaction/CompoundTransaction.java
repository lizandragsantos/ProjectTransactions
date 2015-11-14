package transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CompoundTransaction implements Transaction {
	
	private Date date;
	private Boolean executed;
	private List<Transaction> children = new ArrayList<Transaction>();

	@Override
	public void Execute() {
		
		for (Transaction t : children) {
				t.Execute();
		}
		this.executed = true;
		
	}

	@Override
	public Date GetDate() {
		return this.date;
	}

	@Override
	public Boolean Executed() {
		return this.executed;
	}

	@Override
	public CompoundTransaction getCompuond() {
		return this;
	}
	public CompoundTransaction(Date date) {
		this.executed = false;
		this.date = date;
	}
	
	public void add(Transaction child) {
		if (!child.GetDate().after(date))
			children.add(child);
		else
			throw new RuntimeErrorException(null, "Não pode adicionar transação filha. Data posterior a da transação composta");
	}
	public void remove(Transaction child){
		if(children.contains(child))
			children.remove(child);
		else
			System.out.println("Transaçaõ não existe");
	}
	public Iterator<Transaction> getChildren(){
		return children.iterator();
	}

	public String toString() {
		String c = "";

		for (Transaction t : children) {

			c = c + "\n" + t.toString();
		}
		return c;
	}
	

}
