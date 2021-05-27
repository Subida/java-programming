package day32_arrays_spilt;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        System.out.println(cats.length());
        int count = 0;
        for (int i = 0; i < cats.length() - 2; i++) {
            if (cats.substring(i, i + 3).equals("cat")) {
                count++;
            }
        }
        System.out.println("count of cats = " + count);

        String catsTypes = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = catsTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length - 1));

        for(String type: catsArray){
            System.out.println(type);
        }


    }
}