package MedicalCare;

import java.util.ArrayList;

public class Test {
	private ArrayList<MedicalCare> listOfMedicalCare;

	/* Метод хранения списка цирковых представлений */
	public Test(ArrayList<MedicalCare> listOfMedicalCare) {
		this.listOfMedicalCare = listOfMedicalCare;
	}
	
	/* Метод добавления нового циркового представления */
	public void addMedicalCare(MedicalCare MedicalCare) {
		listOfMedicalCare.add(MedicalCare);
	}
	
	/* Метод печати списка цирковых представлений */
	public ArrayList<MedicalCare> printMedicalCare() {
		return listOfMedicalCare;
	}
	
	public static void main(String[] args) {
		ArrayList<MedicalCare> listOfMedicalCare = new ArrayList<>();
		Test test = new Test(listOfMedicalCare);
		
	    String name = "3 поликлиника";
	    String adress = "Труда 8";
	    String FIO = "Иваннников";
	    String polis = "132456";
	    String date = "16.06.2022";
	    String vrach = "Смирнов";
	    String dolznost = "Терапевт";
	    String diagnoz = "Здоров";
		String vid = "Стационарный"; 
		int Year = 2022; 
		String period = "2 Месяца"; 
		String result = "Выздоровление";
		String nameV = "Спутник";
	    String dataV = "19.05.2022";
	    String periodDo = "6 месяцев";
		String BirthСertificate = "----";
		String gender = "----";
		String age = "----";
	    
		RoutineInspection routineInspection = new RoutineInspection(name, adress, FIO, polis, date, vrach, dolznost, diagnoz, vid, Year, period, result);
		test.addMedicalCare(routineInspection);
		
		Vaccination vaccination = new Vaccination(name, adress, FIO, polis, date, vrach, dolznost, diagnoz, nameV, dataV, periodDo);
		test.addMedicalCare(vaccination);
		
		Deti deti = new Deti(name, adress, FIO, polis, date, vrach, dolznost, diagnoz, BirthСertificate, gender, age);
		test.addMedicalCare(deti);
		
		System.out.print(test.printMedicalCare());
	}

}
