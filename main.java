package login;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean indicate=true;
		while(indicate) {
			System.out.println("1 register \n 2 login");
			System.out.println("enter your choice");
			int enter=s.nextInt();
			switch(enter) {
			case 1:{
				System.out.println("enter your name,password,email");
				String name=s.next();
				String password=s.next();
				String email=s.next();
				user user1=new user(name,password,email);
				logoperation log=new logoperation();
				log.register(user1);
				System.out.println("Successfully register");
				break;
			}
			case 2:{
				System.out.println("please enter your name,password,mail");
				String name=s.next();
				String password=s.next();
				String email=s.next();
				logoperation log=new logoperation();
				boolean flag=log.login(name,password,email);
				if(flag)
				{
					System.out.println("Succesfully login");
					boolean acces=true;
					while(acces) {
					System.out.println("1 busregistr \n 2 ticket booking \n 3 cancel ticket \n 4 display buses \n 5 display bookedlist \n  6  exit");
					System.out.println("enetr your choice");
					int n=s.nextInt();
					switch(n) {
					case 1:{
						System.out.println("bus Register");
						System.out.print("enter the bus no");
						int busno=s.nextInt();
						System.out.println("enetr the bus capacity");
						int buscapacity=s.nextInt();
						System.out.println("Enter the bus AC like true or false");
						boolean busac=s.nextBoolean();
						bus bus1=new bus(busno,buscapacity,busac);
						bookingoperation b=new bookingoperation();
						b.registerbus(bus1);
						System.out.println("bus succesfully register");
						
						break;
					}
					case 2:{
						//System.out.println("ticket booking");
						System.out.println("enter your name");
						String bookername=s.next();
						System.out.println("enetr the busno");
						int busno=s.nextInt();
						bookerinfo booker=new bookerinfo(bookername,busno);
						bookingoperation b=new bookingoperation();
						b.ticketbooking(booker);
						
						
						break;
						
					}
					case 3:{
						//cancel ticket
						System.out.println("enter your ticketId");
						int ticketid=s.nextInt();
						bookingoperation b=new bookingoperation();
						b.cancelticket(ticketid);
						break;
					}
					case 4:{
						//dispaly the buses
						bookingoperation b=new bookingoperation();
						b.displaybuses();
						break;
					}
					case 5:{
						//display bookedlist
						bookingoperation b=new bookingoperation();
						b.displaybookerlist();
						break;
					}
					case 6:{
						acces=false;
					}
					
					}
				}
				}
				else
				{
					System.out.println("enter valid names,passwords,email");
				}
				
				
			}
			}
			
		}
		// TODO Auto-generated method stub

	}

}
