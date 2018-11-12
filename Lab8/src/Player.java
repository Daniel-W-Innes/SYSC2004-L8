
public class Player implements Comparable<Object> {
	private String name;
	private Square location;
	private int cash;

	Player(String name, Square startSquare) {
		this.name = name;
		location = startSquare;
	}

	public String getName() {
		return name;
	}

	public Square getLocation() {
		return location;
	}

	public void setLocation(Square location) {
		this.location = location;
	}

	public int getCash() {
		return cash;
	}

	public int netWorth() {
		return cash;
	}

	public void increaseCash(int amount) {
		cash += amount;
	}

	public void decreaseCash(int amount) {
		cash -= amount;
	}

	@Override
	public int compareTo(Object o) {
		if (((Player) o).netWorth() < netWorth()) {
			return 1;
		} else if (((Player) o).netWorth() > netWorth()) {
			return -1;
		} else {
			return 0;
		}
	}

}
