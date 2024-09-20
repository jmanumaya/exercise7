package exercise7;

public class Exercise7 {

	public static void main(String[] args) {
		
		System.out.println("  ******  *         *");
		System.out.println("     *    *  *   *  *");
		System.out.println("     *    *    *    *");
		System.out.println("*    *    *         *");
		System.out.println("******    *         *\n");
		
		System.out.print("¡¡¡Si ves esto es porque estoy probando a hacer cambios desde mi casa al repositorio!!!\n");
		
		int a = 123;
		int b = 241;
		String name = "123";
		
		System.out.println((a + b) + name);
		
		System.out.println("Lo siguiente es un ejercicio del enlace de retos de programación de moodle de Mouredev que he hecho de práctica y así pruebo tambien la edición del proyecto y demás");
		
		int number = 1;
		String multthree = "fizz";
		String multfive = "buzz";

		while (number <= 100) {

		    if (number % 3 == 0 && number % 5 == 0) {
		        System.out.println(multthree + multfive);
		    } else if (number % 3 == 0) {
		        System.out.println(multthree);
		    } else if (number % 5 == 0) {
		        System.out.println(multfive);
		    } else {
		        System.out.println(number);
		    }

		    number++;
		}

	}

}
