package enumExample;

public enum SeatType {
	
	ECONOMY("economy class", 150), 
	BUSINESS("business class", 50), 
	FIRSTCLASS("first class", 20);

	private String nameOfSeat;
	private int numOfSeats;

	SeatType(String seatName, int numberOfSeats) {
		nameOfSeat = seatName;
		numOfSeats = numberOfSeats;
	}
	
	public String getName() {
		return  nameOfSeat;
	}
	
	public int getNumOfSeats() {
		return numOfSeats;
	}

}
