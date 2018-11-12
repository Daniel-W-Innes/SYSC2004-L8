
public class Player implements Comparable<Object> {
	private String name;
	private Square location;
	private int cash;

	Player(String name, Square startSquare) {
		this.name = name;
		location = startSquare;
		cash = 1500;
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
		return Integer.compare(netWorth(), ((Player) o).netWorth());
	}

}
