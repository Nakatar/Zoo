import java.util.ArrayList;

import sun.util.calendar.BaseCalendar.Date;


public class ScheduleVaccination {
	public ArrayList<Vaccination> listVaccination;
	public ArrayList<Integer> amountVacination;
	public ArrayList<Date> dateVaccination;
	ScheduleVaccination(ArrayList<Vaccination> inListVaccination,ArrayList<Integer>inAmountVaccination) {
		ArrayList<Integer> amountVaccination =  (ArrayList<Integer>)inAmountVaccination.clone();
		ArrayList<Vaccination> listVaccination= (ArrayList<Vaccination>) inListVaccination.clone();
	ArrayList<Date> dateVaccination = new ArrayList<Date>();
	
	}
	
	public void giveVaccination() {
	
	}
	
	public void addNewVaccination() {
	
	}
}
