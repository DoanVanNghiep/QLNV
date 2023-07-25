package ChuongTrinhQuanLyNhanVien;

import java.util.Scanner;

// tien luong cua nhan vien 
public class Salary extends Human{
	static double salary1day;
	static int ngayLam;
	static double fullSalary;
	
	public void inputSalary(){
		Scanner employee = new Scanner(System.in);
		System.out.println("Enter number of working days:");
		ngayLam = employee.nextInt();
		
		System.out.println("enter this 1 salary do:");
		salary1day = employee.nextDouble();
	}
	public double calSalary() {
		if(ngayLam<=20) {
			return fullSalary = salary1day*ngayLam;
		}
		if(ngayLam<=25) {
			return fullSalary = salary1day*ngayLam+salary1day;
		}
		if(ngayLam<=29)
		{
			return fullSalary = salary1day*ngayLam+salary1day*2;
		}
		else {
			return fullSalary = salary1day*ngayLam+salary1day*3;
		}
	}
	
}
