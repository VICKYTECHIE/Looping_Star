public class Main {
    public static void main(String[] args) {
       for(int i=1;i<6;i++){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("_____________________________________________");
        for(int i=6;i>1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}