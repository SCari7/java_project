package homework_21;

public class ArraysMinMax {
    private int[] findMin;
    private int[] findMax;


    public static int findMin(int[] array){
     int min = array[0];
     for (int i = 0; i < array.length; i++) {
         if (array[i]<min){
             min = array[i];
         }

     }
     return min;
 }

 public static int findMax(int[] array){
     int max = array[0];
     for (int i = 0; i < array.length; i++) {
         if (array[i]> max){
             max = array[i];
         }
     }
     return max;
 }
 public static int findMinIndex(int[] array){
     int minIndex = 0;
     for (int i = 0; i < array.length; i++) {
         if (array[i]< array[minIndex]){
             minIndex = i;
         }
     }
     return minIndex;
 }
 public static int findMaxIndex(int[] array){
     int maxIndex = 0;
     for (int i = 0; i < array.length; i++) {
         if (array[i] > array[maxIndex]) {
             maxIndex = i;
         }
     }
     return maxIndex;
 }



}
