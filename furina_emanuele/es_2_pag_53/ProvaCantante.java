class ProvaCantante {
  public class Main {
      public static void main(String[] args) {
          Cantante cantante = new Cantante("Eminem", 33);
          Musicista musicista = new Musicista("John Mayer", 44);
          Compositore compositore = new Compositore("Hans Zimmer", 64);

          cantante.esegui();
          cantante.canta();

          musicista.esegui();
          musicista.suona();

          compositore.esegui();
          compositore.compone();
    }
}
