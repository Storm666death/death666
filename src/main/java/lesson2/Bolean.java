package lesson2;

public class Bolean {
     static boolean isTeen(int a) {

        if (a < 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {


        System.out.println(isTeen(7));
    }
}


