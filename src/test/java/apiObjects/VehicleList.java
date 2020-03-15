package apiObjects;

import java.util.ArrayList;

public class VehicleList {
	private int count;
	private String next = null;
	private String previous;
	ArrayList<Vehicle> results = new ArrayList<Vehicle>();

	public float getCount() {
		return count;
	}

	public String getNext() {
		return next;
	}

	public String getPrevious() {
		return previous;
	}

	// Setter Methods

	public void setCount(int count) {
		this.count = count;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}
}