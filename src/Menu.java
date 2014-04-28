import java.util.ArrayList;

public class Menu {
	public ArrayList<Food> listFood;
	public ArrayList<Integer> amountFood;
	Menu(ArrayList<Food> inFood,ArrayList<Integer> inAmountFood) {
		//ArrayList<Food> listFood = new ArrayList<Food>();
		ArrayList<Integer> amountFood =  (ArrayList<Integer>)inAmountFood.clone();
		ArrayList<Food> listFood= (ArrayList<Food>) inFood.clone();
		
	}
	
	public void takeFood() {
	
	}
	
	public void printMenu() {
	
	}
}
