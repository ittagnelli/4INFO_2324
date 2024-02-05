public class Main {
    public static void main(String[] args) {
        ArchivioMusicale archivio = new ArchivioMusicale();

        archivio.aggiungiBrano("Canzone 1", "Artista 1", "CD 1", "Genere 1");
        archivio.aggiungiBrano("Canzone 2", "Artista 2", "CD 2", "Genere 2");
        archivio.aggiungiBrano("Canzone 3", "Artista 1", "CD 1", "Genere 3");

        System.out.println(archivio);
    }
}
