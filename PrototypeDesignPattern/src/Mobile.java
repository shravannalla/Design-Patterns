public class Mobile {
    private int modelNumber;
    private String modelName;

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "modelNumber=" + modelNumber +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
