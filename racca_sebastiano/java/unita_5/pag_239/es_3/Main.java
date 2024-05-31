import java.io.*;
import java.util.*;

public class Main {
    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null && line2 != null) {
                int num1 = Integer.parseInt(line1);
                int num2 = Integer.parseInt(line2);

                if (num1 < num2) {
                    writer.write(Integer.toString(num1));
                    writer.newLine();
                    line1 = reader1.readLine();
                } else if (num1 > num2) {
                    writer.write(Integer.toString(num2));
                    writer.newLine();
                    line2 = reader2.readLine();
                } else {
                    writer.write(Integer.toString(num1));
                    writer.newLine();
                    line1 = reader1.readLine();
                    line2 = reader2.readLine();
                }
            }

            while (line1 != null) {
                writer.write(line1);
                writer.newLine();
                line1 = reader1.readLine();
            }

            while (line2 != null) {
                writer.write(line2);
                writer.newLine();
                line2 = reader2.readLine();
            }

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " e.getMessage());
        }
    }

    public static void printTop20(String outputFile) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader(outputFile))
        ) {
            String line;
            List<Integer> topNumbers = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                insertInOrder(topNumbers, num);
            }

            System.out.println("I 20 numeri più grandi nel file sono:");
            for (int i = 0; i < topNumbers.size(); i++) {
                System.out.println(topNumbers.get(i));
            }

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " e.getMessage());
        }
    }

    private static void insertInOrder(List<Integer> list, int num) {
        int i = 0;

        for(i = 0; i < list.size() && num > list.get(i); i++);

        list.add(i, num);
        if (list.size() > 20) {
            list.remove(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il percorso al primo file di input: ");
        String inputFile1 = scanner.nextLine();

        
        System.out.print("Inserisci il percorso al secondo file di input: ");
        String inputFile2 = scanner.nextLine();
        
        System.out.print("Inserisci il percorso al file di output: ");
        String outputFile = scanner.nextLine();

        mergeFiles(inputFile1, inputFile2, outputFile);

        printTop20(outputFile);
    }
}
