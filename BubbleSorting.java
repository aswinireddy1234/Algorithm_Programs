package algorithmprogram;
public class BubbleSorting {
    public static void BubbleSort(int[] array) {
        int a = array.length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {44, 52, 33, 62, 12, 67};
        BuubleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
