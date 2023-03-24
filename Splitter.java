package Actividad9;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
	
	List<Integer> paresFibonacci = new ArrayList<>();
	List<Integer> imparesFibonacci = new ArrayList<>();
	
	public void splitFibonacci() {
		Fibonacci miFibo = new Fibonacci();
		miFibo.serieFibonacci();
		
		for(int i = 0; i < miFibo.listaFibonacci.size(); i++) {
			if(miFibo.listaFibonacci.get(i) % 2 == 0) {
				paresFibonacci.add(miFibo.listaFibonacci.get(i));
			} else {
				imparesFibonacci.add(miFibo.listaFibonacci.get(i));
			}
			
			
		}
		System.out.println(miFibo.serieFibonacci());
		System.out.println(paresFibonacci);
		System.out.println(imparesFibonacci);
	}
	
		
	
}