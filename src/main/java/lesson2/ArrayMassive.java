package lesson2;

public class ArrayMassive {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0};
        int death = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==1) {
                System.out.print("0");
            }
             else {
                System.out.print("1");
            }
        }

    }
}





//            if (arr[i] == 1) {
//                arr[i] = 0;
//                System.out.println("0");
//            }
//            if (arr[i] == 0) {
//                arr[i] = 1;
//                System.out.println("1");
//            }
//
////        }
////
////    }
//    public static void main(String[] args){
//        System.out.println("");
//    }
//}
////            if(arr1[i] == 1) {
//                arr1[i] = 0
//            } else {
//                arr1[i] =1
//            }


