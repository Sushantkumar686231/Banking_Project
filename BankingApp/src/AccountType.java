
public enum AccountType {
FD(901020),CURRENT(250000),SAVING(1000000),LOAN(1100),DMAT(11002);

	private int minBalance;
private AccountType(int minBalance) {
	this.minBalance=minBalance;
}
	
}
