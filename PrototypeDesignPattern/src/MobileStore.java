import java.util.ArrayList;
import java.util.List;

public class MobileStore implements Cloneable {
    private String storeName;
    List<Mobile> mobiles=new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public void loadData(){
        //no database connection for simplicity
        for(int i=1;i<=10;i++){
            Mobile m=new Mobile();
            m.setModelNumber(i);
            m.setModelName("Mobile"+i);
            getMobiles().add(m);
        }
    }

    @Override
    public String toString() {
        return "MobileStore{" +
                "storeName='" + storeName + '\'' +
                ", mobiles=" + mobiles +
                '}';
    }

    @Override
    protected MobileStore clone() throws CloneNotSupportedException {
        MobileStore store=new MobileStore();
        for(Mobile m: this.getMobiles()){
            store.getMobiles().add(m);
        }

        return store;
    }
}
