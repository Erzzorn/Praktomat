package Blatt3;

public class ParityBit {
	public static void main(String[] args) {

		int wert = 0x17;
		int pruefsumme = wert & 0x1;

		boolean ausgabe;
		int bit1, bit2, bit3, bit4;
		// System.out.println(wert);
		wert = wert >> 1;

		bit1 = wert & 0x1;
		// System.out.println(bit1);
		wert = wert >> 1;
		bit2 = wert & 0x1;
		// System.out.println(bit2);
		wert = wert >> 1;
		bit3 = wert & 0x1;
		// System.out.println(bit3);
		wert = wert >> 1;
		bit4 = wert & 0x1;
		// System.out.println(bit4);
		int summe = bit1 + bit2 + bit3 + bit4;
		if (summe % 2 == 0 && pruefsumme == 0)

		{
			ausgabe = true;
		}

		else {
			if (summe % 2 > 0 && pruefsumme == 1) {
				ausgabe = true;
			} else {
				ausgabe = false;
			}
		}
		System.out.println(ausgabe);
		System.out.println(summe);
		System.out.println(pruefsumme);
	}
}
