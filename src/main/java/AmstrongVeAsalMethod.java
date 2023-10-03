public class AmstrongVeAsalMethod {
    public static void main(String[] args) {
        // isAmstrong(54748);

        //  factoriel(7);

        asalMı(-5);


    }

    public static void isAmstrong(int sayı) {
        int sum = 0;

        String a = String.valueOf(sayı);
        String[] b = a.split("");
        for (String w : b) {

            int k = Integer.valueOf(w);
            sum += Math.pow(k, a.length());


        }

        if (sum == sayı) {

            System.out.println("SAYI AMSTRONG");
        } else System.out.println("SAyı amstrong değil");

    }


    public static void factoriel(int sayi) {

        int sum = 1;

        for (int i = sayi; i > 0; i--) {

            sum *= i;

        }
        System.out.println(sayi + "!= " + sum);


    }


    public static void asalMı(int sayi1) {
        int sum = 0;
        for (int i = 1; i <= sayi1; i++) {

            if(sayi1%i==0){
                sum+=i;

            }
        }
        if (sum==sayi1+1){
            System.out.println("SAyı asal");

        }else   System.out.println("Sayı asal değil");
    }

}
