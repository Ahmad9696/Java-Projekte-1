class Operatoren {
public static void main(String args[ ]) {
	
	int x = 2, y, z;
	// Z i t // Zuweisungsoperatoren
	x *= 3 + 2; System.out.println(x); /* 1. Wert? */
	x *= y = z = 4; System.out.println(x); /* 2. Wert? */
	
	x = 2, y, z;
	// arithmestische Operatoren
	x = - 3 + 4 * 5 - 6; System.out.println(x); /* 3. Wert? */
	x = 3 + 4 % 5 - 6; System.out.println(x); /* 4. Wert? */
	x = - 3 * 4 % - 6 / 5; System.out.println(x); /* 5. Wert? */
	x = (7 + 6 ) % 5 / 2; System.out.println(x); /* 6. Wert? */
	
	x = 2, y, z;
	// Inkrement Operatoren
	x = y = 1;
	z = x ++ -1; System.out.println(x + "\t" + z); /* 7. und 8.Wert? */
	z += - x ++ + ++ y; System.out.println(x + "\t" + z); /* 9. u. 10.Wert? */
	z = x / ++ x ; System.out.println(z); /* 11. Wert? */
}
}