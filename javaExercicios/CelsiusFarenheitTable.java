package javaExercicios;

public class CelsiusFarenheitTable {

	public static void main(String[] args) {
		double[] faren = new double[16];
		double[] celsius = new double[16];
		
		System.out.println("Farenheit Celsius");
		for (int i = 0; i < faren.length; i++) {
			faren[i] = 50+i;
			celsius[i] = ((faren[i]-32)*5)/9;
			System.out.println(faren[i] + "      " + celsius[i]);
		}
	}

}
