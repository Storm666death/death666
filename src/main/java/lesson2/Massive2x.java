package lesson2;

public class Massive2x {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    System.out.print(" 1 ");
                }if (i<j){
                    System.out.print(" 0 ");
                }else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }
}