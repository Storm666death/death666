package lesson2;

public class BoleanYear {

    static boolean best2(int year)  {

//       boolean year = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (year % 100 == 0 && year % 400 == 0)
            return false;
        else if (year % 4 == 0 && year % 100 > 0)
            return true;

        else if (year % 100 == 0)
            return false;

        else
            return false;
    }
        public static void main(String[] args){

            System.out.println(best2(2022));
        }
    }





