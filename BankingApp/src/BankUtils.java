import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;
import static java.time.LocalDate.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BankUtils {

	public static List<BankAccount> populateList()
	{
		
		//int accountno, String fname, String lname, AccountType actype,
		//LocalDate dob, LocalDate creationdate,
		//int balance
		List<BankAccount> accounts=new ArrayList<>();
		
		accounts.add(new BankAccount(101,"sushant","kumar", AccountType.FD 
				,parse("2000-03-24"),parse("2001-08-29"),10000));
		
		accounts.add(new BankAccount(105,"prashant","singh", AccountType.DMAT 
				,parse("1999-03-12"),parse("2021-08-29"),10000));
		
		accounts.add(new BankAccount(106,"akash","rajput",AccountType. LOAN 
				,parse("1991-03-12"),parse("2010-02-20"),10000));
		
		accounts.add(new BankAccount(102,"vinay","pathak",AccountType. CURRENT 
				,parse("1997-05-12"),parse("1991-04-21"),10000));
		
		accounts.add(new BankAccount(100,"lokesh","kumar",AccountType. SAVING
				,parse("1899-06-25"),parse("1999-06-29"),10000));
		
				return accounts;
	}
	
	public static void WriteSerialize(List<BankAccount> li,String FileName)
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FileName)))
		{
			for(BankAccount it:li)
			{
				oos.writeObject(it);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
