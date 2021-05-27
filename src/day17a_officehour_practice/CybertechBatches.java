package day17a_officehour_practice;

public class CybertechBatches {
    public static void main(String[] args) {
        String batchType = "US"; // Eu
        if (batchType.equals("US") || batchType.equals("us")) {
            boolean isMorning = false;
            if (isMorning) {
                System.out.println("Class time are 10 - 5 EST. M,T,Th,F");
            } else {
                System.out.println("Class time are 7-10 EST.M,T,W,Th,S,S");
            }
        } else if (batchType.equals("EU") || batchType.equals("eu")){
            System.out.println("Class times are 10 - 5EST. M,T,W,Th,F");
        }else {
            System.out.println("Invalid batch type");  
        }




        
    }
}