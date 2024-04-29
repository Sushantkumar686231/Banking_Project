import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class BankApp {

	//private static final OutputStream FileOutputStream = null;

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
				List<BankAccount> account=BankUtils.populateList();
	
			boolean flag=false;
			
			while(!flag)
			{
				System.out.println("Options - 1.Create A/C \n" + "2. Display all accts \n" + 
						"3. Fetch A/C Summary\n"
						+ "4. Deposit\n" + "5. Withdraw\n" + "6. Money Transfer\n" + ""
								+ "7. Close A/C \n"
						+ "8. Sort the accounts as per asc order of account nos\n"
						+ "9. Sort the accounts as per asc order of balance\n"
						+ "10. Sort the accounts as per asc DoB n desc bal\n" + "0. Exit");
				System.out.println("Enter the choice");
				switch (sc.nextInt()) {
				case 1:
					//Collections.sort(account);
					break;
				case 2:
					for(BankAccount it:account)
					{
						System.out.println(it);
					}
					break;
				case 3:
					Collections.sort(account,new customsorting());
					break;
				case 4:
					//BankUtils.WriteSerialize(account,"abc");
					break;
				case 5:
					System.out.println("Enter the filename");
					String filename=sc.next();
					
					try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){

							oos.writeObject(account);
						
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;
				case 6:
					try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream("abc")) )
					{
						//account.
						
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;
	
				
					
				
				}
			}
		}
	}

}
