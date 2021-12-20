package kitadm.bank2;

import java.util.ArrayList;

/* 1.계좌를 등록하는 메서드 (고객 등록)
 * 2.계좌 검색 ( 고객 정보 출력 ) 
 * 3.계좌 삭제
 * 4.입금
 * 5.출금
 * 6.계좌이체
 * 7.등록 계좌 정보 반환
 * 8.
 * 
 * 
 * 
 * */
public class BankManager {
	private ArrayList<Account2> accountList = new ArrayList<Account2>();
	//1.계좌 등록
	public void creatAccount(Account2 a2) {
		accountList.add(a2);
	}
	
	
	public void searchAccount() throws RecordNotFoundException {
		if(accountList.isEmpty()){
			try {
				
				throw new RecordNotFoundException();
			}
			catch(Exception e){
				System.out.println( "계좌 정보가 없습니다.");
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
