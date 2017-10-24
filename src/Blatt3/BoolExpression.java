package Blatt3;

public class BoolExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean wert1, wert2;
		wert1 = false;
		wert2 = true;

		wert1 = !wert1 & (wert1 | wert2);
		System.out.println(wert1);

		wert1 = true;
		wert1 = !wert1 & (wert1 | wert2);
		System.out.println(wert1);
	}
}
