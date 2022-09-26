public class Singleton {
    public static void main(String[] args) {
        //SingletonObject obj1=new SingletonObject();
        //SingletonObject obj1=SingletonObject.getInstance(); //eager
        //SingletonLazy obj1=SingletonLazy.getInstance(); //lazy
        // SingletonLazy obj2=SingletonLazy.getInstance();
        SingletonSynchronized obj1=SingletonSynchronized.getInstance(); //synchronized
        SingletonSynchronized obj2=SingletonSynchronized.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
