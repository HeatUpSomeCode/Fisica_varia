public class CampioneSperimentale {

    private double massaKgOggetto = 0.0;
    private double caloreSpecificoOggetto = 0.0;
    private double temperaturaOggetto = 0.0;

    public CampioneSperimentale(double massaKgOggetto, double caloreSpecificoOggetto, double temperaturaOggetto) {
        this.massaKgOggetto = massaKgOggetto;
        this.caloreSpecificoOggetto = caloreSpecificoOggetto;
        this.temperaturaOggetto = temperaturaOggetto;
    }

    public double getMassaKgOggetto() {
        return massaKgOggetto;
    }

    public void setMassaKgOggetto(double massaKgOggetto1) {
        this.massaKgOggetto = massaKgOggetto1;
    }

    public double getCaloreSpecificoOggetto() {
        return caloreSpecificoOggetto;
    }

    public void setCaloreSpecificoOggetto(double caloreSpecificoOggetto1) {
        this.caloreSpecificoOggetto = caloreSpecificoOggetto1;
    }

    public double getTemperaturaOggetto() {
        return temperaturaOggetto;
    }

    public void setTemperaturaOggetto(double temperaturaOggetto1) {
        this.temperaturaOggetto = temperaturaOggetto1;
    }

    @Override
    public String toString() {
        return "CampioneSperimentale{" +
                "massaKgOggetto1=" + massaKgOggetto +
                ", caloreSpecificoOggetto1=" + caloreSpecificoOggetto +
                ", temperaturaOggetto1=" + temperaturaOggetto +
                '}';
    }
}
