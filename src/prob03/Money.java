package prob03;

public class Money {

	private int amount;
	
    private int result;
    
    private int receive;
    
	public Money(int amount) {
		
		this.amount = amount;
		
	}
    
	
//	@Override
//	public String toString() {
//		String to = Integer.toString(amount);
//		return to;
//	}

	
	
	public Money add(Money m) {

//		receive = m.amount;
//		
//		result = this.amount + receive;
		
		Money r = new Money(this.amount + m.amount);
			
		return r;
		
	}

	public Money minus(Money m) {
		
		Money r = new Money(this.amount - m.amount);
			
		return r;
	}
	
	public Money multiply(Money m) {
		
		Money r = new Money(this.amount * m.amount);
		
		return r;
	}
	
	public Money devide(Money m) {
		
		Money r = new Money(this.amount / m.amount);
		
		return r;
	}
}
