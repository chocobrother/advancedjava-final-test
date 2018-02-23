package prob03;

public class Money {

	private int amount;
	
    int result;
    
    int receive;
    
	public Money(int amount) {
		
		this.amount = amount;
		
	}
    
	@Override
	public String toString() {
		String to = Integer.toString(amount);
		return to;
	}

	
	
	public String add(Money m) {
		receive = m.amount;
		
		result = this.amount + receive;
		
		String s = Integer.toString(result);
			
		return s;
		
	}

	public String minus(Money m) {
		receive = m.amount;
		
		result = this.amount - receive;
		
		String s = Integer.toString(result);

		return s;
	}
	
	public String multiply(Money m) {
		receive = m.amount;
		
		result = this.amount * receive;
		
		String s = Integer.toString(result);
		
		
		return s;
	}
	
	public String devide(Money m) {
		
		receive = m.amount;
		
		result = this.amount / receive;
		
		String s = Integer.toString(result);

		return s;
	}
}
