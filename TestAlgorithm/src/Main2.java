public class Main2 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 5, 7, 8, 9};
            int start = 0;
            int maxLength = 1;
            int currentLength = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    currentLength++;
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        start = i - maxLength;
                    }
                    currentLength = 1;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                start = arr.length - maxLength;
            }

            for (int i = start; i < start + maxLength; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}
