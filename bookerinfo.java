package login;

public class bookerinfo {
	String bookername;
	int busno;
	int bookerid;
	static int bookingid=0;
	bookerinfo(String bookername,int busno){
		this.bookername=bookername;
		this.busno=busno; 
		bookerid=bookingid;
		bookingid=bookingid+1;
		
	}

}
