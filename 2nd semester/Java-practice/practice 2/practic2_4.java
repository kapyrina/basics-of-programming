/* 
 * Капырина Алина Андреевна, ЗИТ-21
 * номер зач.книжки: 21-674.
 * Практическая работа №2. Задание 4. 
 * Вариант 17. 
 
 * Дан двумерныый массив A, размером (n*n) (или квадратная матрица А). 
 * Найти среднее орифметическое положительных элементов, верхней треугольной матрицы, расположенной выше главной диагонили.
 
 */
import java.util.Scanner; 
import java.security.SecureRandom; 

public class practic2_4 {

    private   static  void printMatrix(int[][]matrix){
        for (int i=0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        int n=5;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (4-Math.random()*7);
            }
        }
        printMatrix(matrix);
        System.out.println();
        float sum=0;
        int count=0;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++) {
               
                if (matrix[i][j]>0){
                    sum+=matrix[i][j];
                    count++;
                }
            }
          
        }
        if (count!=0){
            float average=sum/count;
            System.out.println(average);
        }
        else{
            System.out.println(sum);
        }

    }
}