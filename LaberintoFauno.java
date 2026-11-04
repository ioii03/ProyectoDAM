package arrays.matrices;

/*
1-> Pared
0-> Camino

1.nº pasos a dar para salir
2.Indicar caminos bloqueados
3.Determinar el mas rapido
*/
public class LaberintoFauno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] lab= {
//			  	   Entrada   Salida
					  {1,1,1,1,1},// F0
					  {0,0,1,1,1},// 1
					  {1,0,0,0,1},// 2
					  {1,1,1,0,0},// 3
					  {1,1,1,1,1} // 4
		};//		  C0 1 2 3 4
		
		boolean ent=true;
		
		int arriba=0;
		int abajo=0;
		int izquierda=0;
		int derecha=0;
		
		int pasos=0;
		
		for(int i=0;i<lab.length;i++) {
			int posX=i;
			for(int j=0;j<lab[i].length;j++) {
				int posY=j;
				
				if(lab[i][j]==0 && ent) {
					ent=false;
					lab[i][j]=8;
					pasos++;
					//System.out.println("Has entrado al lab");
				}
				else if(lab[i][j]==0 /*&& lab[i+1][j]<lab[lab.length-1][lab[i].length-1]*/) {
					//System.out.print(lab[i][j]+" ");
					
					pasos++;
				}
				
				
				System.out.print(lab[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Pasos: "+pasos);
		
		
	}

}
