package kitadm.bank2;

public class invalidTransactionException extends Exception {
	public invalidTransactionException(String message) {
		super(message);
	}
	
	public invalidTransactionException() {
		super("�������� �ŷ��� �߻� �ƽ��ϴ�.");
		
	}
}
