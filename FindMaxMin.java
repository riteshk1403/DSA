public class FindMaxMin {

    public static void main(String[] args) {
        int[] arr = {43,67,89,76,55,44,33};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
