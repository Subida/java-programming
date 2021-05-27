package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
//        String carModel;
//        carModel="BMW 5";
        String carModel="Dodge charger";
        String DriverName="Donald Trump";
        String LicenceNumber="LetsMakeJavaGreatAgain12345";
        short speed=55;
        boolean isAutomatic=true;
        char LicenceClass='D';
        System.out.println("Car model : "+ carModel);
//        dodge charger is car model.
        System.out.println(carModel+ "is car model.");
        System.out.println("Driver name: "+DriverName);
        System.out.println(DriverName+" is driving a car");
//        Donald Trump is driving Dodge charger
        System.out.println(DriverName+" is driving "+carModel);
        System.out.println("Current speed is: "+speed);
//        Current speed is :55mph
        System.out.println("Current speed : "+speed+"mph");
        System.out.println("is car automatic -> "+isAutomatic);
        System.out.println(LicenceClass +" "+isAutomatic);
    }
}
