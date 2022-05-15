package ar.edu.unju.edm.Model;
import org.springframework.stereotype.Component;

@Component

public class Punto4 {
       private int num1;
    public Punto4() {
   		// TODO Auto-generated constructor stub
   	}
	public Punto4(int num1) {
		super();
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}

 
public String generarMultiplos () {
    	String r1="";
    	int resultadoInteger= 1;
    	int factorMultiplicador=1;
    	int aux= 1;
    	do
    	{
    	resultadoInteger= num1 * factorMultiplicador;
    	factorMultiplicador += 1;
    	aux=resultadoInteger;
    	if(aux %2==0)
    	{
    		r1 = r1 + "\n"  + Integer.toString(aux) + "\n" + "---> Es PAR  ///  ";
    		
    	}else {
    		r1 = r1 + "\n" + Integer.toString(aux) + "\n" + "---> Es IMPAR  ///  ";
    	}	
    	}
    	while((resultadoInteger + num1) < 71);
    	return r1;
    }
}
