package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat,red_car";
        //using substring print first 3 letters
        //System.out.println(list.substring(i,i+3));
       // System.out.println(list.substring(1, 4));
        //System.out.println(list.substring(2, 5));
        //System.out.println(list.substring(3, 6));
        //System.out.println(list.substring(4, 7));
        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i + 3));
            //if statement, if list.substring(i, i+3) equals "cat" or "car" ->print "cat or car found"
            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")) {
                System.out.println("cat or car found");
            }
        }



            //for(int i = 0; i < list.length()-2; i++){
                //String part= list.substring(i, i + 3);
                //System.out.println("part = " + part);
                //if(part.equals("cat") || part.equals("car")){
                   // System.out.println("cat or car found");
               // }
            //}
        //}

    }
}