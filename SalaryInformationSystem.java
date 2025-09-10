import java.util.*;
class SalaryInformationSystem{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	 L1:System.out.println("------------- SALARY INFORMATION SYSTEM -------------");
		System.out.println("\n\n\t[1] Calculate Income Tex");
		System.out.println("\t[2] Calculate Annual Bonus");
		System.out.println("\t[3] Calculate Loan Amount");
		
		System.out.print("\n\nEnter an Option yo Continue : ");
		int o=input.nextInt();

		switch(o){
		case 1:{
			System.out.println("\n\n------------- Calculate Income Tex -------------");
			System.out.print("\n\nEnter Employee Name : ");
			input.nextLine();
			String n=input.nextLine();
			System.out.print("Enter Employee Salary : ");
			int s=input.nextInt();
			int tax;
				if(s<=100000){
					System.out.println("You Have To Pay Income Tax Per Month : You dont have to pay tax");
				}else if(s<=141667){
					tax=(int)((s-100000)*0.06);
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}else if(s<=183333){
					tax=(int)(2500+((s-141667)*0.12));
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}else if(s<=225000){
					tax=(int)(7500+((s-183333)*0.18));
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}else if(s<=266667){
					tax=(int)(15000+((s-225000)*0.24));
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}else if(s<=308333){
					tax=(int)(25000+((s-266667)*0.30));
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}else{
					tax=(int)(37500+((s-308333)*0.36));
					System.out.println("You Have To Pay Income Tax Per Month : "+tax);
				}
			}break;
		case 2:{
			System.out.println("\n\n------------- Calculate Annual Bonus -------------");
			System.out.print("\n\nEnter Employee Name : ");
			input.nextLine();
			String n=input.nextLine();
			System.out.print("Enter Employee Salary : ");
			int s=input.nextInt();
				if(s<=100000){
					System.out.println("Annual Bonus : 5000.0");
				}else if(s<=199999){
					int x=s-100000;
					x*=0.1;
					System.out.println("Annual Bonus : "+x);
				}else if(s<=299999){
					int x=s-199999;
					x*=0.15;
					System.out.println("Annual Bonus : "+x);
				}else if(s<=399999){
					int x=s-299999;
					x*=0.2;
					System.out.println("Annual Bonus : "+x);
				}else{
					int x=s-399999;
					x*=0.35;
					System.out.println("Annual Bonus : "+x);
					}
			}break;
		case 3:{
			System.out.println("\n\n------------- Calculate Loan Amount -------------");
			System.out.print("\n\nEnter Employee Name : ");
			input.nextLine();
			String na=input.nextLine();
			System.out.print("Enter Employee Salary : ");
			int s=input.nextInt();
			System.out.print("Enter Number Of Year : ");
			int y=input.nextInt();
			if(s>=50000){
				double la;
				double n;
				n=y*12;
				double r;
				r=15.0;
				double i;
				i=s*0.6;
				la=i*(1-1/Math.pow((1+(r/12)),n)/r/12);
				System.out.print(la);
			}else{
				System.out.println("You Cant Get Loan");
				}
			}break;
		default:
			System.out.println("Wrong Option");

		
		}
	}
}
