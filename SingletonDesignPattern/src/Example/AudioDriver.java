package Example;

public class AudioDriver {
    static AudioDriver obj=new AudioDriver();
    private AudioDriver(){

    }
    public static AudioDriver getInstance(){
        return obj;
    }
}
