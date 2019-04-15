
public class CinnamonRoll  implements BakedGoods{

	
	private int price;
	private String cinnamonDes;
	private String cinnamonSellByDate;
	
	public CinnamonRoll(int price,String cinnamonDes,String cinnamonSellByDate ) {
		
		this.price = price;
		this.cinnamonDes =cinnamonDes;
		this.cinnamonSellByDate =cinnamonSellByDate;
		
	}
	
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public String getDescription() {
		
		
		return cinnamonDes;
	}

	@Override
	public String getSellByDate() {
		
		return cinnamonSellByDate;
	}

}
