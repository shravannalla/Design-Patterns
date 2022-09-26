package company;

public class Shop {
    public static void main(String[] args) {
        //Camera c=new Camera(48,8,3500,1080);
        Camera c=new CameraBuilder().setMegaPixels(64).setScreenSize(7).getCamera();
        System.out.print(c);
    }
}
