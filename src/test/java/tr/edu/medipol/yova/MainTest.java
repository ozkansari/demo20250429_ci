package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testBosluklariTemizle() {
		String sonuc = Main.bosluklariTemizle("                 ab        cc ddd");
		assertEquals("abccddd", sonuc);
	}

	@Test
	public void testMetniKisalt() {
		String sonuc = Main.metniKisalt("Now is the time for all good men");
		assertEquals("Now is the ...", sonuc);
	}

}
