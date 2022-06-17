/*
    Номер зачетной книжки: 21-670.
    Автор: Иванников Александр Владимирович, ЗИТ-21
    Вариант-13. Задача 3.
*/
package mass3;

public class z3 {
	  public static void main(String[] args) {
		  System.out.println("Матрица: ");
	        int n = 5;
	        int vec = n;
	        int mass[][] = new int[n][n]; 
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++){
	            	mass[i][j] = ((int) (Math.random() * 31)-15);
	            	System.out.print(mass[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    		for (int i=0; i<n; i++) {
	    			
	    }

	  }
}
