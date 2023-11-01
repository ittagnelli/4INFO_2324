package es7_pg52;

public class Montacarichi {
    private int pianoCorrente;

    public Montacarichi() {
        pianoCorrente = 5;
    }

    public void to_up() {
        if(pianoCorrente < 10) {
            pianoCorrente++;
            System.out.println("\nl'ascensore sta salendo al piano");
        } else {
            System.out.println("\nl'ascensore è gia' al piano");
        }
    }

    public void to_down() {
        if(pianoCorrente > 1) {
            pianoCorrente--;
            System.out.println("\nl'ascensore sta scendendo al piano");
        } else {
            System.out.println("\nl'ascensore è gia' al piano");
        }
    }

    public void Desinazione(int Desiderato) {
        while (pianoCorrente != Desiderato) {
            if (Desiderato > pianoCorrente) {
                to_up();
            } else if (Desiderato < pianoCorrente) {
                to_down();
            }
        }
        System.out.println("\nl'ascensore è arrivato al piano");
    }
}
