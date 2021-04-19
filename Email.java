package emailapp;

import java.util.Scanner;

public class Email {
      private String FirstName;
      private String lastName;
      private String password ;
      private String department;
      private String email;
      private int mailboxcapacity=500;
      private int defultpasswordlength=10;
      private String alternateEmail;
      private String companysuffix="ayecompany.com";
	private int i;
	

     // constructor to receive the first name and last namme
     public Email(String firstname,String lastname) {
    	   this.FirstName= FirstName;
    	   this.lastName= lastname;
    	
		System.out.println("EMAIL CREATED: "+this.FirstName+"  "+this.lastName);
	  
		// call a method asking for the department-return department
		this.department=setdepartment(); 
		System.out.println("department:"+ this.department);
		
		// call a method thats return a random password
		this.password=randompassword(defultpasswordlength);
		System.out.println("your password is:"+this.password);
		
		// combine elements to generate email
		 email=firstname.toLowerCase()+"."+lastname.toLowerCase()+ "@"+department+"."+companysuffix;
		 System.out.println("your email is:"+email);
     }
		
     // ask department
        private String setdepartment() {
		
		System.out.print("NEW WORKER:"+FirstName+".department codes:\n1 for sales\n2 for Developement\n3 for Accounting\n0 for none\nenter department codes ");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if  (depchoice== 1) { return "sales";}
		else if (depchoice==2) { return "dev";}
		else if (depchoice==3) { return "acc";}
		else {return"";}
        }
     // generate random password
        private String randompassword(int length) {
            String passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"	;
            char[] password	= new char [length];	
            for(int i=0;i<length;i++);
				int rand =(int)(Math.random() * passwordset.length());
			password [i]= passwordset.charAt(rand);
			System.out.println(rand);
			System.out.println( passwordset.charAt(rand));
			
        
        		            
               return new String (password);
}
        
     // set the maibox capacity
         public void setMailboxCapacity(int capacity) {
         this.mailboxcapacity=capacity;
         }
     // set the alternate mail
         public void setAlternateEmail(String altEmail) {
         this.alternateEmail= altEmail ;
         
         }
         
     // change the password
      public void changePassword(String password) {
    	  this.password=password;
      }
      public int getMailboxCapacity() {return mailboxcapacity;}
      public String getaltnateEmail() {return alternateEmail;}
      public String getpassword() {return password;}
      
      public String showsInfo(){
    	  return "DISPLAY NAME:" + FirstName + "" +lastName+
    			  "\nCOMPANY EMAIL:"+email+
    			  "\nMAILBOX CAPACITY:" + mailboxcapacity + "mb";
      }
      }
