package company;

public class CameraBuilder {

    private int megaPixels;
    private int screenSize;
    private int batteryInMaH;
    private int videoResolution;

    public CameraBuilder setMegaPixels(int megaPixels){
        this.megaPixels=megaPixels;
        return this;
    }
    public CameraBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public CameraBuilder setBatteryInMaH(int batteryInMaH){
        this.batteryInMaH=batteryInMaH;
        return this;
    }
    public CameraBuilder setVideoResolution(int videoResolution){
        this.videoResolution=videoResolution;
        return this;
    }

    public Camera getCamera()
    {
        return new Camera(megaPixels, screenSize, batteryInMaH, videoResolution);
    }
}
