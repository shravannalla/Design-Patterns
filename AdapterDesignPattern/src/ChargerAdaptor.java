public class ChargerAdaptor implements Charger{

    SamsungChampCharger sc=new SamsungChampCharger();

    @Override
    public void charge() {
        sc.plug();
    }
}
