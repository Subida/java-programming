package day32_arrays_spilt;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------FIND THE INDEX OF 'GLOVES' in items array-------");
        //use for loop with condition
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println(i);
                break;//exit for loop
            }
        }
        System.out.println("------set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);
        if (iPadExists) {
            System.out.println("We bought the iPad");
        } else {
            System.out.println("We forgot the Ipad");
        }

        System.out.println("-------print a report of each shopping item------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i]+" - #" +itemIDs[i]);
        }

        System.out.println("----- Look for 'jacket' in items and print all details");
        for(int i =0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + " -$" + prices[i] + " - #" + itemIDs);
                break;//stop searching after jacket is found
            }
        }
    }
}
