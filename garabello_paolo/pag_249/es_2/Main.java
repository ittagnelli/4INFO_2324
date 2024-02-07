import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileGenerator generator = new FileGenerator();
        generator.generate();
        FileSorter sorter = new FileSorter("numeri.dat");
        sorter.sort();
    }
}
