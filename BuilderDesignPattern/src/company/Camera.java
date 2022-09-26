package company;

public class Camera {
    private int megaPixels;
    private int screenSize;
    private int batteryInMaH;
    private int videoResolution;

    public Camera(int megaPixels, int screenSize, int batteryInMaH, int videoResolution) {
        super();
        this.megaPixels = megaPixels;
        this.screenSize = screenSize;
        this.batteryInMaH = batteryInMaH;
        this.videoResolution = videoResolution;
    }



    @Override
    public String toString(){
        return "Camera [MegaPixel=" + megaPixels + ",ScreenSize=" + screenSize + ",Battery=" + batteryInMaH + ",VideoResolution=" + videoResolution + "]";

    }
}
