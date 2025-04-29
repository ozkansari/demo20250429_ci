package tr.edu.medipol.yova;

public final class Hesaplama {

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla(int sayilar[]) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return toplam;
	}
}
