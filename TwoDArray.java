
import java.util.*;
  
  public class TwoDArray{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int nr = scn.nextInt();   //nr --> no of rows
    int nc = scn.nextInt();   //nc --> no of column
    int mat[][] = new int[nr][nc];

    for(int r = 0; r <mat.length; r++){
      for(int c = 0; c < mat[0].length; c++){
        mat[r][c] = scn.nextInt();
      }
    } 
    for(int r = 0; r <mat.length; r++){
      for(int c = 0; c < mat[0].length; c++){
        System.out.print(mat[r][c]+" "); 
      }
      System.out.println();
    }
    scn.close();
   }
  }
//   11 12 13 14 
//   21 22 23 24 