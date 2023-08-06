import java.util.Random;

public class HW_1 {
    public static void main(String[] args) {

        //рандомный массив
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(10);


        print(array);
        heapSort(array); //пирамидальная сортировка
        print(array);

    }




    //пирамидальная сортировка
    public static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // левый = 2*i + 1
        int right = 2 * i + 2; // правый = 2*i + 2

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }


    //распечатать массив
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i] + " ");
        System.out.println();
        
    }
     

}