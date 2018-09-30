package ro.jademy.carrental.cars.components.body;

public class BodyKitType {

    private String bodySedan;
    private String bodyHatchback;
    private String bodyCoupe;
    private String bodySuv;

    public BodyKitType(String bodySedan, String bodyHatchback, String bodyCoupe, String bodySuv) {
        this.bodySedan = bodySedan;
        this.bodyHatchback = bodyHatchback;
        this.bodyCoupe = bodyCoupe;
        this.bodySuv = bodySuv;
    }

    public String getBodySedan() {
        return bodySedan;
    }

    public String getBodyHatchback() {
        return bodyHatchback;
    }

    public String getBodyCoupe() {
        return bodyCoupe;
    }

    public String getBodySuv() {
        return bodySuv;
    }
}
