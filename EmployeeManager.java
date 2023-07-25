package ChuongTrinhQuanLyNhanVien;
// máy e bị lỗi phông chữ nên e dùng đa phần là tiếng anh thầy thông cảm ạ.

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager extends Employee
{
	
	private static int count;
	
    private static Employee[] employees;
	
	public static void addEmployee() {
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
	
	System.out.println("Employee's position:");
	chucVi = inFor.nextLine();
	
	inFor.nextLine();
	System.out.println("Departmental staff:");
	phongBan = inFor.nextLine();
	
	inFor.nextLine();
	System.out.println("Affiliated Blocks:");
	khoi = inFor.nextInt();
	
	System.out.println("Enter number of working days:");
	ngayLam = inFor.nextInt();
	
	System.out.println("enter this 1 salary do:");
	salary1day = inFor.nextDouble();
	
	
	
	employees[count] = new Employee(chucVi,phongBan,khoi,fullName,address,id);
    count++;

     System.out.println("Successfully added employee!");
	}
	public static void inputList() {
		Scanner input = new Scanner(System.in);
		//nhap thong tin nhan vien 
		System.out.println("Enter the number of employees:");
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0;i < n;i++) {
			System.out.printf("Enter employee information(%d):",i+1);
			
			System.out.print("Input employee fullname:");
			fullName = input.nextLine();
			
			input.nextLine();
			System.out.print("Input employee address:");
			address = input.nextLine();
			
			input.nextLine();
			System.out.print("Input employeeID:");
			id = input.nextInt();
			
			System.out.println("Employee's position:");
			chucVi = input.nextLine();
			
			input.nextLine();
			System.out.println("Departmental staff:");
			phongBan = input.nextLine();
			
			input.nextLine();
			System.out.println("Affiliated Blocks:");
			khoi = input.nextInt();
			
			System.out.println("Enter number of working days:");
			ngayLam = input.nextInt();
			
			System.out.println("enter this 1 salary do:");
			salary1day = input.nextDouble();
			
			 employees[count] = new Employee(chucVi,phongBan,khoi,fullName,address,id);
		     count++;
			}		
		System.out.println("Enter the list of successful employees!");
		
	}
	public static void outputList() {
		System.out.println("");
		for(int i=0;i<count;i++) {
			Employee employee = employees[i];
			employee.outputInfor();
			System.out.println();
		}
	}
	public static void employeeSearch() {
		Scanner sreach = new Scanner(System.in);
		
		System.out.println("Enter the employee's name to search:");
		String fullName = sreach.nextLine();
		
		boolean timKiem = false;
		for(int i=0;i<count;i++) {
			Employee employee = employees[i];
			if(employee.fullName.equals(fullName)) {
				employee.outputInfor();
				timKiem = true;
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner nhanVien = new Scanner(System.in);
		employees = new Employee[100];
		count = 0;
		
		int choice;
		
		do {
			System.out.println("===Employee manager===");
			System.out.println("1.Add Employee");
			System.out.println("2.Enter a list of employees");
			System.out.println("3.Print a list of employees");
			System.out.println("4.Looking for employees");
			System.out.println("5.Exit");
			System.out.println("Enter your selection:");
			choice = nhanVien.nextInt();
			
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				inputList();
				break;
			case 3:
				outputList();
				break;
			case 4:
				employeeSearch();
				break;
			case 5:
				System.out.println("End program!");
				break;

			default:
				System.out.println("Invalid selection.Please re-enter!");
				break;
			}
		}while(choice!=5);
		
		nhanVien.close();
				
	}
}
