public class MobileCharging {

    private Charger charger;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void chargeSamsungGalaxy() {
        charger.charge();
    }
}
