package Bank.Application;

import java.util.Scanner;

public class MainPage {
     public static void main(String[] args) {
		boolean quit=false;
		 int bal=0, amt, pass;
		Scanner sc=new Scanner(System.in);
		  System.out.println("<<<<<<<<<<<<<<<<  WELCOME  >>>>>>>>>>>>>>>>");
		  System.out.println();
		  
		  System.out.println("      **Select language to proceed**");
		  System.out.println();
	      System.out.println("Press    E for English     |   H for हिंदी   |  M for मराठी");
	      String input = sc.next();
	      System.out.println();
	    
	      
	      //********************************ENGLISH**********************
	      
	      
			if(input.equals("E")) {
			  System.out.println("    **Please Fill up the following details to proceed**");
			  System.out.println();
		      System.out.println("Enter your name: ");
		      String name=sc.next();
		      System.out.println();
		      System.out.println("Enter branch name");
		      String bname=sc.next();
		      System.out.println();
		      System.out.println("Enter bank account number");  
		      int id =sc.nextInt();
		      System.out.println();
		      System.out.println("is your account saving or current..?");
		      String type= sc.next();
		      System.out.println();
		      System.out.println("Enter Password");
		      pass=sc.nextInt();
		      System.out.println();
		      System.out.println();
		    
		    
		      do {
		      System.out.println("    **Select any operation from the menu given below**");
		      System.out.println();
		      System.out.println();
		      System.out.println("Menu");
		      System.out.println();
		      System.out.println("Press 1 to Deposite");
		      System.out.println();
		      System.out.println("Press 2 to Withdraw");
		      System.out.println();
		      System.out.println("Press 3 to Show all details");
		      System.out.println();
		      System.out.println("Press 4 to Check balance");
		      System.out.println();
		      System.out.println("Press Y to change lahnguage");
		      String lang=sc.next();
		      System.out.println();
		      System.out.println("Press E for exit");
		      String input1=sc.next();
		      if(input1.equals("1")) {
		                System.out.println("Enter deposite amount:");
		    			 amt = sc.nextInt();
		    			if (amt < 0) {
		    				System.out.println("Invalid Amount");
		    				
		    			}
		    			 bal = bal + amt;
		    			 System.out.println("Amount deposited succesfully...");
		    			 System.out.println();
		    			 System.out.println();
		             }
		      if(input1.equals("2")) {
		    	  System.out.println("Your Current Balance =" + bal);
		    	  System.out.println();
		  		  System.out.print("Enter withdraw amount:");
		  		  amt = sc.nextInt();
		  		    if (bal < amt) {
		  			  System.out.println("Insufficient balance...");
		  			 System.out.println();
		  			 System.out.println();
		  			
		  		 }
		  		   if (amt < 0) {
		  			  System.out.println("Invalid Amount");
		  			  System.out.println();
		  			  System.out.println();
		  			
		  		}
		  		   if(bal==500) {
		  			   System.out.println("Money cant be withdrawn... Minimum balance must be 500");
		  			   System.out.println();
		  		       System.out.println();
		  		   }else {
		  		    bal = bal - amt;
		  		        System.out.println("After withdrawal current bal is :"+bal);
		  		        System.out.println();
		  		        System.out.println();
		  		   }
		  	    }
		      
		      if(input1.equals("3")) {
		    	 System.out.println("Showing your details...");
		    	 System.out.println();
		    	 System.out.println("Name : "+name);
		    	 System.out.println();
		    	 System.out.println("Branch: "+bname);
		    	 System.out.println();
		    	 System.out.println("Account Number: "+id);
		    	 System.out.println();
		    	 System.out.println("Account Type: "+type);
		    	 System.out.println();
		    	 
		      }
		      if(input1.equals("4")) {
		    	  System.out.println("Enter password to check balance");
		    	int   pass1=sc.nextInt();
		    	  if(pass1==pass) {
		    		  System.out.println("Your current balance is :"+bal);
		    		  System.out.println();
		    		  System.out.println();
		    	  }
		    	  
		      }
		      if(input1.equals("E")) {
		    	  quit=true;
		    	  System.out.println();
		    	  System.out.println("               Thank you fro visiting... Have a great day ahed...");
		      }
		    	 
		      }while(!quit);
		      
			}
		      
		      
			//*********************************HINDI**************************************
		      
		      
		      
		      
			if(input.equals("H")) {
				System.out.println("    **कृपया आगे बढ़ने के लिए निम्नलिखित विवरण भरें**");
				  System.out.println();
			      System.out.println("अपना नाम दर्ज करें: ");
			      String hname=sc.next();
			      System.out.println();
			      System.out.println("शाखा का नाम दर्ज करें");
			      String hbname=sc.next();
			      System.out.println();
			      System.out.println("बैंक खाता क्रमांक दर्ज करें");  
			      int hid =sc.nextInt();
			      System.out.println();
			      System.out.println("आपका खाता सेविंग है या चालू है..?");
			      String htype= sc.next();
			      System.out.println();
			      System.out.println("पासवर्ड दर्ज करें");
			      pass=sc.nextInt();
			      System.out.println();
			      System.out.println();
			    
			    
			      do {
			      System.out.println("    **नीचे दिए गए मेनू से किसी भी ऑपरेशन का चयन करें**");
			      System.out.println();
			      System.out.println();
			      System.out.println("मेनू");
			      System.out.println();
			      System.out.println("पैसे जमा करने के लिए 1 दबाएं");
			      System.out.println();
			      System.out.println("पैसे निकालने के लिए 2 दबाएं");
			      System.out.println();
			      System.out.println("सभी विवरण दिखाने के लिए 3 दबाएं");
			      System.out.println();
			      System.out.println("बैलेंस चेक करने के लिए 4 दबाएं");
			      System.out.println();
			      System.out.println("बाहर निकलने के लिए E दबाएं");
			      String input1=sc.next();
			      if(input1.equals("1")) {
			                System.out.println("जमा राशि दर्ज करें:");
			    			 amt = sc.nextInt();
			    			if (amt < 0) {
			    				System.out.println("अवैध राशि");
			    				
			    			}
			    			 bal = bal + amt;
			    			 System.out.println("राशि सफलतापूर्वक जमा की गई...");
			    			 System.out.println();
			    			 System.out.println();
			             }
			      if(input1.equals("2")) {
			    	  System.out.println("आपका वर्तमान शेष =" + bal);
			    	  System.out.println();
			  		  System.out.print("निकालने राशि दर्ज करें:");
			  		  amt = sc.nextInt();
			  		    if (bal < amt) {
			  			  System.out.println("अपर्याप्त शेषराशि...");
			  			 System.out.println();
			  			 System.out.println();
			  			
			  		 }
			  		   if (amt < 0) {
			  			  System.out.println("अपर्याप्त शेषराशि");
			  			  System.out.println();
			  			  System.out.println();
			  			
			  		}
			  		   if(bal==500) {
			  			   System.out.println("पैसा नहीं निकाला जा सकता... न्यूनतम शेष राशि 500 ​​होनी चाहिए");
			  			   System.out.println();
			  		       System.out.println();
			  		   }else {
			  		    bal = bal - amt;
			  		        System.out.println("निकासी के बाद वर्तमान शेष है :"+bal);
			  		        System.out.println();
			  		        System.out.println();
			  		   }
			  	    }
			      
			      if(input1.equals("3")) {
			    	 System.out.println("आपकी जानकारी दिखाई जा रही है...");
			    	 System.out.println();
			    	 System.out.println("नाम : "+hname);
			    	 System.out.println();
			    	 System.out.println("शाखा: "+hbname);
			    	 System.out.println();
			    	 System.out.println("खाता क्रमांक: "+hid);
			    	 System.out.println();
			    	 System.out.println("खाते का प्रकार: "+htype);
			    	 System.out.println();
			    	 
			      }
			      if(input1.equals("4")) {
			    	  System.out.println("बैलेंस चेक करने के लिए पासवर्ड डालें");
			    	int   pass1=sc.nextInt();
			    	  if(pass1==pass) {
			    		  System.out.println("आपका वर्तमान शेष है :"+bal);
			    		  System.out.println();
			    		  System.out.println();
			    	  }
			    	  
			      }
			      if(input1.equals("E")) {
			    	  quit=true;
			    	  System.out.println();
			    	  System.out.println("               पधारने के लिए धन्यवाद... आपका दिन शुभ रहे...");
			      }
			    	 
			      }while(!quit);
				
			}
   
			if(input.equals("M")) {
				System.out.println("Sorry for inconveninence...this part is under working");
			}
		    }
		
     }

		
	

