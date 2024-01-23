public class MyArray {
    private int[] mioArray;
    static final int TANTI = 6;

    public MyArray(int[] array_enter) {
        mioArray = array_enter.clone();
    }

    private void scambia(int index_1, int index_2) {
        int numero = mioArray[index_1];
        mioArray[index_1] = mioArray[index_2];
        mioArray[index_2] = numero;
    }

    public void scramble() {
        for (int i = 0; i < TANTI / 2; i++) {
            scambia(i, TANTI - 1 - i);
        }
    }

    public String toString() {
        String msg = "";
        for(int i = 0; i < TANTI; i++) {
            if(mioArray[i] != 0) msg += mioArray[i] + ", ";
        }

        return msg;
    }


}
