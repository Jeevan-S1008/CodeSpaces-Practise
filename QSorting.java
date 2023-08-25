import java.util.Random;
import java.util.Scanner;

public class QSorting {
     public static void QuickSort(int array[], int low, int high) {
        if(low<high)
        {
        int pivot = Partition(array, low, high);
        QuickSort(array, low, pivot - 1);
        QuickSort(array, pivot + 1, high);
        }
    }
    public static int Partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int tem = array[i + 1];
        array[i + 1] = array[high];
        array[high] = tem;
        return i + 1;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Before sorting the elements of array:");
        for (int i = 0; i < n; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting the elements of array:");
        QuickSort(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        s.close();
    }


}