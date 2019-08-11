package by.epam.pretraining.task5.exercise5;

public class Designer {
    private String sweetness;
    private String packing;

    public Designer(Type type) throws IllegalAccessException {
        if (type == Type.CANDY) {
            this.sweetness = "Candy";
            this.packing = "Multi-colored packing";
        } else if (type == Type.CHOCOLATE) {
            this.sweetness = "Chocolate";
            this.packing = "Red packing";
        } else if (type == Type.WAFFLES) {
            this.sweetness = "Waffles";
            this.packing = "Without packing";
        } else {
            throw new IllegalAccessException("Wrong type: " + type);
        }
    }

    public String sweetness() {
        return this.sweetness;
    }

    public String packing() {
        return this.packing;
    }

    @Override
    public String toString() {
        return "sweetness='" + sweetness + '\'' +
                ", packing='" + packing + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Designer designer = (Designer) o;
        return sweetness.equals(designer.sweetness) &&
                packing.equals(designer.packing);
    }
}
