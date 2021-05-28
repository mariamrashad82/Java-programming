package day32_arrays_split;

public class AWSZone {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "Us-East-1,Us-West-2,Us-West-1";
        System.out.println("\n________________Starting deployment of etsy app to AWS Zones__________________\n");
        String[] zonesToDeploy = zones.split(",");
        for(String eachZone : zonesToDeploy){
            System.out.println("Deploying [" + app + "] to " + eachZone + "...");
            System.out.println("Deployment completed for " + eachZone + "...\n");
        }
        System.out.println(" ____ ALL deployment complete , traffic ______");
    }
}
