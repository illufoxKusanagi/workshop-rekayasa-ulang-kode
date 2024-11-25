
class SpecialOrder {

    private String specialInstructions;

    public SpecialOrder(String specialInstructions) {
        validateInstructions(specialInstructions);
        this.specialInstructions = specialInstructions;
    }

    private void validateInstructions(String instructions) {
        if (instructions == null || instructions.isEmpty()) {
            throw new IllegalArgumentException("Special instructions cannot be null or empty.");
        }
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }
}
