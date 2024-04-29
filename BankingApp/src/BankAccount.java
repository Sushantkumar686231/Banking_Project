import java.io.Serializable;
import java.time.LocalDate;
public class BankAccount implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int accountno;
private String fname;
private String lname;
public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

private AccountType actype;
private LocalDate dob;
private LocalDate creationdate;
private int balance;

@Override
public String toString() {
	return "BankAccount [accountno=" + accountno + ", fname=" + fname + ", lname=" + lname + ", actype=" + actype
			+ ", dob=" + dob + ", creationdate=" + creationdate + ", balance=" + balance + "]";
}

public BankAccount(int accountno, String fname, String lname, AccountType actype,
		LocalDate dob, LocalDate creationdate,
		int balance) {
	super();
	this.accountno = accountno;
	this.fname = fname;
	this.lname = lname;
	this.actype = actype;
	this.dob = dob;
	this.creationdate = creationdate;
	this.balance = balance;
}

/*
 * @Override public int compareTo(Object o) { BankAccount b=null; if(o
 * instanceof BankAccount) { b=(BankAccount)o; //return
 * this.getAccountno()==b.accountno; } return this.getAccountno()-b.accountno;
 * 
 * }
 */

public int getAccountno() {
	return accountno;
}

public void setAccountno(int accountno) {
	this.accountno = accountno;
}

}
