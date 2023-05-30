public class Prime {

    public static void primeNum(int number){
        for(int i = 2; i <= number; i++){
            int count = 0;
            for(int m = 2; m < i; m++){
                if(i % m == 0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i + " ");
            }
        }


    }
    public static void main(String[] args) {
        Prime.primeNum(150);
    }
}

