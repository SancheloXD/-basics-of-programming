/* 
    Номер зачетной книжки: 21-670.
    Автор: Иванников Александр Владимирович, ЗИТ-21
    Передавать в качестве параметров два целочисленных числа. Вывести на экран 
    как сами значения, так и их сумму "3 + 2 = 5.". Если количество параметров не 
    равно 2, вывести сообщение "Неверное количество параметров.".
 */

public class z_3 {
    public static void main(String[] args) {
        if (args.length == 2) { 
            int a = Integer.parseInt(args[1]); 
            int b = Integer.parseInt(args[0]); 
            int s = a+b;
            System.out.print(a + " + " + b + " = " + s); 
        } else {
            System.out.print("Неверное количество параметров."); 
        }
    }
}