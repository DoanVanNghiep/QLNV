package ChuongTrinhQuanLyNhanVien;

import java.util.Scanner;

public class Employee extends TaxCalculator {
	static String chucVi;
	static String phongBan;
	static int khoi;
	
	public Employee() {
		
	}
	public Employee(String chucVi,String phongBan,int khoi) {
		this.chucVi=chucVi;
		this.phongBan=phongBan;
		this.khoi=khoi;
	}
	public Employee(String chucVi,String phongBan,int khoi,String fullName,String address,int id) {
		this.chucVi=chucVi;
		this.phongBan=phongBan;
		this.khoi=khoi;
		this.fullName=fullName;
		this.address=address;
		this.id=id;
	}
	public void inputInfor() {
		//nhap thong tin nhan vien
		Scanner employee = new Scanner(System.in);
		
		super.inputInformation();
		
		System.out.println("Employee's position:");
		chucVi = employee.nextLine();
		
		employee.nextLine();
		System.out.println("Departmental staff:");
		phongBan = employee.nextLine();
		
		employee.nextLine();
		System.out.println("Affiliated Blocks:");
		khoi = employee.nextInt();
		super.inputSalary();
		 
	}
	public void outputInfor() {
		super.outputInformation();
		System.out.println("Employee's position:"+chucVi);
		System.out.println("Departmental staff:"+phongBan);
		System.out.println("Affiliated Blocks:"+khoi);
		System.out.println("Employee's salary for 1 month:"+calSalary());
		System.out.println("1 month salary after tax calculation:"+calculateTax());
	}
}
