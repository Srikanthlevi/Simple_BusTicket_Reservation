package busReservation_project;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class passenger {
	String passenger_name;
	int bus_no;
	Date date;
	
	public passenger() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter name : ");
		passenger_name=in.next();
		System.out.println("Enter Bus number : ");
		bus_no=in.nextInt();
		System.out.println("Enter date dd-MM-yyyy : ");
		String dateInput=in.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<bus> buses,ArrayList<passenger> bookings) {
		int capacity=0;
		for(bus b:buses) {
			if(b.getBus_no()==bus_no) {
				capacity=b.getCapacity();
			}
		}
		int booked=0;
		for(passenger p:bookings) {
			if(p.bus_no==bus_no && p.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity ?true:false;
		
	}
}
