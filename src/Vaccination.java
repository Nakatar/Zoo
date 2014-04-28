


public class Vaccination {
	public String name;
	public int frequency;
	public int amountOnWarehouse;
	public int maxAmount;
	public int minAmount;
	
     Vaccination(String inName,int inFrequency, int inMaxAmount, int inMinAmount) {
	this.name= inName;
	this.frequency=inFrequency;
	this.maxAmount=inMaxAmount;
	this.minAmount=inMinAmount;
	this.amountOnWarehouse=0;
			
	}
	
	public void orderVaccination() {
	
	}
}