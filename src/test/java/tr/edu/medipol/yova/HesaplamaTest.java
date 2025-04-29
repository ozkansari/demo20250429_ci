package tr.edu.medipol.yova;

import org.junit.*;

public class HesaplamaTest {

	@Test
	public void testToplaIntInt() {
		int sonuc = Hesaplama.topla(42, 57);
		Assert.assertEquals(99, sonuc);
	}

	@Test
	public void testToplaIntArray() {
		int sayilar[] = { 1, 2, 3, 4 };
		int sonuc = Hesaplama.topla(sayilar);
		Assert.assertEquals(10, sonuc);
	}

}
