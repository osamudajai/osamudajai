package kitadm.bank2;

public class Account2 {
	private String accNo;
	private Customer owner;
	private int balance;

	public Account2(String accNo, Customer owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public Customer getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) {//�Ա��� �Լ� �����Դϴ�. deposit�� amount���� �����µ� 
		balance += amount; //�뷱���� ���Ʈ���� ���ϰ� �����°��� �����մϴ�.
		return balance;// �뷱���� ���ư��ϴ�.
	}
	
	public int withdraw(int amount2) throws invalidTransactionException{//����� ���� ����� ���ڽ��ϴ�.
		if(amount2>balance){
			throw new invalidTransactionException("��ݱݾ��� �������մϴ�.");
		}
		else {
			balance -= amount2;
		}
		return balance;// �뷱���� ���ư��ϴ�.
	}
	
	//��ü
	//��ü �ݾװ�  ��ü�� ���� ���� ���� ���� (ACCOUNT ��ü)��  �Ű������� �޾Ƽ�
	//��ü�� ó���Ѵ�.
	//��, ��ü�ݾ��� ���� �ܰ��� ������ invalidTransactionException�̰� �߻��Ѵ�.
	//��ü �̸��� transfer
	
	public int transfer (int transfermoney , Account2 Account3) throws invalidTransactionException{
		if(transfermoney > balance){
			throw new invalidTransactionException("��ݱݾ��� �������մϴ�.");
		}
		else {
			balance -= transfermoney;
			Account3.deposit(transfermoney);
			
		}
		return balance;
	}
}
