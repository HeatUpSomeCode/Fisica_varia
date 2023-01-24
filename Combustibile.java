public enum Combustibile {
    GPL(45.8);

    private double potereCalorificoMJKg;

    public double getPotereCalorificoMJKg() {
        return potereCalorificoMJKg;
    }

    private Combustibile(double potereCalorificoMJKg){
        this.potereCalorificoMJKg = potereCalorificoMJKg;
    }

    @Override
    public String toString() {
        return "Combustibile{" +
                "potereCalorificoMJKg=" + potereCalorificoMJKg +
                '}';
    }
}
