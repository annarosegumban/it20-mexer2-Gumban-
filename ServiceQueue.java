import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ServiceQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

  
        System.out.print("How many students? ");
        int count = Integer.parseInt(scanner.nextLine().trim());


        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = scanner.nextLine().trim();
            queue.offer(name);
        }

        System.out.println("\nService Order:");

  
        boolean firstServed = false;
        while (!queue.isEmpty()) {
            String served = queue.poll();
      
            System.out.println("Serving: " + served);

        
            if (!firstServed) {
                firstServed = true;
                System.out.print("Enter name of new student: ");
                String newStudent = scanner.nextLine().trim();
                queue.offer(newStudent);
                System.out.println("Updated service order: " + queue);
            }
        }

        scanner.close();
    }
}