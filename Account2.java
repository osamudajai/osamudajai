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
	
	public int deposit(int amount) {//입금의 함수 설정입니다. deposit은 amount값을 가지는데 
		balance += amount; //밸런스는 어마운트값을 더하고 나오는것을 정의합니다.
		return balance;// 밸런스로 돌아갑니다.
	}
	
	public int withdraw(int amount2) throws invalidTransactionException{//출금의 값을 만들어 보겠습니다.
		if(amount2>balance){
			throw new invalidTransactionException("출금금액이 부적절합니다.");
		}
		else {
			balance -= amount2;
		}
		return balance;// 밸런스로 돌아갑니다.
	}
	
	//이체
	//이체 금액과  이체를 받을 상대방 계좌 정보 (ACCOUNT 객체)를  매개변수로 받아서
	//이체를 처리한다.
	//단, 이체금액이 현재 잔고보다 많으면 invalidTransactionException이거 발생한다.
	//이체 이름은 transfer
	
	public int transfer (int transfermoney , Account2 Account3) throws invalidTransactionException{
		if(transfermoney > balance){
			throw new invalidTransactionException("출금금액이 부적절합니다.");
		}
		else {
			balance -= transfermoney;
			Account3.deposit(transfermoney);
			
		}
		return balance;
	}
}
