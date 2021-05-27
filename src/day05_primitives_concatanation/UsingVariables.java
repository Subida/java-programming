package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int numb1=100;
        int numb2=numb1;
        System.out.println(numb1);//100
        System.out.println(numb2);//100

        numb1=200;
        System.out.println(numb1);//200
        System.out.println(numb2);//100

        int n1=55;
        int n2=n1;
        int n3=n2;
        /*n1->55
        n2->55
        n3->55
         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode=22182;
        int parvinsZipCode=inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode=20007;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

    }
}
