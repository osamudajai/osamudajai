package kitadm.bank2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;
import kitadm.Account;

public final class AccountNoGENERATOR {
	private static HashSet<String> accountNoList = new HashSet<String>();
	
	public static String genAccountNo() {
		String accNo = null;
		Random r = new Random();
		
		do {
		int xxx = r.nextInt(100)+100;
		String s_xxx = String.format("%03d", xxx);
		
		int yy = r.nextInt(100);
		String s_YY = String.format("%02d", yy);
		
		int zzzz = r.nextInt(9900)+100;
		String s_zzzz = String.format("%04d", zzzz);
		
		accNo = String.format("%s-%s-%s", s_xxx,s_YY,s_zzzz);
		}
		while(!accountNoList.add(accNo));
		return accNo;
	}
}
