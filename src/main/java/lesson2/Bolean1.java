package lesson2;

public class Bolean1
{
        static boolean best(int a, int b) {

            if (a + b>=10 || a+b <=20) {
                return true;
            }
            else {
                return false;
            }

        }

        public static void main(String[] args) {


            System.out.println(best(5, 8));


        }
}
