public class App {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int uniqueElement = 0;
        int uniqueIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                uniqueElement = arr[i+1];
                uniqueIndex = i+1;
                break;
            }
        }

        System.out.println("Unique element: " + uniqueElement);
        System.out.println("Index of unique element: " + uniqueIndex);
    }
}
