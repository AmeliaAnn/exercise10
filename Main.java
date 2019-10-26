package exercise10;

import java.util.*;

public class Main {

  public static void main(String[] args) {
  
  
  Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
      int  rows = in.nextInt();
                
        System.out.print("Введите количество столбцов матрицы: ");
      int  cols = in.nextInt();
      
  int[][] arr = new int[rows][cols];

   for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr[i].length; j++) {
System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
arr[i][j] = in.nextInt();
       
    
in.close();
  
  
  do (i * 3) {
  System.out.println("1 строка умноженная на 3: arr[" + i + "][" + j + "]:");
  i++;
       } while (arr[0][j]);
      }
     }
    }
    
}
