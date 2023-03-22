package Actividad9;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
	
	public void paresFibonacci() {
		Fibonacci miFibo = new Fibonacci();
		miFibo.serieFibonacci();
		List<Integer> paresFibonacci = new ArrayList<>();
		
		
		for(int i = 0; i < miFibo.listaFibonacci.size(); i++) {
			if(miFibo.listaFibonacci.get(i) % 2 == 0) {
				paresFibonacci.add(miFibo.listaFibonacci.get(i));
			}
			
		}
		
		System.out.println(paresFibonacci);
	}
	
	public void imparesFibonacci() {
		Fibonacci miFibo = new Fibonacci();
		List<Integer> imparesFibonacci = new ArrayList<>();
		miFibo.serieFibonacci();
		
		for(int i = 0; i < miFibo.listaFibonacci.size(); i++) {
			if(miFibo.listaFibonacci.get(i) % 2 != 0) {
				imparesFibonacci.add(miFibo.listaFibonacci.get(i));
			}
		}
		System.out.println(imparesFibonacci);
	}
		
	
}
