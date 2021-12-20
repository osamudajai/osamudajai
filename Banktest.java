	package kitadm.bank2;
	
	import java.util.Random;
	import java.util.Scanner;
	import kitadm.bank2.BankManager;
	import kitadm.bank2.AccountNoGENERATOR;
	import kitadm.bank2.Account2;
	
	public class Banktest{
		//private Account accounts [] ;
		Random rd = new Random();
		
		
	public static void main(String[]args) throws RecordNotFoundException {//메인함수입니다.
		BankManager bmm = new BankManager();
		Scanner sc = new Scanner(System.in);
		Account2 a2 =  null;
		Banktest bts = new Banktest();
		
		
		
			while(true) {
				bts.mainmemu();
				
			int num = sc.nextInt();
			switch(num) {
			
			case 1 :
				
				a2 = bts.creatAccout();
				bmm.creatAccount(a2);
				break;
			
			case 2 :
				bts.showshow(bmm);
				break;
				
			case 3 : 
		
				break;
				
			case 4 :  
			
				break;
				
			case 99 : System.exit(0);
			break;
			}//스위치
		}//와일
	}//메인 클레스
	
	private void mainmemu() {
		System.out.println("-----------------");
		System.out.println("[KITA BANK]");
		System.out.println("-----------------");
		System.out.println("1.고객생성");
		System.out.println("2.계좌확인");
		System.out.println("3.입금");
		System.out.println("4.출금");
		System.out.println("5.고객 전부 확인");
		System.out.println("99. 취소");
		System.out.println("원하시는 걸 선택하세요");
	}
	
	public static Account2 creatAccout() {
		AccountNoGENERATOR ace = new AccountNoGENERATOR();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String C_name = sc.nextLine();
		System.out.println("나이을 입력하세요");
		int C_age = sc.nextInt();
		sc.nextLine();
		System.out.println("주소을 입력하세요");
		String C_address = sc.nextLine();
		Customer CCC = new Customer(C_name,C_age,C_address);
		//고객생성
		//Scanner sc2 = new Scanner(System.in);
		//72~계좌생성
		System.out.println("계좌 번호 생성중....");
		String accNo = ace.genAccountNo();
		System.out.println("계좌 잔액을 입력해주세요 :");
		int blance = sc.nextInt();
		Account2 a2 = new Account2(accNo, CCC , blance );
		System.out.println(" ");
		System.out.println("계좌 번호는" +accNo+"이며"+"계좌 이름은"+CCC.getName()+"입니다."
		+"계좌잔액은"+blance+" 가 되겠습니다,");
		return a2;
	}

	
	
	public void showshow(BankManager bmm)throws RecordNotFoundException {
		bmm.searchAccount();
	}
}//클레스