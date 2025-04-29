package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

public class Main {

	public static void main(String[] args) {
	  System.out.println("Program basliyor");
	  
	  // ORNEK-1
	  String uzunMetin = "Now is the time for all good men";
	  String kisaMetin = metniKisalt(uzunMetin);
	  System.out.println(uzunMetin + " > " + kisaMetin);
	  
	  // ORNEK-2
	  String boslukluMetin = "                 ab        cc ddd";
	  String temizlenmisMetin = bosluklariTemizle(boslukluMetin);
	  System.out.println(boslukluMetin + " > " + temizlenmisMetin);
	}

	public static String bosluklariTemizle(String boslukluMetin) {
		String temizlenmisMetin = StringUtils.deleteWhitespace(boslukluMetin);
		return temizlenmisMetin;
	}

	public static String metniKisalt(String metin) {
		String sonuc = WordUtils.abbreviate(metin, 10, 40, " ...");
		return sonuc;
	}
}
