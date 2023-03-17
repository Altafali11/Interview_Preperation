package codeit_preperation;
// code written by altaf
// methodoverriding eg
class Bank{
	 String bankName(String name) {
		return name;
	}
}
class Branch extends Bank{
	@Override
	 String bankName(String branch_name) {
		return branch_name;
	}
}
class ifscCode extends Bank{
	@Override
    String bankName(String ifsccode) {
		return ifsccode;
	}
}
public class Methodoverriding {
	public static void main(String[] args) {
		ifscCode i = new ifscCode();
		System.out.println(i.bankName("UNION001"));
	
		Bank b = new Bank();
		System.out.println(i.bankName("Union Bank"));
        
		Branch B = new Branch();
		System.out.println(i.bankName("Greater Noida"));
	}

}
