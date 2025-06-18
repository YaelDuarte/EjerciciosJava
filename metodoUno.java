package metodosEjemplos;
public class metodoUno {
	/*
	 * Metodo para realizar una suma
	 */
	
	public static int sumas(int a,int b) {
		int resultado = a + b;
		return resultado;
	}
	
	public static void saludo(String nombre) {
		System.out.println("Hola " + nombre + " ¿Como estas?");
	}
	
	public static double raiz(double numero) {
		double raisRes = (double) Math.sqrt(numero);
		
		Long numeroRais = Math.round(raisRes);
		if(numeroRais % 2 != 0) {
			return numeroRais;
		}else {
			return raisRes;
		}
		
	}
	
	public static double redondeo(double numRedo) {
		double resRedo = Math.floor(numRedo);
		return resRedo;
	}
	
	public static String caracterMayusucla(String cadena) {
		StringBuilder texto = new StringBuilder();
		
		for(int i=0;i <cadena.length();i++) {
			char c = cadena.charAt(i);
			
			if(c == 'a') {
				texto.append('A');
			}else {
				texto.append(c);
			}
		}
		
		return texto.toString();
	}
}
