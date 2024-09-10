import java.util.Scanner;


public class Latihan06 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Masukkan usia anda: "); int usia = myObj.nextInt(); myObj.nextLine();
		System.out.print("Masukkan first name anda: "); String firstName = myObj.nextLine();
		System.out.print("Masukkan last name anda: "); String lastName = myObj.nextLine();
		System.out.print("Masukkan NPM anda: "); String npm = myObj.nextLine();
		
		System.out.println("Result: " + usia + firstName + lastName + npm);
		
		myObj.close();

	}

}
