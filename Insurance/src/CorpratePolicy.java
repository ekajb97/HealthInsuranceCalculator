public class CorpratePolicy extends Policy {

    private float corpDiscount;

    public CorpratePolicy(int policyId) {
        super(policyId);
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public float calcPolicy(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
