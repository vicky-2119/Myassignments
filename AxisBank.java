package week4.day2Assingments;

public class AxisBank extends Bankinfo{
	public void deposit() {
		System.out.println("deposit");
	}
 public static void main(String[] args) {
	 AxisBank bank=new AxisBank();
	 bank.saving();
	 bank.fixed();
	 bank.fixed();
	 bank.deposit();
}
}
