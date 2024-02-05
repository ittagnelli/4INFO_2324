public class camion extends automezzo {
    private String Tipo_carico;
    private double carico_max;
    public camion(String tipo_carico, double carico_max, double peso, int cilindrata){
        super(peso, cilindrata);
        this.Tipo_carico = tipo_carico;
        this.carico_max = carico_max;

    }
    public String getTipo_carico() {
        return Tipo_carico;
    }
    public double getCarico_max() {
        return carico_max;
    }

    @Override
    public String toString() {
        return "camion{carico massimo: "+carico_max+", tipo carico: "+Tipo_carico+"}";
    }
}


