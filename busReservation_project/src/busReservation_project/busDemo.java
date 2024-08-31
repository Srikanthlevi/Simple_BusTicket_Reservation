package busReservation_project;
import java.util.ArrayList;
import java.util.Scanner;
public class busDemo {
	public static void main(String []args) {
		int useropt=1;
		
		ArrayList<bus> buses=new ArrayList<bus>();
		ArrayList<passenger> bookings=new ArrayList<passenger>();
		
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,3));
		buses.add(new bus(3,true,4));
		
		buses.forEach(bus->bus.displayBus());
		
		while(useropt==1) {
				System.out.println("Enter 1 to Book and 0 to exit");
				Scanner in=new Scanner(System.in);
				useropt=in.nextInt();
				if(useropt==1) {
					passenger booking=new passenger();
					if(booking.isAvailable(buses,bookings)) {
						bookings.add(booking);
						System.out.println("Your Booking is succuess!");		
					}
					else {
						System.out.println("Sorry,Bus is full.Try another bus or other date ");
					}
			}
				else {
					System.out.println("thank you!!!");
				}
		}
	}
	
}
