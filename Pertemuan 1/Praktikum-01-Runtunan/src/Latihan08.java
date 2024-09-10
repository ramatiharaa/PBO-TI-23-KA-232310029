import java.util.Scanner;

public class Latihan08 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String npm, namaLengkap, namaKelas;
		int semester;
		double ipk;
		
		System.out.print("Masukkan NPM Anda: "); npm = myObj.nextLine();
		System.out.print("Masukkan Nama Lengkap Anda: "); namaLengkap = myObj.nextLine();
		System.out.print("Masukkan Nama Kelas Anda: "); namaKelas = myObj.nextLine();
		System.out.print("Masukkan Semester Anda: "); semester = myObj.nextInt();
		System.out.print("Masukkan IPK Anda: "); ipk = myObj.nextDouble();
		
		System.out.println("\nResult:");
		
		System.out.print("NPM Anda: " + npm);
		System.out.print("\nNama Lengkap Anda: " + namaLengkap);
		System.out.print("\nNama Kelas Anda: " + namaKelas);
		System.out.print("\nSemester Anda: " + semester);
		System.out.print("\nIPK Anda: " + ipk);
		
		myObj.close();

	}

}
