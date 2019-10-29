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
        System.out.println("Введите элемент arr[" + i + "][" + j + "]:");
         
        arr[i][j] = in.nextInt();
       
        }
        
        i = 0;
        while (i < arr[0].length) {
        System.out.println(arr[0][i]*3);
        i++;
          
          }
       System.out.println(Arrays.toString(arr));
        
     }
    in.close();
     
    
  }
}
