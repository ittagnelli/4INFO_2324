public class ArchivioMusicale {
    private String[][] archivio;
    private int index;

    public ArchivioMusicale() {
        archivio = new String[20][4];
        azzeraMatrice();
        index = 0;
    }

    private void azzeraMatrice() {
        for (int i = 0; i < archivio.length; i++) {
            archivio[i][0] = "";
            archivio[i][1] = "";
            archivio[i][2] = "";
            archivio[i][3] = "";
        }
    }

    private boolean trovaBrano(String titolo, String artista, String cdTitolo, String genere) {
        for(int i = 0; i < archivio.length; i ++) {
            if((archivio[i][0] == titolo) && (archivio[i][1] == artista) && 
                (archivio[i][2] == cdTitolo) && (archivio[i][3] == genere)) return true;
        }
        return false;
    }

    public void aggiungiBrano(String titolo, String artista, String cdTitolo, String genere) {
        if(!trovaBrano(titolo, artista, cdTitolo, genere)) {
            archivio[index][0] = titolo;
            archivio[index][1] = artista;
            archivio[index][2] = cdTitolo;
            archivio[index][3] = genere;
            index++;
        }
    }

    public String toString() {
        String msg = "";
        for(int i = 0; i < archivio.length; i ++) {
            if(archivio[i][0] != "") {
                msg += "\n\n\n titolo : " + archivio[i][0];
                msg += "\n artista : " + archivio[i][1];
                msg += "\n CDtitolo : " + archivio[i][2];
                msg += "\n genere : " + archivio[i][3];
            }
        }
        return msg;
    }
}
