import java.io.*;
public class Write {
    FileOutputStream write;
    Write(String name){
        try{
            write = new FileOutputStream(name);
        } catch(FileNotFoundException e){
            System.out.println("File non trovato");
        } catch(Exception e){
            System.out.println("Qualcosa è andato storto");
        }
    }

    public void write(byte bDati){
        try{
            write.write(bDati);
        } catch(Exception e ){
            System.out.println("Qualcosa è andato storto");
        }
    }

    public void close(){
        try{
            write.close();
        } catch(Exception e ){
            System.out.println("Qualcosa è andato storto");
        }
    }
}