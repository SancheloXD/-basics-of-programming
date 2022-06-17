/*
    Номер зачетной книжки: 21-670.
    Автор: Иванников Александр Владимирович, ЗИТ-21
    Вариант-13. Задача 1.
*/
package mass;

public class z1 {
    public static void main (String[] args) {
        int n= 10;
        int B[] = new int [n];
        int C[] = new int [n];
        for (int i = 0; i < n; i++) {
			B[i] = (int) (Math.random() * 10);
			System.out.print(B[i] + " ");
		}
		System.out.println();
			for (int i=0; i<n; i++) {
				if (B[i] >0) {
					C[i] = B[i]*5;
					}
			}
			for(int i= 0; i<10; i++) {
				System.out.print(C[i] + " ");}
	}
}
