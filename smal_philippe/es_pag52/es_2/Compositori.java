public class Compositori extends Musicisti{
    private String composizione;

    public void setComposizione(String composizione_enter) {
        composizione = composizione_enter;
    }

    public String getComposizione() {
        return composizione;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComposizione: " + composizione;
    }
}
