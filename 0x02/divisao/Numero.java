public class Numero {

	public static void dividir(int a, int b) {
		try {
			int calculo = (a/b);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Calculo finalizado");
		}
	}

}
