/*
    Номер зачетной книжки: 21-670.
    Автор: Иванников Александр Владимирович, ЗИТ-21
    Вариант-13. Задача 4.
*/


package mass4;

public class z4 {
    public static void main(String[] args) {
    	System.out.println("Матрица: ");
    	int n = 5;
        int mass[][] = new int[n][n]; 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
            	mass[i][j] = ((int) (Math.random() * 31)-15);
            	System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.println("Сумма положительных элементов: ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length-i; j++) {
            	if (i == j) {
            		if (mass[i][j] > 0) {
        			}
        		}
        	}
            System.out.println( );
       }
    }
}
