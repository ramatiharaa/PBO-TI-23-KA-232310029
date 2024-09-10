import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String inputan;
		
		System.out.print("Masukkan teks yang akan di convert menjadi uppercase: "); inputan = myObj.nextLine();
		System.out.print("Teks uppercase: " + inputan.toUpperCase());		
		
		myObj.close();
				
				

	}

}
