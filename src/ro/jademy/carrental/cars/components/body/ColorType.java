package ro.jademy.carrental.cars.components.body;


    public enum ColorType {
        WHITE("White"),
        BLACK("Black"),
        RED("Red"),
        YELLOW("Yellow"),
        SILVER("Silver"),
        BLUE("Blue"),
        DARKBLUE("Dark blue");

        private String colorType;

        ColorType(String color) {
            this.colorType = color;
        }

        public String getName() {
            return colorType;
        }
    }

