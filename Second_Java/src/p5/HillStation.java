package p5;

class Hill_Station {

	void location() {
		System.out.println("Location is :");
	}

	void famousFor() {
		System.out.println("Famous for :");
	}

}

// manali class extends the Hill_Station class
class Manali extends Hill_Station {
	@Override
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}
	@Override
	void famousFor() {
		System.out.println("It is famous for Hidimba Temple and Adventure Sports");
	}
}

//masoorie class extends the Hill_Station class
class Masoorie extends Hill_Station {
	@Override
	void location() {
		System.out.println("Masoorie is in Uttrakhand");
	}
	@Override
	void famousFor() {
		System.out.println("It is famous for Educational Institutions");
	}
}

//Gulmarg class extends the Hill_Station class
class Gulmarg extends Hill_Station {
	@Override
	void location() {
		System.out.println("Gulmarg is in Jammu & Kashmir");
	}
	@Override
	void famousFor() {
		System.out.println("It is famous for Skiing");
	}
}

//main class
public class HillStation {
	// main method declared
	public static void main(String[] args) {

		Hill_Station hs = new Hill_Station();
		hs.location();
		hs.famousFor();

		Manali ml = new Manali();
		ml.location();
		ml.famousFor();

		Masoorie ms = new Masoorie();
		ms.location();
		ms.famousFor();

		Gulmarg gl = new Gulmarg();
		gl.location();
		gl.famousFor();

	}
}
