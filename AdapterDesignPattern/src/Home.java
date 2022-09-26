public class Home {
    public static void main(String[] args) {
        //SamsungChampCharger sc=new SamsungChampCharger();
        Charger ch=new ChargerAdaptor();
        MobileCharging mobileCharging=new MobileCharging();
        mobileCharging.setCharger(ch);
        mobileCharging.chargeSamsungGalaxy();
    }
}
