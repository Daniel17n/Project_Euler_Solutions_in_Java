public class Problem8 {
    public static final int size = 13;

    public static void main(String[] args) {
        long n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13;
        String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        long prod = 0, newProd;
        for (int i = 0; i < num.length() - size + 1; i++) {
            n1=Character.getNumericValue(num.charAt(i));
            n2=Character.getNumericValue(num.charAt(i+1));
            n3=Character.getNumericValue(num.charAt(i+2));
            n4=Character.getNumericValue(num.charAt(i+3));
            n5=Character.getNumericValue(num.charAt(i+4));
            n6=Character.getNumericValue(num.charAt(i+5));
            n7=Character.getNumericValue(num.charAt(i+6));
            n8=Character.getNumericValue(num.charAt(i+7));
            n9=Character.getNumericValue(num.charAt(i+8));
            n10=Character.getNumericValue(num.charAt(i+9));
            n11=Character.getNumericValue(num.charAt(i+10));
            n12=Character.getNumericValue(num.charAt(i+11));
            n13=Character.getNumericValue(num.charAt(i+12));
            newProd = (n1*n2*n3*n4*n5*n6*n7*n8*n9*n10*n11*n12*n13);
            if(prod < newProd) prod = newProd;
        }
        System.out.println(prod);


/*
        long[] result = splitter(num);
        System.out.println("The thirteen adjacent digits in the 1000-digit number that have the greatest product are: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", result[i]);;
        }
        long answer = 1;
        for (int i = 0; i < size; i++) {
            answer *= result[i];
        }
        System.out.printf("= %d", answer);

 */
    }
}
