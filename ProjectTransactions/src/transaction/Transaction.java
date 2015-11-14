package transaction;

import java.util.Date;

public interface Transaction {
	
	public void Execute();
	
	public Date GetDate();
	
	public Boolean Executed();
	
	public CompoundTransaction getCompuond();

}
