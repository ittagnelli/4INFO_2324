public class Array {
    private int[] mioArray;
    static final int TANTI = 7;

    public Array(int[] array_enter) {
        mioArray = array_enter.clone();
    }

    public boolean cerca(int numero) {
        for(int i = 0; i < TANTI; i++) {
            if(mioArray[i] == numero) return true;
        }
        return false;
    }

    public void single() {
        for (int i = 0; i < TANTI; i++) {
            for (int j = 0; j < TANTI; j++) {
                if ((mioArray[i] == mioArray[j]) && (j != i)) {
                    mioArray[i] = 0;
                }
            }
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
