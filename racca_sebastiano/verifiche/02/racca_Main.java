public class racca_Main {
    private static void spacing() {
        System.out.println("");
    }

    public static void main(String[] args) {
        racca_Persona persona = new racca_Persona("Mario", "Rossi");
        persona.print();
        spacing();

        racca_Dipendente dipendente = new racca_Dipendente("Marco", "Bianchi", "ITP");
        dipendente.print();
        spacing();

        racca_Docente docente = new racca_Docente("Giovanna", "Verdi", "Matematica");
        docente.print();
    }
}
