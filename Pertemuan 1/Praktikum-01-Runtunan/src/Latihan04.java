import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {

    static int harga = 6300;

    static double subTotal(double total, int quantity) {
        int diskon = (quantity / 3) * 5;
        if (diskon > 100) {
            diskon = 100;
        }
        return total - (total * diskon / 100.0);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        LocalDateTime myObj2 = LocalDateTime.now();
        int quantity;
        double total;

        System.out.println("==============================================================");
        System.out.println("                       TOKO SERBAGUNA IBIK");
        System.out.println("==============================================================");

        System.out.print("Masukkan jumlah produk yang dibeli: ");
        quantity = myObj.nextInt();

        total = harga * quantity;

        System.out.print("\n");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        String formattedDateTime = myObj2.format(formatter);
        System.out.println(formattedDateTime);

        System.out.println("ITEM              QTY   HARGA      TOTAL");
        System.out.println("==============================================================");
        System.out.printf("%-16s %4d Rp %,7d,- Rp %,10d%n", "ROTI ENAK", quantity, harga, (int)total);
        System.out.println("--------------------------------------------------------------");

        double subtotal = subTotal(total, quantity);

        int diskon = (quantity / 3) * 5;
        if (diskon > 100) {
            diskon = 100;
        }
        
        if (diskon > 0) {
            System.out.println("Diskon : " + diskon + "%");
        } else {
            System.out.println("Diskon : Tidak ada");
        }
        
        System.out.printf("Sub Total : Rp %,10.0f,-%n", subtotal);

        myObj.close();
    }
}
