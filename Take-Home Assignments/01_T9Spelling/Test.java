import java.util.*;

class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        sc.nextLine();
        String output = "";

        for (int k = 0; k < first; k++) {
            String text = sc.nextLine();
            System.out.println(text);
        }

    }

}
