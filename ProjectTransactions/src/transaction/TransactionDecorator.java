package transaction;

import java.util.Date;

public abstract class TransactionDecorator implements Transaction {
	
	private Transaction component;
	
	public TransactionDecorator(Transaction component) {
		this.component = component;
	}

	@Override
	public void Execute() {
		this.component.Execute();

	}

	@Override
	public Date GetDate() {		
		return this.component.GetDate();
	}

	@Override
	public Boolean Executed() {		
		return this.component.Executed();
	}

	@Override
	public CompoundTransaction getCompuond() {
		return this.component.getCompuond();
	}

	public String toString(){
		return this.component.toString();
	}

	

	
	
	
}
