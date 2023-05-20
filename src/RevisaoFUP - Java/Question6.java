public class Question6 {
    public static void main(String[] args) {
        int number = 0;
        int i = 1;
        int left;
        boolean verifc = true;

        while(verifc) {
            if(number < 100){
                System.out.println(number);

            } else {
                verifc = false;
            }
            
            left = number;
            number = number + i;
            i = left;

        }


    }
}
