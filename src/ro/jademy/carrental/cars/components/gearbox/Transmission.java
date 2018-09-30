package ro.jademy.carrental.cars.components.gearbox;

public class Transmission {

    private String frontWheelDrive;
    private String backWheelDrive;
    private String fourWheelDrive;


    public Transmission(String frontWheelDrive, String backWheelDrive, String fourWheelDrive){
        this.frontWheelDrive=frontWheelDrive;
        this.backWheelDrive=backWheelDrive;
        this.fourWheelDrive=fourWheelDrive;
    }

    public String getFrontWheelDrive() {
        return frontWheelDrive;
    }

    public String getBackWheelDrive() {
        return backWheelDrive;
    }

    public String getFourWheelDrive() {
        return fourWheelDrive;
    }
}
