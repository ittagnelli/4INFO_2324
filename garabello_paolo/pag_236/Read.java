import java.io.*;

public class Read {
    FileInputStream read;

    Read(String name){
        try{
            read = new FileInputStream(name);
        } catch(FileNotFoundException e){
            System.out.println("File non trovato");
        } catch(Exception e){
            System.out.println("Qualcosa è andato storto");
        }
    }

    public void read2(){
        try{
            int size = read.available();
            System.out.println(this.read.available());
            for(int i = 0; i < size; i++){
                System.out.println("x");
                System.out.println("test " + (char)read.read());
            }

        System.out.println();
        } catch(Exception e){
            System.out.println("Qualcosa è andato storto");
        }
    }

    public void close(){
        try{
            read.close();
        } catch(Exception e ){
            System.out.println("Qualcosa è andato storto");
        }
    }

    public FileInputStream getRead() {
        return read;
    }
}
