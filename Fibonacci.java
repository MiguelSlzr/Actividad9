package Actividad9;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	
	List<Integer> listaFibonacci = new ArrayList<>();
	
	public int serieFibonacci() {
		
		
		int fibo1 = 0;
		listaFibonacci.add(fibo1);
		int fibo2 = 1;
		listaFibonacci.add(fibo2);
		int fibo3 = 0;
		
		while(fibo3 < 1000000) {
			fibo3 = fibo1+fibo2;
			listaFibonacci.add(fibo3);
			fibo1 = fibo2;
			fibo2 = fibo3;
		}

		System.out.println(listaFibonacci);

		return fibo3;
	}
	

}
