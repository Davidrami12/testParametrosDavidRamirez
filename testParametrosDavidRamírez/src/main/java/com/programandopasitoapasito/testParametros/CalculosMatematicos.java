package com.programandopasitoapasito.testParametros;

public class CalculosMatematicos {
	
	public static boolean esPrimo(int numero) {
		
		boolean retorno = true;
		int divisor = 3;
		
		if(numero % 2 == 0)
			retorno = false;
		
		while(retorno && divisor <= numero/2) {
			if(numero % divisor == 0)
				retorno = false;
				divisor+=2;
		}
		
		return retorno;
	}
	
	
	public static int potencia(int base, int exponente) {
		
		int resul = 1;
		
		if(exponente > 0)
			resul = base * potencia(base, exponente - 1);
		
		return resul;
	}
	
	public static int factorial(int numero) {

        int f = 1;
        for (int i = 1; i <= numero; i++) {
            f *= i;
        }
        return f;
    }

}