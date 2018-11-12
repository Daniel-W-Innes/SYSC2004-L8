
public class PropertySquare extends Square {
	private int price;
	private int rent;
	private Player owner;

	PropertySquare(String name, int number, int price, int rent) {
		super(name, number);
		this.price = price;
		this.rent = rent;
		owner = null;
	}

	@Override
	public void landOn(Player p) throws Exception {
		p.setLocation(this);
		if (owner == null && p.netWorth() > price) {
			owner = p;
			p.decreaseCash(price);
		} else if (owner != p && owner != null && p.netWorth() >= rent) {
			owner.increaseCash(rent);
			p.decreaseCash(rent);
		} else if (owner != p && owner != null && p.netWorth() < rent) {
			owner.increaseCash(p.netWorth());
			p.decreaseCash(p.netWorth());
			throw new Exception("There is no capitalism without debt, " + p.getName() + " is out");
		}
	}
}
