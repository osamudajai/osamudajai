package kitadm.bank2;

public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String message) {
	super(message);
	}
	public RecordNotFoundException() {
		super("���ڵ带 ��ã�ҽ��ϴ�");
	}
}
