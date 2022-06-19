/* 
 * Капырина Алина Андреевна, ЗИТ-21
 * номер зач.книжки: 21-674.
 * Практическая работа №2. Задание 3. 
 * Вариант 17. 
 
 * Определить матрицу (двумерный массив) и её заполнить случайными значениями. 
 * Произведение отрицательных элементов в каждом столбце матрицы.
 
 */
import java.security.SecureRandom;

public class practic2_3 {

    private   static  void printMatrix(int[][] array){
        for (int i=0; i<array[0].length;  i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom(); 
		
		int n = 7; 
		int array[][] = new int[n][n]; 
		
		System.out.println("Двумерный массив:"); 
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array.length; j++) { 
				array[i][j] = secureRandom.nextInt(14)-15; 
				System.out.print(array[i][j] + "\t"); 
			}
			System.out.println();
		}
	}
}