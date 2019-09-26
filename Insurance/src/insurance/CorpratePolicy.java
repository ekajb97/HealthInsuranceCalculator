package insurance;

import java.util.*;

public class CorpratePolicy extends Policy {

    private float corpDiscount;
    
    private float finalAmount;
    
    public CorpratePolicy(String policyId) {
        super(policyId);
    }

    @Override
    public String toString() {
    return super.toString() + "Corperate Discount: 10%" + finalAmount; }

    public float calcPolicy(Customer customer) {
    
        float discount;
        float corpFee;
  

        discount = super.calcPolicy(customer);
        
        discount = discount * 0.1f;
        
        corpFee = super.calcPolicy(customer);       
    
        finalAmount = corpFee - discount;
    
        return finalAmount;
        
    }
    
}
