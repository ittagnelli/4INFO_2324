import java.io.*;
import java.util.Arrays;

public class FileSorter {
    private DataInputStream file;
    private DataOutputStream crescente;
    private DataOutputStream decrescente;
    
    FileSorter(String InName) throws FileNotFoundException{
        file = new DataInputStream(new FileInputStream(InName));
        crescente = new DataOutputStream(new FileOutputStream("crescente.dat"));
        decrescente = new DataOutputStream(new FileOutputStream("decrescente.dat"));
    }

    public void sort() throws IOException{
        int avaible = (file.available()/4);
        int[] nums = new int[avaible];
        for(int i = 0; i < (avaible); i++)
            nums[i] = file.readInt();

        Arrays.sort(nums);
        for(int i = 0; i < (avaible); i++){
            crescente.writeInt(nums[i]);
            decrescente.writeInt(nums[(avaible-1) - i]);
        }
    }


}