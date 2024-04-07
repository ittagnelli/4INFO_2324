import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<CD> catalogoCD;
    private List<Artista> artisti;
    private List<Genere> generi;
    private List<Brano> brani;

    public Archivio() {
        catalogoCD = new ArrayList<>();
        artisti = new ArrayList<>();
        generi = new ArrayList<>();
        brani = new ArrayList<>();
    }

    public void aggiungiBrano(String titolo, String nomeArtista, String titoloCD, String nomeGenere) {
        Artista artista = trovaArtista(nomeArtista);
        if (artista == null) {
            artista = new Artista(nomeArtista);
            artisti.add(artista);
        }

        CD cd = trovaCD(titoloCD);
        if (cd == null) {
            cd = new CD(titoloCD);
            catalogoCD.add(cd);
        }

        Genere genere = trovaGenere(nomeGenere);
        if (genere == null) {
            genere = new Genere(nomeGenere);
            generi.add(genere);
        }

        Brano brano = new Brano(titolo, artista, cd, genere);
        brani.add(brano);
    }

    private Artista trovaArtista(String nomeArtista) {
        for (Artista artista : artisti) {
            if (artista.getNome().equals(nomeArtista)) {
                return artista;
            }
        }
        return null;
    }

    private CD trovaCD(String titoloCD) {
        for (CD cd : catalogoCD) {
            if (cd.getTitolo().equals(titoloCD)) {
                return cd;
            }
        }
        return null;
    }

    private Genere trovaGenere(String nomeGenere) {
        for (Genere genere : generi) {
            if (genere.getNome().equals(nomeGenere)) {
                return genere;
            }
        }
        return null;
    }
}
