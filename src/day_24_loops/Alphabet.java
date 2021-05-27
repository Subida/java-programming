package day_24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        // System.out.println("letter = " + letter);
        //letter++;
        // System.out.println("letter " + letter);
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        //print alhabet reverse order
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
        }
        System.out.println();
        int count = 0;
        for(int a = 0; a < 4; a++){
            if(a == 3) continue;
            for(int b = a + 1; b < 5; b ++){
                count ++;
                if(b ==3) break;
            }
        }
        System.out.println(count);
        }
    }
