public class MyArray2 {
    private int[] mioArray;

    public MyArray2(int[] array) {
        this.mioArray = array;
    }
    public void scramble() {
        int lunghezza = mioArray.length;

        int indiceUltimoPari = -1;
        for (int x = lunghezza - 1; x >= 0; x--) {
            if (mioArray[x] % 2 == 0) {
                indiceUltimoPari = x;
                break;
            }
        }

        // Scambia i numeri pari
        for (int x = 0; x < lunghezza / 2; x += 2) {
            while (indiceUltimoPari >= 0 && mioArray[indiceUltimoPari] % 2 != 0) {
                indiceUltimoPari--;
            }

            if (x < indiceUltimoPari) {
                int temp = mioArray[x];
                mioArray[x] = mioArray[indiceUltimoPari];
                mioArray[indiceUltimoPari] = temp;
            } else {
                break;
            }
        }
    }

    public int[] getMioArray() {
        return mioArray;
    }
}