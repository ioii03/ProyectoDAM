package arrays.matrices;

import java.util.Scanner;
import java.util.Arrays;
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
		Scanner sc = new Scanner(System.in);
		int[][] almacenOrigen = { { 12, 5, 0, 8, 15, 3 }, // producto (6)
							{ 7, 0, 9, 4, 6, 11 }, 
							{ 0, 13, 2, 0, 8, 5 }, 
							{ 10, 6, 14, 3, 0, 9 }
					// estanteria (4) //->4
		};
		int[][] mod = {{12,5,0,8,15,3},{7,0,9,4,6,11},{0,13,2,0,8,5},{10,6,14,3,0,9}};
		int opcion;

		MENU();
		//mostrarAlmacenOriginal(almacen);
		do {
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
			if (opcion == 0) {
				System.out.println("ADIOS!!!");
				sc.close();
			}

			switch (opcion) {

			case 1:
				mostrarAlmacenOriginal(almacenOrigen);
				break;

			case 2:
				int suma = totalAlmacenado(mod);
				System.out.println("\n+-----------------------------------+");
				System.out.println("Suma Unidades total almacenadas: " + suma);
				System.out.println("+-----------------------------------+\n");
				break;

			case 3:
				maxUnitNvaciasAlmacen(mod);
				break;

			case 4:
				transladarProdAlmacen(mod);
				break;
			
			case 5:
				mostrarAlmacenModificado(mod);
				break;

			default:
				if (opcion != 0)
					System.out.println("Opcion no existe");
			}

		} while (opcion != 0);

	}

	public static void MENU() {
		System.out.println("+------------MENU-----------+");
		System.out.println("1. Mostrar Almacen Original");
		System.out.println("2. Nº unidades almacenadas");
		System.out.println("3. Estanteria con mas unidades y nº pos vacias");
		System.out.println("4. Transladar producto");
		System.out.println("5. Mostrar Almacen modificado");
		System.out.println("0. Salir del programa");
		System.out.println("+----------------------------+");
	}
	
	public static void mostrarAlmacenOriginal(int[][] mat) {
		System.out.println("\n+----ALMACEN-ORIGINAL----+");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("+------------------------+\n");
	}

	public static void mostrarAlmacenModificado(int[][] mat) {
		System.out.println("\n+---ALMACEN-MODIFICADO---+");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("+------------------------+\n");
	}
	
	
	public static int totalAlmacenado(int[][] mat) {
		int suma = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				suma += mat[i][j];
			}
		}
		return suma;
	}

	public static void maxUnitNvaciasAlmacen(int[][] mat) {
		int[] aux = new int[mat[0].length];
		int[] aux2 = new int[mat.length];
		int suma = 0;
		int pos = 0;
		int cero = 0;
		int max = aux2[0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				aux[j] = mat[i][j];
				suma += aux[j];
				if (mat[i][j] == 0)
					cero++;
			}
			// System.out.println("\nAUX"+Arrays.toString(aux));
			aux2[i] = suma;
			suma = 0;
			// System.out.println("\nSUMA: "+Arrays.toString(aux2));
			if (max <= aux2[i]) {
				max = aux2[i];
			}
		}
		for (int i = 0; i < aux2.length; i++) {
			if (max == aux2[i])
				pos = i + 1;
		}
		System.out.println("\n+--------------------------------+");
		System.out.println(
				"contenido de la estanteria mayor: " + max 
				+ "\nPosicion: " + pos 
				+ "\nCantidad de ceros: " + cero);
		System.out.println("+--------------------------------+\n");
	}

	public static void transladarProdAlmacen(int[][] mat) {
		Scanner sc = new Scanner(System.in);
		boolean loop=true;
		boolean loop2=true;
		System.out.println("\nValores de origen: ");
		System.out.print("Eje x: ");
		int posx= sc.nextInt();
		System.out.print("Eje y: ");
		int posy=sc.nextInt();
		if((posx <=0 || posy <=0) || (posx > mat.length || posy > mat[0].length)) {
			System.out.println("Valor invalido, volviendo al menu");
			return;
		}
		int origen=0;
		int destino=0;
		int auxO=0;
		int auxD=0;
		int cant=0;
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(posx!=0 && posy!=0) {
					origen=mat[posx-1][posy-1];
					
					auxO=origen; // MOVER CANTIDAD
				}
				
			}
		}
		
		//System.out.println("Origen eje x: "+posx+"\nOrigen eje y: "+posy);
		//System.out.println("length posx: "+mat.length);
		//System.out.println("length posy: "+mat[0].length);
		//System.out.println("Origen Valor en matriz: "+origen);
		System.out.println("\nDestino del translado: ");
		System.out.print("Eje x: ");
		posx= sc.nextInt();
		System.out.print("Eje y: ");
		posy=sc.nextInt();
		if((posx <=0 || posy <=0) || (posx > mat.length || posy > mat[0].length)) {
			System.out.println("Valor invalido, volviendo al menu");
			return;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(posx!=0 && posy!=0) {
					destino=mat[posx-1][posy-1];
					auxD=destino; //MOVER CANTIDAD
				}
			}
		}//Cosa para mover los valores de lugar
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {		
				
				if(auxO!=auxD) {
					if(destino==mat[i][j]) {
						mat[i][j]=auxO;
					}
					else if(origen==mat[i][j]) {
						mat[i][j]=auxD;
					}
				}else if(loop){
					System.out.println("No se puede ERROR");
					loop=false;
					return;
				}
			}
		}
		//System.out.println("Valores de destino: ");
		//System.out.println("Destino eje x: "+posx+"\nDestino eje y: "+posy);
		//System.out.println("Destino Valor en matriz: "+destino);
		System.out.println("\nTranslado completado\n");
		mostrarAlmacenModificado(mat);
		
	}
}






System.out.print("Cantidad a mover: ");
int cant =sc.nextInt();
if(cant<0) {
	System.out.println("Valor invalido, volviendo al menu");
	return;
}











