import java.util.Scanner;

public class Latihan01 {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Masukan suhu dalam Celcius: ");
		double suhuCelcius = myObj.nextDouble();
		
        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        
        double suhufahrenheit = (suhuCelcius * 9/5) + 32;
        double suhureamur = suhuCelcius * 4/5;
        double suhukelvin = suhuCelcius + 273.15;

        System.out.println("Konversi ke Fahrenheit: " + suhufahrenheit);
        System.out.println("Konversi ke Reamur: " + suhureamur);
        System.out.println("Konversi ke Kelvin: " + suhukelvin);
        
        myObj.close();
	}
	
}
