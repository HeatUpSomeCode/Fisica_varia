public class Main {

    public static void main(String[] args) {

        //Costruire una specie di "camera di combustione a gpl".

        //Ipotesi : camera da 1 lt / ora di gpl
        CameraCombustione camera = new CameraCombustione(new Dimensioni(1,1,1),Combustibile.GPL,0.99);
        camera.aggiungiCombustibile(100);

        CampioneSperimentale oggetto1 = new CampioneSperimentale(1000, CaloriSpecifici.FERRO.getCaloreSpecifico(),1500);


        //Ipotesi : La simulazione verifica i cambiamenti ogni minuto , 1/60 di ora

        double caloreProdottoInUnMinuto = 0;
        double variazioneTemperatura = 0;
        double perditaAmbiente = -(1);

        while (camera.getQtaCombustibileRimanente() > 0){
            try {
                Thread.sleep(30);
                if(oggetto1.getTemperaturaOggetto()>100){
                    printValue(camera, oggetto1);
                    oggetto1.setTemperaturaOggetto(oggetto1.getTemperaturaOggetto() + perditaAmbiente);
                }else {
                    caloreProdottoInUnMinuto =((camera.caloreProdotto()) * 1000000);
                    //(camera.caloreProdotto()) * 1000000;//MJ prodotti in 60 secondi * 1M = J prodotti in 60 sec
                    //Per aumentare 1 kg di 1 grado serve tot calore specifico
                    variazioneTemperatura = caloreProdottoInUnMinuto / (oggetto1.getMassaKgOggetto() * oggetto1.getCaloreSpecificoOggetto()) + perditaAmbiente;
                    oggetto1.setTemperaturaOggetto(oggetto1.getTemperaturaOggetto() + variazioneTemperatura);
                    printValue(camera, oggetto1);
                }

                /*
                * 440 j alzano di 1 grado la temperatura di 1 kg di ferro
                * 440 j * 1000 kg = 440.000 J alzano di 1 grado la temperatura di 1000 kg di ferro
                * 440.000 J * 103 gradi = 45.000.000 J che è il valore prodotto dalla combustione di gpl per un ora
                * Ossia in un ora alzo di 103 gradi 1000 kg di ferro
                * in un minuto : 103 / 60 = 1.72 gradi kelvin
                *
                * Ho il calore prodotto 700.000 J
                * Ho 1000 Kg di materiale
                * Se il materiale era a 100 gradi , a quanto sarà dopo?
                *
                * */
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //CampioneSperimentale oggetto1 = new CampioneSperimentale(1000, CaloriSpecifici.FERRO.getCaloreSpecifico(),1500);
        //CampioneSperimentale oggetto2 = new CampioneSperimentale(100, CaloriSpecifici.ACQUA.getCaloreSpecifico(),20);

        //double temperaturaSoluzione = getTemperaturaSoluzione(oggetto1,oggetto2);


        //System.out.println("Risultato : " + temperaturaSoluzione);
    }

    private static void printValue(CameraCombustione camera, CampioneSperimentale oggetto1) {
        System.out.println(camera.toString() + "\n" + oggetto1.toString());
    }

    private static double getTemperaturaSoluzione(CampioneSperimentale oggetto1,CampioneSperimentale oggetto2) {
        double massaKgOggetto1 = oggetto1.getMassaKgOggetto();//1 t di ferro
        double massaKgOggetto2 = oggetto2.getMassaKgOggetto();//3000 litri acqua
        double caloreSpecificoOggetto1 = oggetto1.getCaloreSpecificoOggetto();//Ferro
        double caloreSpecificoOggetto2 = oggetto2.getCaloreSpecificoOggetto();
        double temperaturaOggetto1 = oggetto1.getTemperaturaOggetto();
        double temperaturaOggetto2 = oggetto2.getTemperaturaOggetto();

        double temperaturaSoluzione = ((massaKgOggetto1 * caloreSpecificoOggetto1 * temperaturaOggetto1)
                + (massaKgOggetto2 * caloreSpecificoOggetto1 * temperaturaOggetto2) )
                /
                ((massaKgOggetto1 * caloreSpecificoOggetto1)
                        + (massaKgOggetto2 * caloreSpecificoOggetto2));
        return temperaturaSoluzione;
    }
}