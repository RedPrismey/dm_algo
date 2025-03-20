public class Depassement {
	public static void main(String[] args) {
		int[] t = { 1, 2, 3, 4 };

		/*
		 * ---[Question 1]---
		 * Le programme affiche l'erreur et crash :
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4
		 * out of bounds for length 4 at Depassement.main(Depassement.java:5)
		 * L'erreur vient du fait qu'on essaye d'accéder à un élément hors des limites
		 * de l'array, ce que le programme détecte et nous empêche de faire (pour des
		 * raisons de sécurité et pour permettre au développeur de repêrer les erreurs
		 * facilement)
		 */
		// System.out.println(t[4]);

		/*---[Question 2]---*/
		try {
			System.out.println(t[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
		}

		/*---[Question 3]---*/
		try {
			System.out.println(t[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : " + e);
		}

		/*---[Question 4]---*/
		try {
			System.out.println(t[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(t[0]);
		}
	}
}
