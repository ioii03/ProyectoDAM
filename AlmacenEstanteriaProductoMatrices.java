package arrays.matrices;
import java.util.Scanner;
/*
14. Almacén con estanterías y productos
Un almacén dispone de 4 estanterías, cada una de ellas con
capacidad para almacenar 6 productos.
La cantidad de unidades almacenadas en cada posición se representa
mediante la siguiente matriz:
int[][] almacen = {
 {12, 5, 0, 8, 15, 3},
 {7, 0, 9, 4, 6, 11},
 {0, 13, 2, 0, 8, 5},
 {10, 6, 14, 3, 0, 9}
};
Desarrolla un programa que permita calcular el número total de
unidades almacenadas, la estantería que contiene más unidades y
el número de posiciones vacías (valor 0).
Además, deberá encontrar la posición con mayor número de unidades
y permitir trasladar una cantidad de unidades de una posición a
otra, solicitando las coordenadas y la cantidad por teclado.
Condiciones de los traslados:
• Las coordenadas de origen y destino deben ser válidas y
diferentes.
• La cantidad trasladada debe ser mayor que cero.
• No se podrán trasladar más unidades de las disponibles en
origen.
• Después del traslado, se mostrará la matriz actualizada.
*/

public class AlmacenEstanteriaProductoMatrices {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] almacen = {
				 {12, 5, 0, 8, 15, 3}, //producto (6)
				 {7, 0, 9, 4, 6, 11},
				 {0, 13, 2, 0, 8, 5},
				 {10, 6, 14, 3, 0, 9}
		// estanteria (4)
				};
		int opcion;
		
		
		do{
			System.out.println("+------------MENU-----------+");
			System.out.println("1. Mostrar Almacen Original");
			System.out.println("2. Nº unidades almacenadas");
			System.out.println("3. Estanteria con mas unidades y nº pos vacias");
			System.out.println("4. Transladar producto");
			System.out.println("0. Salir del programa");
			System.out.println("+----------------------------+");
			System.out.print("Opcion: ");
			opcion=sc.nextInt();
			if(opcion==0)
				System.out.println("ADIOS!!!");
		switch(opcion) {
	
		case 1:
			mostrarAlmacenOriginal(almacen);
		break;
		
		case 2:
			
		break;
		
		case 3:
			
		break;
		
		case 4:
			
		break;
		
		default:
			
		}
		
		}while(opcion!=0);
		
		
		
		
		
		
		
		
	}
	public static void mostrarAlmacenOriginal(int[][] mat) {
		System.out.println("\n+--ALMACEN---+");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("+------------+\n");
	}
	
	public static void NunitAlmacen(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				
			}
		}
			
	}
	
	
	
	
	
	
	
	
	
	
}
