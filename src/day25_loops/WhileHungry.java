package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFUll = 3;
        //it takes 3 bananas for isHungry to be set to false
        //while hungry
        //eat banana 1
        //if bananas reaches countToFull
        //set hungry to false
        //increase banana by 1
        //while(isHungry || bananas != countToFull)
        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana: " + bananas);
            //isHungry = bananas == countToFull? false : true;
            if (bananas == countToFUll) {
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, lets get back to study");



        int z = 5;
        for(int i =5; i > 0; i--){
            z += i;
        }
        System.out.println(z);
    }
}