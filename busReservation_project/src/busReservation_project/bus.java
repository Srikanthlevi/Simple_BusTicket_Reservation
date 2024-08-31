package busReservation_project;
import java.util.*;
public class bus {
	private int Bus_no;
	private boolean Ac;
	private int capacity;
	
	public bus(int bus_no,boolean ac,int capacity) {
		this.Bus_no=bus_no;
		this.Ac=ac;
		this.capacity=capacity;	
	}
	
	public int getBus_no() {
		return Bus_no;
	}
	public boolean getAc() {
		return Ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setBus_no(int no) {
		Bus_no=no;
	}
	public void setAc(boolean ac) {
		Ac=ac;
	}
	public void setCapacity(int capacity_val) {
		capacity=capacity_val;
	}
	
	public void displayBus() {
		System.out.println("Bus number : "+Bus_no+"\nAc : "+Ac+"\nCapacity : "+capacity);
		System.out.println("*********************************************************");
	}

	
}

