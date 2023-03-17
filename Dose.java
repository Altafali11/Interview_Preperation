package codeit_preperation;

 abstract class Vaccine{
	 int userAge;
	 boolean Indian;
	 boolean userwantToTakeVaccine;
	public void firstDose() {
		 if(Indian==true && userAge >= 18 ) {
			 System.out.println("user eligible to take firstdose");
			
		 }
		 else {
			 System.out.println("user not eligible to take firstdose");
			 
		 }
		 if(userwantToTakeVaccine == true) {
			 System.out.println("user have to pay 250rs");
		 }
		 else {
			 System.out.println("user don't have to pay any fee");
		 }
	 }
	public void secondDose(boolean isFirstDosecompleted) {
		 if(userwantToTakeVaccine == true && isFirstDosecompleted==true) {
			 System.out.println("you are eligible for second dose");
		 }
		 else {
			 System.out.println("you should take firstdose first");
		 }
	 }
	public abstract void boosterDose(boolean firstDosecompleted,boolean is2ndDosecompleted);
}
 class VaccinationSuccessfull extends Vaccine{
	 
	public void boosterDose(boolean firstDosecompleted, boolean is2ndDosecompleted  ) {
		 
		 if( is2ndDosecompleted==true &&  firstDosecompleted==true) {
			 System.out.println("You are eligible to take boosterdose");
		 }
		 else {
			System.out.println("not eligible to take boosterdose"); 
		 }
		 
	 }
 }
public class Dose {
	public static void main(String[] args) {
       VaccinationSuccessfull v = new VaccinationSuccessfull();
       v.Indian= true;
       v.userAge=18;
       v.userwantToTakeVaccine=true;
       v.firstDose();
       v.secondDose(true);
       v.boosterDose(true,false);
	}

}
