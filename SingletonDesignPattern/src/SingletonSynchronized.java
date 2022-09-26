public class SingletonSynchronized {
    private static SingletonSynchronized obj;
    private SingletonSynchronized(){

    }
    public static synchronized SingletonSynchronized getInstance(){
        if(obj==null){
            obj=new SingletonSynchronized();
        }
        return obj;
    }
}