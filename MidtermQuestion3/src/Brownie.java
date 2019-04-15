
public class Brownie implements BakedGoods{

	
	private int price;
	private String brownieDes;
	private String brownieSellByDate;
	
	public Brownie(int price,String brownieDes,String brownieSellByDate ) {
		
		this.price = price;
		this.brownieDes =brownieDes;
		this.brownieSellByDate = brownieSellByDate;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return brownieDes;
	}

	@Override
	public String getSellByDate() {
		return brownieSellByDate;
	}

}
