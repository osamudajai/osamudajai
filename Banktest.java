	package kitadm.bank2;
	
	import java.util.Random;
	import java.util.Scanner;
	import kitadm.bank2.BankManager;
	import kitadm.bank2.AccountNoGENERATOR;
	import kitadm.bank2.Account2;
	
	public class Banktest{
		//private Account accounts [] ;
		Random rd = new Random();
		
		
	public static void main(String[]args) throws RecordNotFoundException {//�����Լ��Դϴ�.
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
			}//����ġ
		}//����
	}//���� Ŭ����
	
	private void mainmemu() {
		System.out.println("-----------------");
		System.out.println("[KITA BANK]");
		System.out.println("-----------------");
		System.out.println("1.������");
		System.out.println("2.����Ȯ��");
		System.out.println("3.�Ա�");
		System.out.println("4.���");
		System.out.println("5.�� ���� Ȯ��");
		System.out.println("99. ���");
		System.out.println("���Ͻô� �� �����ϼ���");
	}
	
	public static Account2 creatAccout() {
		AccountNoGENERATOR ace = new AccountNoGENERATOR();
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String C_name = sc.nextLine();
		System.out.println("������ �Է��ϼ���");
		int C_age = sc.nextInt();
		sc.nextLine();
		System.out.println("�ּ��� �Է��ϼ���");
		String C_address = sc.nextLine();
		Customer CCC = new Customer(C_name,C_age,C_address);
		//������
		//Scanner sc2 = new Scanner(System.in);
		//72~���»���
		System.out.println("���� ��ȣ ������....");
		String accNo = ace.genAccountNo();
		System.out.println("���� �ܾ��� �Է����ּ��� :");
		int blance = sc.nextInt();
		Account2 a2 = new Account2(accNo, CCC , blance );
		System.out.println(" ");
		System.out.println("���� ��ȣ��" +accNo+"�̸�"+"���� �̸���"+CCC.getName()+"�Դϴ�."
		+"�����ܾ���"+blance+" �� �ǰڽ��ϴ�,");
		return a2;
	}

	
	
	public void showshow(BankManager bmm)throws RecordNotFoundException {
		bmm.searchAccount();
	}
}//Ŭ����