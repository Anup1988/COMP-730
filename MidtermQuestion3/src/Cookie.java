
public class Cookie implements BakedGoods{
	
	private int price;
	private String cookieDes;
	private String cookieSellByDate;
	
	
	public Cookie(int price, String cookieDes, String cookieSellByDate) {
		
		this.price = price;
		this.cookieDes = cookieDes;
		this.cookieSellByDate = cookieSellByDate;
	}
	
	
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public String getDescription() {
		
		
		return cookieDes;
	}

	@Override
	public String getSellByDate() {
		
		
		return cookieSellByDate;
	}
	
	

}
