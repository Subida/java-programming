package day16_seitch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 7;
        if (floorNum == 1){
            System.out.println("Floor 1 is selected. companies: Lobby, Verizon, Starbucks");
        } else if (floorNum ==2){
            System.out.println("Floor 2 is selected. companies: Cybertech, NASA, Intelsat");
        }else if (floorNum ==3){
            System.out.println("Floor 3 is selected. companies: lyft, BofA, Stake house");
        }
        else{
            System.out.println("Invalid floor - " + floorNum);
        }
        System.out.println("===========SWITCH STATEMENT VERSION=======");



        floorNum =4;
        switch (floorNum){
            case 1:
//               same as if (floorNum ==1)
                System.out.println("Floor 1 is selected. companies: Lobby, Verizon, Starbucks");
                break;// exit the switch
            case 2:
                System.out.println("Floor 2 is selected. companies: Cybertech, NASA, Intelsat");
                break;// exit the switch
            case 3:
                System.out.println("Floor 3 is selected. companies: lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }

    }
}
