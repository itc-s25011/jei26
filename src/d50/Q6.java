package d50;

public class Q6 {
    static void main(String[] args){
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        if(max > min){
            int tmp =max;
            max = min:
            min = tmp;
        }
        PrimeNunbers primeNunbers = new PrimeNumbers();
        primeNumbers.initializaPrimeNumbers(max);
        int[] prat = primeNunbers.getPart(min,max);
    }
}

class PrimeNumbers{

}