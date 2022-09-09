public class First {

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 7, 3, 6, 5, 6, 14};
        findIndex(array);
    }

    public static void findIndex(int[] array) {
        int index = -1;

        for (int j = 0; j < array.length; j++) {
            int sum1 = 0;
            int sum2 = 0;
            index++;
            for (int i = 0; i < index; i++) {
                sum1 += array[i];
            }
            for (int i = index + 1; i < array.length; i++) {
                sum2 += array[i];
            }
            if (sum1 == sum2) System.out.println(index);
        }
    }
}
