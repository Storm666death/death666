package lesson2;

public class Massive2 {
    public static void main(String[] args){
                int[][] a = storm(7);
                storm(a);
            }
            public static int[][] storm(int size) {
                int[][] a = new int [size][size];
                for(int i=0; i<size; i++)
                    for(int j=0; j<size; j++)
                        a[i][j]  = (i==j) || (i+j == size-1)? 1:0;
                return a;
            }
            public static void storm(int[][] a) {
                for(int[] l : a) {
                    for(int i : l)
                        System.out.print("\t"+i);
                    System.out.println();
        }
    }
}