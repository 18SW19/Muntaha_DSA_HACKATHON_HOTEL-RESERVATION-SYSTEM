import java.util.*;
import java.util.LinkedList;
class HotelReservation 
{
      

     public static void main(String [] args)
     {
	     
	     	 Scanner scan = new Scanner (System.in);
	          int search;
	     System.out.println("\n\n****************************************\n");
	     System.out.println("\t\t1 : Booking Room ");
	     System.out.println("\t\t2 : Food Corner ");
	     System.out.println("\t\t3 : Exit");
	      System.out.println("\n\n****************************************\n");
	     int input=scan.nextInt();
	      switch (search)
	      {
	      	case 1:
	      	{
	      		Room(); 
	      		break;
	      	}
	      	case 2:
	      	{
	      		Food();
                break;
	      	}
      
         }
     }
	
}
class Room
{
	//LinkedList <String> = new Linkedlist<>();
    
	int Array [] = {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Rooms Number");
	for(int i=0;i<Array.length;i++)
	{
	    System.out.println(Array[i]);
    }
	public void findRoom()
    {
    	int room;
    	Scanner in= new Scanner(System.in);
    	for ( room=0;room<Array[i].length ;room++) {
    		System.out.println("Choose your room");
    		Array[room]=in.nextInt();

    	}
   
    }
}	
      
 public class Food
 {
 	Scanner f= new Scanner (System.in);
 	LinkedList<String> list = new LinkedList<>();
 	

 	list.add("MENU");
 	list.add("Burger");
 	list.add("PAsta");
 	list.add("Pizza");
 	list.add("Biryani");
    System.out.println(list);
    
     

 } 


