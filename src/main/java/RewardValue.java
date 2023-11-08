public class RewardValue {
    private double cashValue;
    private double milesValue;

    public static final double MILES_TO_CASH_CONVERSION = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double milesValue, int isMiles) {
        this.milesValue = milesValue;
    }
    
    //convert miles to the cash value of the RewardValue
    public double getCashValue() {
        return milesValue * MILES_TO_CASH_CONVERSION;
    }

    // Converts the cash value to how many miles the RewardValue is worth
    public double getMilesValue() {
        return cashValue / MILES_TO_CASH_CONVERSION;
    }
}
