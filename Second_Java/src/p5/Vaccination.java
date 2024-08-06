package p5;

abstract class Vaccine {
	int age;
	String nationality;
	boolean isFirstDoseTaken;
	boolean isSecondDoseTaken;

	Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
		isFirstDoseTaken = false;
		isSecondDoseTaken = false;
	}

	// concrete method
	public void firstDose() {
		if (nationality.equals("Indian") && age >= 18) {
			System.out.println("Your first dose is successfully done. Now you have to pay Rs 250 after vaccination.");

			isFirstDoseTaken = true; // Update the state after first dose
		} else {
			System.out.println("Sorry, you are not eligible for the first dose.");
		}
	}

	// concrete method
	public void secondDose() {
		if (isFirstDoseTaken) {
			System.out.println("You have successfully took second dose of Covid vaccine.");
			isSecondDoseTaken = true; // Update the state after second dose
		} else {
			System.out.println("You must complete the first dose before taking the second dose.");
		}
	}

	// Abstract method for booster dose
	public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

	VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);

	}
	@Override
	public void boosterDose() {
		if (isFirstDoseTaken && isSecondDoseTaken) {
			System.out.println("You have successfully took booster dose of Covid vaccine.");
			// Implementation specific to booster dose
		} else {
			System.out.println("You must complete both first and second doses before taking the booster dose.");
		}
	}

}

//main class
public class Vaccination {
	// main method
	public static void main(String[] args) {

		Vaccine vc = new VaccinationSuccessful(18, "Indian");
		vc.firstDose();
		vc.secondDose();
		vc.boosterDose();

	}

}
