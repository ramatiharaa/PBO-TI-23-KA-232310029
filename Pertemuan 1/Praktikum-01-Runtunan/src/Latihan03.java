import java.util.Scanner;

public class Latihan03 {
	
	static double hasilLuasSegitigaKerucut;
	static double hasilKelilingSegitigaKerucut;
	static double hasilLuasTabung;
	static double hasilKelilingTabung;
	
	static void hitungLuasSegitigaKerucut(double luasSelimut, double panjangJariJari) {
		hasilLuasSegitigaKerucut = (3.14 * panjangJariJari * panjangJariJari) + (luasSelimut);
	}
	
	static void hitungKelilingSegitigaKerucut(double jariJari) {
		hasilKelilingSegitigaKerucut = 2 * 3.14 * jariJari;
	}
	
	static void hitungLuasTabung(double r, double h) {
        hasilLuasTabung = (2 * 3.14 * r * r) + (2 * 3.14 * r * h);
	}
	
	static void hitungKelilingTabung(double r) {
		hasilKelilingTabung = 2 * 3.14 * r;
	}
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		double panjangJariJari;
		
		System.out.println("Hitung Luas Segitiga Kerucut");
		System.out.print("Masukan luas selimut: "); double luasSelimut = myObj.nextDouble();
		System.out.print("Masukan panjang jari - jari: "); panjangJariJari = myObj.nextDouble();
		hitungLuasSegitigaKerucut(luasSelimut, panjangJariJari);
		System.out.println("Luas Segitiga Kerucut: " + hasilLuasSegitigaKerucut);
		
		System.out.println("\n");
		
		System.out.println("Hitung Keliling Segitiga Kerucut");
		System.out.print("Masukan panjang jari - jari selimut: "); panjangJariJari = myObj.nextDouble();
		hitungKelilingSegitigaKerucut(panjangJariJari);
		System.out.println("Keliling Segitiga Kerucut: " + hasilKelilingSegitigaKerucut);
		
		System.out.println("\n");
		
		System.out.println("Hitung Luas Tabung");
		System.out.print("Masukan jari - jari: "); panjangJariJari = myObj.nextDouble();
		System.out.print("Masukan tinggi: "); double tinggi = myObj.nextDouble();
		hitungLuasTabung(panjangJariJari, tinggi);
		System.out.println("Luas Tabung: " + hasilLuasTabung);
		
		System.out.println("\n");
		
		System.out.println("Hitung Keliling Tabung");
		System.out.print("Masukan jari - jari: "); panjangJariJari = myObj.nextDouble();
		hitungKelilingTabung(panjangJariJari);
		System.out.println("Keliling Tabung: " + hasilKelilingTabung);
        
        myObj.close();
        
	}
	
}
