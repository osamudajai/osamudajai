package kitadm.bank2;

public class invalidTransactionException extends Exception {
	public invalidTransactionException(String message) {
		super(message);
	}
	
	public invalidTransactionException() {
		super("부적절한 거래가 발생 됐습니다.");
		
	}
}
