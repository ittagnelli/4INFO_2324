public class MyArray {
    private int[] mioArray;

    public MyArray(int[] array) {
        mioArray = array;
    }

    public void scramble() {
        int left = 0;
        int right = mioArray.length - 1;

        while (left < right) {
            while (left < mioArray.length && mioArray[left] % 2 != 0) {
                left++;
            }

            while (right >= 0 && mioArray[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = mioArray[left];
                mioArray[left] = mioArray[right];
                mioArray[right] = temp;
            }
        }
    }

    public void printArray() {
        for (int num : mioArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
