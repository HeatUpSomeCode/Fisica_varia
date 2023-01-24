public class Dimensioni {

    private double larghezza,altezza,profondita;

    public Dimensioni(double larghezza, double altezza, double profondita) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getProfondita() {
        return profondita;
    }

    @Override
    public String toString() {
        return "Dimensioni{" +
                "larghezza=" + larghezza +
                ", altezza=" + altezza +
                ", profondita=" + profondita +
                '}';
    }
}
