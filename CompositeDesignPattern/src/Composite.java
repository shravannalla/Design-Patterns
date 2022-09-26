import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    String name;

    public Composite(String name) {
        this.name = name;
    }

    List<Component> components=new ArrayList<>();

    public void addComponent(Component comp){
        components.add(comp);
    }

    @Override
    public void showprice() {

        System.out.println(name);
        for(Component c: components){
            c.showprice();
        }

    }
}
