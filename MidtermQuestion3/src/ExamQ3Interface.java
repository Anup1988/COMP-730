import java.util.ArrayList;

public class ExamQ3Interface {

	public static void main(String[] args) {

		ArrayList<BakedGoods> myList = new ArrayList<BakedGoods>();

		Cookie benneWafer = new Cookie(4,"Benne Wafers are thin, crispy cookies made of toasted sesame and the taste is reminiscent of almond or caramel","04-22-19");
		Cookie blackAndWhite = new Cookie(3,"The black and white cookie is synonymous with New York City. The cookies have a dry, vanilla cookie base topped with bisected chocolate and vanilla fondant icing","04-20-19");
		Cookie gingerBread = new Cookie(6,"Gingerbread is a prime example of rolled cookies, which means the cookies are made from a stiffer dough that is chilled, rolled out and then cut into shapes with a cookie cutter","04-21-19");
		
		CinnamonRoll appleCinnamon = new CinnamonRoll(6,"Cinnamon roll made with apple","05-12-19");
		CinnamonRoll oreoCinnamon = new CinnamonRoll(6,"Cinnamon roll made with oreo","05-18-19");
		CinnamonRoll pecanCinnamon = new CinnamonRoll(6,"Cinnamon roll made with pecan","05-13-19");
		
		Brownie ginger = new Brownie(7,"Brownie Made with ginger","06-12-19");
		Brownie raspberry = new Brownie(7," This brownie a swirl of sweetened cream cheese and fresh berries","07-12-19");
		Brownie tropicalCoconut  = new Brownie(7,"This Brownie sweet, tangy dried pineapple and toasted coconut","08-12-19");

		myList.add(benneWafer);
		myList.add(blackAndWhite);
		myList.add(gingerBread);
		
		myList.add(appleCinnamon);
		myList.add(oreoCinnamon);
		myList.add(pecanCinnamon);
		
		myList.add(ginger);
		myList.add(raspberry);
		myList.add(tropicalCoconut);
		
		int counter = 1;
		for (int i = 0; i < myList.size(); i++) {

			System.out.println(counter+": " + myList.get(i).getDescription());
			System.out.println("Price: " + myList.get(i).getPrice());
			System.out.println("Sell By Date: " + myList.get(i).getSellByDate());
			System.out.println("======================================");
			System.out.println("                                      ");
			counter++;
		}
	}
}
