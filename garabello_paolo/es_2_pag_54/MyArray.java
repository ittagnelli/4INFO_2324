import java.util.Arrays;

public class MyArray {
    private int[] mioArray;
    
    public MyArray(int[] mioArray){
        this.mioArray = mioArray;
    }

    public Boolean cerca(int n){
        return (Arrays.toString(mioArray).indexOf(Integer.toString(n))) >= 0;
    }

    public int[] scramble(){
        int[] newarr = mioArray;
        int count = 0;
        for(int i = 0; i < mioArray.length/2+1; i++){
            System.out.println("test");
            if(newarr[i] % 2 == 0){
                int newcount = 0;
                for(int j = mioArray.length-1; j > i; j--){
                    if(newarr[j] % 2 == 0){
                        if(newcount == count){
                            int temp = newarr[i];
                            newarr[i] = newarr[j];
                            newarr[j] = temp;
                            count++;
                            break;
                        } else {
                            newcount++;
                        }
                    }
                }
            }
        }

        return newarr;
    }
}
