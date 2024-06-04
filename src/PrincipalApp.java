import java.util.*;
public class PrincipalApp{

	public void main(String[] args) {
		int suma=0;
		ArrayList <Integer> numeros = new ArrayList();
		  numeros.add(12);
		  numeros.add(18);
		  numeros.add(5);
		  numeros.add(66);
		  numeros.add(29);
		  numeros.add(8);
		  numeros.add(20);
		  numeros.add(65); 
		  comprobarVacio(numeros, suma);
		  imparesDivisbles(numeros);
	}
	public void imparesDivisbles(ArrayList numeros) {
		if(numeros!= null) {
			 
		 }else if(numeros.size()%2 !=0) {
			 
		 }
		
	}
	public void comprobarVacio(ArrayList numeros, int suma){
		 if(numeros== null) {
			 suma++;
		 }
	}
}
