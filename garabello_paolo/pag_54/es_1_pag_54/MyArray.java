import java.util.Arrays;

public class MyArray {
    private int[] mioArray;
    
    public MyArray(int[] mioArray){
        this.mioArray = mioArray;
    }

    public Boolean cerca(int n){
        return (Arrays.toString(mioArray).indexOf(Integer.toString(n))) >= 0;
    }
}
