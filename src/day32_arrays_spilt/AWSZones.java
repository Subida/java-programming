package day32_arrays_spilt;

public class AWSZones {
    public static void main(String[] args){
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deploying of etsy app to AWS zones......");
        String[] zonesToDeploy = zones.split(",");
        for(String eachZone:zonesToDeploy){
            System.out.println("Deploying ["+ app+"] to " + eachZone + "...");
        }
    }
}
