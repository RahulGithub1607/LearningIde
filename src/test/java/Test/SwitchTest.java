package Test;

public class SwitchTest {
    public static void main(String[] args) {
        int n=10;
        switch (n){
            case 20:
                System.out.println("This is 20");
                break;
            case 30:
                System.out.println("This is 30");
                break;
            case 10: {
                System.out.println("This is 40");
                System.out.println("This is second print in 40");
                break;
            }
                //default -> throw new IllegalStateException("Unexpected value: " + n);
            default:
                System.out.println("This is default block");
        }
    }
}
