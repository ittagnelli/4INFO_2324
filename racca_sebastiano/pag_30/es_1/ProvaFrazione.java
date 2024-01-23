class ProvaFrazione {

    public static void main(String[] args) {
        Frazione[] frazioni = {
            new Frazione(20, 30),
            new Frazione(10, 20),
            new Frazione(5, 1)
        };

        OpFrazioni operazioni = new OpFrazioni(frazioni);

        for (int i = 0; i < frazioni.length; i++) {
            System.out.println("Frazione " + i + ": " + frazioni[i].getValue());
        }

        System.out.println("\nSomma frazioni: " + operazioni.somma());
        System.out.println("\nDifferenza frazioni: " + operazioni.differenza());
        System.out.println("\nProdotto frazioni: " + operazioni.prodotto());
    }
    
}
