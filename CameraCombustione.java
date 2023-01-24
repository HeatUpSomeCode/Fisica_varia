import java.awt.*;

public class CameraCombustione {

    Dimensioni dimensioni;
    Combustibile combustibile;
    private double qtaCombustibileRimanente;

    private double efficienza = 0;

    public CameraCombustione(Dimensioni dimensioni,Combustibile combustibile,double efficienza){
        this.dimensioni = dimensioni;
        this.combustibile = combustibile;
        if(efficienza < 1 && efficienza > 0){
            this.efficienza = efficienza;
        }else
            this.efficienza = 0.01;
    }

    public void aggiungiCombustibile(double qtaCombustibileInKg){
        if(qtaCombustibileInKg > 0) {
            this.qtaCombustibileRimanente = this.qtaCombustibileRimanente + qtaCombustibileInKg;
        }else {
            System.err.println("Valore negativo");
        }
    }

    public void variaPortata(double efficienza){
        if(efficienza < 1 && efficienza > 0) {
            this.efficienza = efficienza;
        }else
            System.err.println("Valore efficienza non valido");

    }

    public double caloreProdotto(){//Il 60 è per rappresentare il minuto
        double prodotto = 1;
        if(qtaCombustibileRimanente > 0) {
            this.qtaCombustibileRimanente = qtaCombustibileRimanente - ((dimensioni.getAltezza() * dimensioni.getLarghezza() * dimensioni.getProfondita()) / 60);
            prodotto = (((dimensioni.getAltezza() * dimensioni.getLarghezza() * dimensioni.getProfondita()) / 60) * this.combustibile.getPotereCalorificoMJKg()) * efficienza;
            return prodotto;
        }else
            return 0;
    }

    public double getQtaCombustibileRimanente() {
        return qtaCombustibileRimanente;
    }

    @Override
    public String toString() {
        return "CameraCombustione{" +
                "dimensioni=" + dimensioni +
                ", combustibile=" + combustibile +
                ", qtaCombustibileRimanente=" + qtaCombustibileRimanente +
                '}';
    }
}
