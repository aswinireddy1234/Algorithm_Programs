public class BinarySearch {
    public static int binarySearch(String[] arr, String x) {
        int i = 0;
        int r = arr.length - 1;
        while (i <= r) {
            int m = 1 + (r - 1) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                i = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"Envelope", "Table", "Dog", "Blanket", "Pot"};
        String x = "Envelope";
        ;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Word not found");
        else
            System.out.println("Word found at " + "index" + " " + result);
    }
}
