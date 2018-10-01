package ro.jademy.carrental.cars.components.body;


public enum BodyKitType {
    SEDAN("Sedan"),
    COUPE("Coupe"),
    HATCHBACK("Hatchback"),,
    SUV("SUV");

    private String bodyType;

    BodyKitType(String body) {
        this.bodyType = body;
    }

    public String getName() {
        return bodyType;
    }
}
