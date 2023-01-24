public enum CaloriSpecifici {
    //Tutti i valori del calore specifico sotto sono in J / KG
    IDROGENO(14304),
    ELIO(5193),
    LITIO(3582),
    BERILLIO(1825),
    BORO(1026),
    CARBONIO(710),
    AZOTO(360.4),
    OSSIGENO(920),
    FLUORO(824),
    NEON(103),//10o elemento
    SODIO(1230),
    MAGNESIO(1020),
    ALLUMINIO(896.9),
    SILICIO(700),
    FOSFORO(769),
    ZOLFO(710),
    CLORO(480),
    ARGON(520),
    POTASSIO(757),
    CALCIO(632),//20o elemento
    SCANDIO(568),
    TITANIO(520),
    VANADIO(490),
    CROMO(450),
    MANGANESE(480),
    FERRO(440),//26o elemento
    COBALTO(420),
    NICHEL(440),
    RAME(385),
    ZINCO(390),//30o elemento
    GALLIO(370),
    GERMANIO(320),
    ARSENICO(330),
    SELENIO(320),
    BROMO(480),
    KRIPTON(248),
    RUBIDIO(363),
    STRONZIO(300),
    ITTRIO(300),
    ZIRCONIO(270),//40o elemento
    ACQUA(4184),
    PLASTICA(2218.60);//POLIETILENE 1000 : 0,53 KCAL/kG

    private double caloreSpecifico;

    public double getCaloreSpecifico(){
        return caloreSpecifico;
    }

    private CaloriSpecifici(double caloreSpecifico){
        this.caloreSpecifico = caloreSpecifico;
    }
}
