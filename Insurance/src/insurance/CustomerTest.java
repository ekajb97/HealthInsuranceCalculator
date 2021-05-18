
package insurance;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

    
        ArrayList<String> healthConditions = new ArrayList<String>();
//        healthConditions.add("Bone Marrow and Immune System");
//        healthConditions.add("Cancer");
//        healthConditions.add("Cardiovascular disease");
//        healthConditions.add("Gastrointestinal");
//        healthConditions.add("Infections");
//        healthConditions.add("Kidneys");
//        healthConditions.add("Lungs");
//        healthConditions.add("Musculoskeletal");
//        healthConditions.add("None");
        
     
        
        
        
        // Create a Customer
        Customer c1 = new Customer("Mark", "Henry", "Male", 
        "35 to 55 Inclusive", healthConditions,  "No", "No");
        
        System.out.println(c1.toString());
        
        System.out.println("\n");
        
                
        // Create a Policy 
        Policy p1 = new Policy("123", "Selected Private Hospitals", "Comprehensive");
        
        System.out.println(p1.toString());
      
        int finalAmount = (int) p1.calcPolicy(c1);
        
        System.out.println("Final amount: "+finalAmount);
        
        //test full customer constructor with policy
//        IndividualPolicy ip1 = new IndividualPolicy("123");
//        ip1.setHospcover("Private Hospitals");
//        ip1.setDtdExpences("Comprehensive");
//        finalAmount = ip1.calcPolicy(c1);
//        
//        System.out.println("Final amount: "+finalAmount);
        
        
        CorpratePolicy cp1 = new CorpratePolicy("123");
        cp1.setHospcover("Private Hospitals");
        cp1.setDtdExpences("Comprehensive");
        finalAmount = (int) cp1.calcPolicy(c1);
        
        System.out.println("Final amount with corperate discount : "
                +finalAmount);
       
    }
    
}
