import java.util.*;
import java.io.*;

class Teque {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        CircularLinkedList list = new CircularLinkedList();
        int operations = Integer.parseInt(br.readLine());

        for (int i = 0; i < operations; i++) {
            String[] opLine = br.readLine().split(" ");
            String command = opLine[0];
            int number = Integer.parseInt(opLine[1]);

            switch (command) {
                case "push_back":
                    list.addLast(number);
                    System.out.println("pushed back " + number);
                    break;
                case "push_front":
                    list.addFirst(number);
                    System.out.println("pushed front " + number);
                    break;
                case "push_middle":
                    list.addMiddle(number);
                    System.out.println("pushed middle " + number);
                    break;
                case "get":
                    System.out.println(list.get(number));
                    System.out.println("gotten " + number);
            }

        }

    }
}
