package ro.jademy.carrental.cars.components.body;

public class ColorType {

    private String whiteColor;
    private String blackColor;
    private String greyColor;
    private String redColor;

    public ColorType(String whiteColor, String blackColor, String greyColor, String redColor) {
        this.whiteColor = whiteColor;
        this.blackColor = blackColor;
        this.greyColor = greyColor;
        this.redColor = redColor;
    }

    public String getWhiteColor() {
        return whiteColor;
    }

    public String getBlackColor() {
        return blackColor;
    }

    public String getGreyColor() {
        return greyColor;
    }

    public String getRedColor() {
        return redColor;
    }
}
