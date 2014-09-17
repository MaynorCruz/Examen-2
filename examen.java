import java.util.Scanner;


public class examen {
	{
	public static class Ejercicios {
		//Devuelve el valor de "arreglo" en la posicion "i"
		//2.5pts
		// Aqui Creamos el arreglo con todas sus variables.
		// El arreglo tiene que llevar con varibale iniciable "I"
		int obtenerValor(int arreglo[],int i)
		{  int mi_arreglo[];
			mi_arreglo= new int[3];
			mi_arreglo[0]=10;
			mi_arreglo[1]=20;
			mi_arreglo[2]=30;
			
			int i = 0; 
			while (1<mi_arreglo.length); 
			{
				System.out.print(mi_arreglo[1] );
				i=i+1;
			}

			return -1;
		
			
		
		
		}
		
		//Si el promedio de todos los valores de "notas" es mayor a 60, devuelve verdadero de lo contrario falso
		//2.5pts
		//Aqui Mostrara las notas que ingresamos
		// No se si la condicion que realize esta bueno, espero 
		boolean alumnoAprobo(int notas[])
		{ Scanner s = new Scanner (System.in); 
		   double notas [] []=new double [3][4];
		   for (int alumno=0; alumno<4;alumno++)
		   {
			   System.out.print("alumno"+(alumno+1));
			   for(int nota=0; nota<3; nota++)
			   {
				   System.out.print("ingrese la nota" + (nota+1)+": ");
				   notas[nota] [alumno]=s.nextInt();   
			   }
		   }
		
	        System.out.println(" las notas del alumno 0: ");  
	      for (int nota = 0; nota<3; nota++)
	      
	    	  
		  System.out.println(notas[nota][0]; 
		}if 
		{
			Notas = > 60;
			System.out.print("Verdadero");
		}
	    	  
			return false;
		}
		
		//Devuelve el valor de mi_arreglo en la posicion [x][y]
		//2.5pts
		static int obtenerValorBidi(int mi_arreglo[][], int x, int y)
		{   int mi_arreglo[];
		mi_arreglo= new int[1];
		mi_arreglo= new int[2];
		mi_arreglo[0]=10;
		mi_arreglo[1]=20;
		
		int x = 0; 
		while (1<mi_arreglo.lenght); 
		{
			System.out.print(mi_arreglo[1] );
			x=i+1;
		}
		
		int y = 0;
		while (1<mi_arreglo.length);
		{
			System.out.print(mi_arreglo[1]);
			y=i+1;
			
		}			
			return -1;
		}
		
		//Devuelve la cantidad de veces que "valor" existe en "arreglo"
		//2.5pts
		static int cuantosExisten(int arreglo[][], int valor)
		{
			
			return -1;
		}
		
		//Realizar la siguiente funcion recursiva
		//recursiva1(n) = recursiva1(n-1) - recursiva1(n-2)
		//Dados los siguientes caso base
		//recursiva1(0)=10
		//recursiva1(1)=20
		//2.5pts
		// Aqui mostraremos la respuesta de la primer recursiva que realize.
		static int recursiva1(int n)
		{ int respuesta;
        if (n == 0)
        { 
           respuesta = 10;
        }
        if (n == 1)
        {
           respuesta = 20;
        }else 
        {
           result = recursiva1(n-1) - recursiva1(n-2);
        }
			return -1;
		}
		
		//Realizar la siguiente funcion recursiva
		//recursiva2(n) = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3)
		//Dados los siguientes caso base
		//recursiva2(0)=10
		//recursiva2(1)=20
		//recursiva2(2)=30
		//2.5pts
		// Aqui tenemos la segunda recursiva que realize, espero esten buena las dos que hize.
		// Aprende mucho en su calse Gracias.
		static int recursiva2(int n)
		{
			int resultado;
		
		if (n == 0)
		{
			resultado = 10;
		}
		if (n == 1)
		{
			resultado = 20;
		}
		if (n == 2)
		{
			resultado = 30;
		}else
			
		result = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3);
			
			return -1;
		}
		
		public static void main(String args[])
		{
			
		}
		
	}
	

