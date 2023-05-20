public class Question3 {
    public static void main(String[] args) {
        int max = 0;
        int i = 0;
        boolean see = true;
       
        while(see) {
            max = 3 * i;
            if(max < 100){
                System.out.println(max);
                i++;
            } else {
               see = false;
            }
        }
    }
}
