import java.util.Scanner;

public class Latihan09 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Students students = new Students();
		
		System.out.print("Masukkan NPM Anda: "); students.setNpm(myObj.nextInt()); myObj.nextLine();
		System.out.print("Masukkan Full Name Anda: "); students.setFullName(myObj.nextLine());
		System.out.print("Masukkan Class Name Anda: "); students.setClassName(myObj.nextLine());
		System.out.print("Masukkan Semester Anda: "); students.setSemester(myObj.nextInt());
		System.out.print("Masukkan GPA Anda: "); students.setGpa(myObj.nextFloat());
		
		System.out.println("\nResult:");
		System.out.println("NPM Anda: " + students.getNpm());
		System.out.println("Full Name Anda: " + students.getFullName());
		System.out.println("Class Name Anda: " + students.getClassName());
		System.out.println("Semester Anda: " + students.getSemester());
		System.out.println("GPA Anda: " + students.getGpa());
		
		myObj.close();
	}

}
