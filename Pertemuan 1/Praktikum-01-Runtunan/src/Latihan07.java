
public class Latihan07 {
	
	static String ubahCharVokaltoX(String nama) {
		String result = "";
		
		for (int i = 0; i <= nama.length() - 1; i++) {
			if (nama.charAt(i) == 'a' || nama.charAt(i) == 'e' || nama.charAt(i) == 'i' || 
				nama.charAt(i) == 'o' || nama.charAt(i) == 'u' || nama.charAt(i) == 'A' || 
				nama.charAt(i) == 'E' || nama.charAt(i) == 'I' || nama.charAt(i) == 'O' ||
				nama.charAt(i) == 'U') {
				result = result + 'X';
			} else {
				result = result + nama.charAt(i);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		String nama = "Rama Tihara";
		
		System.out.println("Nama Asli Anda: " + nama);
		System.out.println("Ubah vocal menjadi X: " + ubahCharVokaltoX(nama));

	}

}
