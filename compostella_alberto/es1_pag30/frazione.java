public class Frazione{
    private int dem;
    private int num;

    public Frazione(){
        dem = 0;
        num = 0;
    }

    public void setdem(int valore) {
        dem = valore;
    }

    public void setnum(int valore) {
        num = valore;
    }

    public int getdem() {
        return dem;
    }

    public int getnum() {
        return num;
    }

    public void calcolaSomma(Frazione frazione_2) {
        int dem_final = dem * frazione_2.getdem();
        int num_final = (num * frazione_2.getdem()) + (dem * frazione_2.getnum());

        System.out.println("Somma : " + num_final + "/" + dem_final);
    }

    public void calcolaDifferenza(Frazione frazione_2) {
        int dem_final = dem * frazione_2.getdem();
        int num_final = (num * frazione_2.getdem()) - (dem * frazione_2.getnum());

        System.out.println("Differenza : " + num_final + "/" + dem_final);
    }

    public void calcolaProdotto(Frazione frazione_2) {
        int dem_final = dem * frazione_2.getdem();
        int num_final = num * frazione_2.getnum();

        System.out.println("Prodotto : " + num_final + "/" + dem_final);
}


}
