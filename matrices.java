package arrays.matrices;

public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] mat1= {{1,2,3},{4,5,6},{7,8,9}};
		//int n= mat1.length;
		//int [][] mat2= new int[n][n];
		for(int fila = 0; fila<mat1.length; fila++) {
			for(int col = 0; col<mat1[fila].length; col++) {
				//mat2[fila][n-1-col] = mat1[col][fila];
				System.out.print(mat1[fila][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------\n");
		int [][] grupos= {
		/*col*/	{4,5},
		/*col*/	{7,8,9,4}, /*fil,fil,fil,fil*/
		/*col*/	{2}	
		};
		for(int fila = 0; fila<grupos.length; fila++) {
			for(int col = 0; col<grupos[fila].length; col++) {
				//mat2[fila][n-1-col] = mat1[col][fila];
				System.out.print(grupos[fila][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("\nNº Columna: "+grupos.length);// 3
		System.out.println("Nº Fila: "+grupos[1].length); // 3
		
		System.out.println("\n---------------------------\n");
		
		int [][] datos= {{3,4},{5,6}};
				for(int[]fila:datos) {
					for(int valor:fila) {
						System.out.println(valor+" ");
					}
					System.out.println();
				}
		
		System.out.println("\n---------------------------\n");
		
		/*6.ejercicio de repaso. Arrays 
		Se dispone de un array con las notas de 6 alumnos 
		Int[] notas={7,4,9,5,8,3}; 
		-muestra todas la notas con un bucle for. 
		Calcula la media de la clase 
		Cuenta cuantos alumnos estan aprob nota>=5 
		Max nota y su posicion 
		Realiza otro recorrido usando foreach */
				
		int[] notas={7,4,9,5,8,3};
		int[] notas2={6,9,2,0,1,1};
		double media=0;
		double media2=0;
		int apb=0;
		int apb2=0;
		int max=notas[0];
		int max2=notas[0];
		int pos=0;
		int pos2=0;
		int j=0;
		for(int i=0;i<notas.length;i++) {
			System.out.print(notas[i]+ " ");
			media+=notas[i];
			if(notas[i]>=5) {
				apb++;
			}
			if(max<=notas[i]) {
				max=notas[i];
				pos=i+1;
			}
		}media/=notas.length;
		System.out.println("\nMedia: "+media+"\nAprobados: "+apb+"\nMax nota: "+max+"\nPosicion: "+pos+"\n");
		
		for(int nota:notas2) {
			
			System.out.print(nota+ " ");
			media2+=nota;
			if(nota>=5) {
				apb2++;
			}
			if(max2<=nota) {
				max2=nota;
				pos2=j+1;
			}j++;
		}media2/=notas2.length;
		System.out.println("\nMedia: "+media2+"\nAprobados: "+apb2+"\nMax nota: "+max2+"\nPosicion: "+pos2);
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
}


















