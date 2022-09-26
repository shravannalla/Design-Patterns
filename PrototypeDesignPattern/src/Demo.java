public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        MobileStore ms=new MobileStore();
        ms.setStoreName("BigC");
        ms.loadData();

        MobileStore ms1=(MobileStore) ms.clone();
        ms.getMobiles().remove(2);
        ms1.setStoreName("Lot");

        System.out.println(ms);
        System.out.println(ms1);

    }
}
