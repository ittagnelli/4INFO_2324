class Animale {
    String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void emettiSuono() {
        System.out.println(nome + " emette un suono");
    }
}

class Mammifero extends Animale {
    public Mammifero(String nome) {
        super(nome);
    }

    public void allatta() {
        System.out.println(nome + " allatta i piccoli");
    }
}

class Mucca extends Mammifero {
    public Mucca(String nome) {
        super(nome);
    }

    public void mu() {
        System.out.println(nome + " fa mu mu!");
    }
}

public class TestMucca {
    public static void main(String[] args) {
        Mucca mucca1 = new Mucca("Bianca");
        Mucca mucca2 = new Mucca("Nera");

        mucca1.emettiSuono();
        mucca1.allatta();
        mucca1.mu();

        mucca2.emettiSuono();
        mucca2.allatta();
        mucca2.mu();
    }
}
