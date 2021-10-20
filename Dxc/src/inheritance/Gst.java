package inheritance;

public class Gst extends IncomeTax {
	int calculate(int income) {
		int tax=super.calculateTax(income);
		if(income >10000) {
			tax=income/5;
		}
		return tax;
	}

}
