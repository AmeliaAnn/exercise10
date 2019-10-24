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
            for (int j = 0; j < arr[i].length; j++) 
            System.out.println("Заполните матицу:"); {
            arr[i][j] = in.nextInt();
                
              }
        }
        
  }
}
