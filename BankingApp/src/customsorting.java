import java.util.Comparator;

public class customsorting implements Comparator<BankAccount> {

	public customsorting() {
		super();
	}

	@Override
	public int compare(BankAccount o1, BankAccount o2) {

		return o1.getLname().compareTo(o2.getLname()) ;
	}

}
