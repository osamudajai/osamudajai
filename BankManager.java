package kitadm.bank2;

import java.util.ArrayList;

/* 1.���¸� ����ϴ� �޼��� (�� ���)
 * 2.���� �˻� ( �� ���� ��� ) 
 * 3.���� ����
 * 4.�Ա�
 * 5.���
 * 6.������ü
 * 7.��� ���� ���� ��ȯ
 * 8.
 * 
 * 
 * 
 * */
public class BankManager {
	private ArrayList<Account2> accountList = new ArrayList<Account2>();
	//1.���� ���
	public void creatAccount(Account2 a2) {
		accountList.add(a2);
	}
	
	
	public void searchAccount() throws RecordNotFoundException {
		if(accountList.isEmpty()){
			try {
				
				throw new RecordNotFoundException();
			}
			catch(Exception e){
				System.out.println( "���� ������ �����ϴ�.");
			}
		}
		else {
			for(int i = 0 ; i<accountList.size() ; i++) {
			System.out.println(accountList.get(i).getAccNo());
			System.out.println(accountList.get(i).getBalance());
			System.out.println(accountList.get(i).getOwner().getName());
			}
		}
	}
}
