package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length() == 0);
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.equals(""));

        String jobTitle1 = " ";
        System.out.println(jobTitle1.isEmpty());
        System.out.println(jobTitle1.length() == 0);
        System.out.println(jobTitle1.equals(""));

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("JobTitle is empty");
        } else {
            System.out.println("job title is not empty");
        }

        System.out.println((jobTitle.equals("")));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("job title is not empty");
        }

     String veggie= "carrots";
        System.out.println(veggie.isEmpty());
        //if veggie is not empty, print we have carrots
        if(!veggie.isEmpty()){
            System.out.println("we have "+ veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty());error
    }
}