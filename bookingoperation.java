package login;

import java.util.ArrayList;

public class bookingoperation {
	static ArrayList<bus> buses=new ArrayList<>();
	static ArrayList<bookerinfo> bookerlist=new ArrayList<>();
	
	public void registerbus(bus bus1) {
		buses.add(bus1);
		
	}
	public void ticketbooking(bookerinfo booker) {
		for(bus bus1:buses) {
			if((bus1.busno)==(booker.busno)) {
				if(bus1.bookingseat<bus1.buscapacity) {
					bus1.bookingseat++;
					System.out.println("ticket booked succesfully");
					System.out.println("your ticketid   "+booker.bookerid);
					bookerlist.add(booker);
					System.out.println("---------------------------------------------------------------");
				}
				else
				{
					System.out.println("seat already full so seat is not available");
					System.out.println("---------------------------------------------------------------");
				}
			}
		}
		
		
	}
	public void cancelticket(int ticketid) {
		for(bookerinfo booker:bookerlist) {
			if(booker.bookerid==ticketid) {
				for(bus bus1:buses) {
					if(booker.busno==bus1.busno) {
						bus1.bookingseat--;
						
					}
					bookerlist.remove(booker);
					System.out.println("succesfully ticket cancelled");
					System.out.println("---------------------------------------------------------------");
				}
				
				
			}
		}
		
		
	}
	public void displaybuses() {
		for(bus bus1:buses) {
			System.out.println("bus no   :"+bus1.busno);
			System.out.println("bus capaity   :"+bus1.buscapacity);
			System.out.println("bus ac   :" +bus1.busac);
			System.out.println("bus booking seat  :"+bus1.bookingseat);
			
		}
		System.out.println("---------------------------------------------------------------");
	}
	public void displaybookerlist() {
		for(bookerinfo booker:bookerlist) {
			System.out.println("booker name   :"+booker.bookername);
			System.out.println("booker busno   :"+booker.busno);
			System.out.println("booker bookerid   :"+booker.bookerid);
			
			
		}
		System.out.println("---------------------------------------------------------------");
		
	}

}
