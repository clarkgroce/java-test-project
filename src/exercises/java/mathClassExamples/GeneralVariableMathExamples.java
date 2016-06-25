package exercises.java.mathClassExamples;

public class GeneralVariableMathExamples {

    public static void main(String[] args) {

//        int test = 345;
//        int test2 = 534;
//
//        int sum = test + test2;
//        float sumfee = (float) (sum + 1.99);
//
//        System.out.println(sumfee);

        int price = 12;
        int amount = 23;

        int totalprice = price * amount;

        int discoount = 20; //20%
        int priceafterdiscount = (totalprice * (100 - discoount)/100);

        System.out.println(priceafterdiscount);

    }

}
