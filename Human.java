package ChuongTrinhQuanLyNhanVien;

import java.util.Scanner;

public class Human {
	//filed
	static String fullName;
	static String address;
	static int id;
	
	//method
	
	public Human() {
		
	}
	public Human(String fullName,String address,int id) {
		this.fullName=fullName;
		this.address=address;
		this.id=id;
	}
	public void inputInformation(){
		//nhap thong tin nhan vien
		Scanner inFor = new Scanner(System.in);
		
		System.out.print("Input employee fullname:");
		fullName = inFor.nextLine();
		
		inFor.nextLine();
		System.out.print("Input employee address:");
		address = inFor.nextLine();
		
		inFor.nextLine();
		System.out.print("Input employeeID:");
		id = inFor.nextInt();
		
		
	}
	public void outputInformation(){
		System.out.println("Employee fullname:"+fullName);
		System.out.println("Employee address:"+address);
		System.out.println("EmployeeID:"+id);
	}
	
	
}
