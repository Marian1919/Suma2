import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero1=0;
	int numero2=0;
	int numero3=0;
	int resultado=0;
	
	
	Scanner sn = new Scanner (System.in);
	
	System.out.println("introduca primer numero");
	numero1= sn.nextInt();
	System.out.println("introduca segundo numero");
	numero2= sn.nextInt();
	System.out.println("introduca tercer numero");
	numero3= sn.nextInt();
	
	resultado= numero1 + numero2 + numero3;
	System.out.println ("la suma de los numeros es: " + resultado);
	

	
	
	
	
	
	
	
	
	}

	

}

