import java.util.Scanner;
public class stream_test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = new String();
        while(true){
            str = scan.nextLine();
            System.out.println(str);
            if(str.equals("v")){
                break;
            }
        }
    }
}