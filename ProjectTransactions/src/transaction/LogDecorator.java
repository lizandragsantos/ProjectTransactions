package transaction;


public class LogDecorator extends TransactionDecorator {

	public LogDecorator(Transaction component) {
		super(component);
	}

	public void Execute() {
		
		String msg = "";
		super.Execute();
		msg = this.toString();
		System.out.println(msg);

	}
}
