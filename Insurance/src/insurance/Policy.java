package insurance;

import java.util.*;
import javax.swing.JLabel;

public class Policy {

    private String policyId;

    private String hospCover;

    private String dtdExpences;

    private float total;

    private String policyType;
    
 

   
    
    //constructors
    public Policy(String policyId, String hospCover, String dtdExpences,
            float total, String policyType){
        
        this.policyId = policyId;
        this.hospCover = hospCover;
        this.dtdExpences = dtdExpences;
        this.total = total;
        this.policyType = policyType;
      
        
    }
    
    public Policy(String policyId, String hospCover, String dtdExpences){
        
        this.policyId = policyId;
        this.hospCover = hospCover;
        this.dtdExpences = dtdExpences;
        
    }
    
    
     public Policy(String policyId) {
           this.policyId = policyId;
    }
    
    public Policy(){
        
    }

    Policy(String policyId, String hospCover, String dtdExpenses, JLabel total, String policyType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //getter methods
    public String getPolicyId() {
        return policyId;
    }

    public String getHospCover() {
        return hospCover;
    }

    public String getDtdExpences() {
        return dtdExpences;
    }

    public float getTotal() {
        return total;
    }

    public String getPolicyType() {
        return policyType;
    }

    
    //setter methods
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setHospcover(String hospCover) {
        this.hospCover = hospCover;
    }

    public void setDtdExpences(String dtdExpences) {
        this.dtdExpences = dtdExpences;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public float calcPolicy(Customer customer) {
    
        //General base is 200 
        //and fee is the running total 
        float fee = 200f;
        
        
        //Gender calculations
        if(customer.getGender().equalsIgnoreCase("male"))
        {
            fee = fee * 2;
        }
        
        else if(customer.getGender().equalsIgnoreCase("female"))
        {
            fee = fee * 0.7f;
        }
        
        else
        {
            System.out.println("Input Gender!");
        }
        
        // Age Calculations:
         
        
        if(customer.getAge().equalsIgnoreCase("Under 35"))
        {
            fee = fee * 1.2f;
        }
        
        else if(customer.getAge().equalsIgnoreCase("35 to 55 Inclusive"))
        {
            fee = fee * 1.4f;
        }
        
        else if(customer.getAge().equalsIgnoreCase("56 to 70 Inclusive"))
        {
            fee = fee * 1.65f;
        }
        
        else if(customer.getAge().equalsIgnoreCase("Over 70"))
        {
            System.out.println("No quote available.");
        }
        
        
        ////////////////////////////////////////////////////////////////////////
 
        if(customer.getHealthconditions().size()>0)
        {
            ArrayList healthConditions = 
                    (ArrayList)customer.getHealthconditions();
        
        
        for(int i=0;i<healthConditions.size();i++)
        {
            switch(healthConditions.get(i).toString())
            {
                    case "Bone Marrow and Immune System":
                    fee = fee * 1.2f;  
                    break;
                    
                    case "Cancer":
                    fee = fee * 1.25f;
                    break;
                        
                    case "Cardiovascular diesease":
                    fee = fee * 1.3f;
                    break;
                    
                    case "Gastrointestinal":
                    fee = fee * 1.1f;    
                    break;
                        
                    case "Infections":
                    fee = fee * 1.1f;
                    break;    
                        
                    case "Kidneys":
                    fee = fee * 1.25f;
                    break;
                        
                    case "Lungs":
                    fee = fee * 1.25f;
                    break;
                        
                    case "Musuloskeletal":
                    fee = fee * 1.3f;
                    break;
                        
                    case "None":
//                    fee = fee;
                    break;    
                    
                    default: 
                        
            }
        } 
        
        }

         
        ////////////////////////////////////////////////////////////////////////
        
        if (customer.getOther().equalsIgnoreCase("yes"))
        {
            fee = fee * 1.5f;
        }
        
        else 
        {
            fee = fee;
        }
        
        if (customer.getSmoker().equalsIgnoreCase("yes"))
        {
            fee = fee + 75;
        }
        
        else
        {
            fee = fee - 100;
        }
        
        
        if (getHospCover().equalsIgnoreCase("Public Hospital"))
        {
            fee = fee;
        }
        
        else if (getHospCover().equalsIgnoreCase("Selected Private Hospitals"))
        {
            fee = fee * 1.2f;
        }
        
        else
        {
            fee = fee * 1.3f;
        }
        
        if (getDtdExpences().equalsIgnoreCase("Standard"))
        {
            fee = fee;
        }
        
        else if (getDtdExpences().equalsIgnoreCase("Enhanced")) 
        {
            fee = fee * 1.2f;
            
        }
        
        else
        {
            fee = fee * 1.3f;
        }
        
//        if (getPolicyType().equalsIgnoreCase("Individual"))
//        {
//            fee = fee;
//        }
//        
//        else
//        {
//            fee = fee *0.9f;       
//        }
        
        return fee;
    }
       
    
    
    public String toString() {
        return "Policy ID: " + policyId + "\nHospital Cover: " + hospCover
        + "\nDay to Day Expences: " + dtdExpences + "\nTotal: " + total
        + "\nPolicy Type: " + policyType;
          
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
