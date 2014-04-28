import java.util.ArrayList;



public class WareHouse {
	public ArrayList<Food> storageFood;
	public ArrayList<Vaccination> storageVaccination;
	WareHouse(ArrayList<Food> inStorageFood, ArrayList<Vaccination> inStorageVaccination){
		ArrayList<Vaccination> storageVaccination =  (ArrayList<Vaccination>)inStorageVaccination.clone();
		ArrayList<Food> storageFood= (ArrayList<Food>) inStorageFood.clone();
	}
	public void printStorageFood() {
	
	}
	
	public void addNewFood() {
	
	}
	
	public void deleteFood() {
	
	}
	
	public void newVaccination() {
	
	}
	
	public void deleteVaccination() {
	
	}
}
