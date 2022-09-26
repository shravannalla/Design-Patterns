public class SingletonObject {
    private static SingletonObject obj=new SingletonObject(); //eager
    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        return obj;
    }
}
