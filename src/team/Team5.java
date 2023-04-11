package team;

public class Team5 {

	public static void main(String[] args) {

		Team5.isValid(13);
	}

	public void getInfo(String first_Name) {

		// add your name

		first_Name = "Abdessalam";

	}

	public void getMoreInfo(String state) {

		state = "WA";

	}

	public static boolean isValid(int age) {
		boolean result = false;

		if (age > 18) {
			result = true;
			System.out.println(result);
		}
System.out.println("Zaki's edith " );
		return result;

	}

}
