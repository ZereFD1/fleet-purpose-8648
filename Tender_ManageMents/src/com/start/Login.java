package com.start;

import java.util.Scanner;


public class WelCome {
	
	public static void main(String[] args) {
		
		System.out.println("====================================");
		System.out.println("||  	Tender Manager System     ||");
		System.out.println("||                                ||");
		System.out.println("=====================================");
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(true && flag) {
			
			
			Display ds = new Display();
			ds.displayInterface();
			System.out.println("Enter number From Above");
			String dat = sc.next();
			//int data = Integer.parseInt(dat);
			
		if(Integer.parseInt(dat) == 1) {
			SignInVender s = new SignInVender();
				try {

					System.out.println("Enter your UserName Or EmailID");
					String username = sc.next();
					
					System.out.println("Enter your password");
					String password = sc.next();
					
					VenderDao ven = new VenderDaoImpl();
					
					Vandor v = ven.signInVender(username, password);
					
					
					if(v!=null) {
						System.out.println("  SingIn Sucessfully   ");
						System.out.println("Welcome "+v.getName());
						System.out.println("====================================");
						System.out.println("||                                ||");
						System.out.println("|| 1 See All Tender               ||");
						System.out.println("|| 2 Back                         ||");
						System.out.println("|| 3 exit                         ||");
						System.out.println("||                                ||");	
						System.out.println("=====================================");
						
					}
					else
					{
						System.out.println("Please Register First");
						break;
					}
					
					
					
					int sdata = sc.nextInt();
					
					if(sdata == 1) {
						
						DetailsOfAllTender da = new DetailsOfAllTender();
						da.main(args);
						
					}
					
					else if(sdata == 2) {
						break;
					}
					else if (sdata ==3) {
						flag = false;
						break;
					}
					
					else {
						System.out.println("Enter Current Details");
					}
					
					
							
				} catch (VendorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		 if (Integer.parseInt(dat) == 2 && flag) {	
			
			System.out.println("-------------------------------------------------");
			System.out.println(" Enter Admin UserName");
			String user = sc.next();
			System.out.println("Enter Admin Password");
			String pass = sc.next();
			
			while (user.equals("admin") &&  pass.equals("password")) {
				
				System.out.println("====================================");
				System.out.println("|| 1 Add Tender                   ||");
				System.out.println("|| 2 Remove Tender                ||");
				System.out.println("|| 3 See All Tender               ||");
				System.out.println("|| 4 Back                         ||");
				System.out.println("|| 5 exit                         ||");
				System.out.println("=====================================");
				
				System.out.println("Enter Number from Above");
				String st  = sc.next();
				
				int t = Integer.parseInt(st);
				
				if(t == 1) {
					AddTander td = new AddTander();
					td.main(args);
				}
				else if(t == 2) {
					
					RemoveTenderBYName td = new RemoveTenderBYName();
					td.main(args);
				}
				else if(t == 3) {
					
					DetailsOfAllTender da = new DetailsOfAllTender();
					da.main(args);
				}
				else if (t == 4) {
					continue;
				}
				else if(t == 5)
				{
					flag = false;
					break;
				}
				else
				{
					System.out.println("Enter Valid Details");
				}
			}	
		}
		else if (Integer.parseInt(dat) == 3) {
			
			System.out.println("Register of Vender");
			
			AddVendor av = new AddVendor();
			av.main(args);
		}
		else if (Integer.parseInt(dat) == 4) {
			break;
		}
//		else
		{
			System.out.println("Check Above and Enter Correct Number");
		}
	}
		System.out.println("Thank You  To Visting ");
		
	}
	

}