import java.util.*;
// import java.util.io;
class HotelReservation 
{
      

     public static void main(String [] args)
     {
	     
	     	 Scanner scan = new Scanner (System.in);
	          int search;
	          int room;
	          int [] arr= new int[5];
	          PriorityQueue q=new PriorityQueue();
	     System.out.println("\n\n\t\t****************************************\n");
	     System.out.println("\t\t\tHOTEL RESERVATION SYSTEM");    
	     System.out.println("\n\n\t\t****************************************\n");
	     System.out.println("\t\t1 : Booking Room ");
	     System.out.println("\t\t2 : Food Corner ");
	     System.out.println("\t\t3 : Exit");
	     System.out.println("\n\n\t\t****************************************\n");


          System.out.println("Enter your choice");
	      search=scan.nextInt();

	      switch (search)
	      {
	      	case 1:
	      	{
                System.out.println("Rooms Number");
	            arr  = new int [] { 1 , 2 , 3 , 4 ,5,6,7,8 , 9 , 10} ;
	            

	             for(int i=0;i<arr.length;i++)
	             {
	                   System.out.println(arr[i]+"\t");
	             }
	             System.out.println("Enter your choice");
	             room = scan.nextInt();
                     if(room==1)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 1");
                     }

                     if(room==2)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 2");
                     }
                     if(room==3)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 3");
                     }
                     if(room==4)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 4");
                     }
                     if(room==5)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 5");
                     }
                     if(room==6)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 6");
                     }
                     if(room==7)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 7");
                     }
                     if(room==8)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 8");
                     }
                     if(room==9)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 9");
                     }if(room==10)
                     {
                     	System.out.println("Congractulation your room is booked");
                     	System.out.println("Your room no is 10");
                     }  
                         
                       else System.out.println("Room is not available");
                     

                     break;
    	
             }
    
	      		
	      		
	      	
	      	case 2:
	      	{
	      			
 	

				 	System.out.println("**********MENU***************");
				 	System.out.println("1 :Burger     180");
				 	System.out.println("2 :Pasta      150");
				 	System.out.println("3 :Pizza      250");
				 	System.out.println("4 :Biryani    240");
				 	System.out.println("Enter your choice");
				 	int choice=scan.nextInt();

                     

				  
				    break;
	      	}
	      	case 3:
	      	{
	      		System.exit(0);
	      	}
	      	default :
	      	{
	      		System.out.println("Invalid Number");

	      	}
      
         }
     }
	
}



   
	
      
 
 
 
 
    
     




