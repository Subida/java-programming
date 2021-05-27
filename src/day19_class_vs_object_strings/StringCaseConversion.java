package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java Is Fun";
        System.out.println(word);
        System.out.println(word.toLowerCase());//convert to all lowercase
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase= word.toLowerCase();
        System.out.println("wordInLCase= "+ wordInLcase);

        word = word.toLowerCase();
        System.out.println("word= " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        
        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);


    }
}
