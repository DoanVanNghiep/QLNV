package ChuongTrinhQuanLyNhanVien;

public class TaxCalculator extends Salary {	
	static double tax = 0.0;
	
	public static double calculateTax() {

	        if (fullSalary <= 5000000) {
	            tax = 0.0;
	        } else if (fullSalary <= 10000000) {
	            tax = fullSalary * 0.1;
	        } else if (fullSalary <= 20000000) {
	            tax = fullSalary * 0.2;
	        } else {
	            tax = fullSalary * 0.3;
	        }

	        return tax;
	    }
}
