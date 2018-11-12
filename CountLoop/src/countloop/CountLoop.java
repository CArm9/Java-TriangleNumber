package countloop;
public class CountLoop {
    public static void main(String[] args) {
        int count = 0;
        for(int i=0;  i<=12; i++){
            for(int j=0; j<=i; j++){
               System.out.print(count);
               count++;
            }
            System.out.print("\n");
        }
    }
}
