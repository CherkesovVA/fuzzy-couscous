import java.util.Scanner;

public class FistClass {

    public static void main(String[] args) {
      /*  System.out.println("Hi!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add you Id and name:");
        Person per = new Person(scanner.nextLine(), scanner.nextLine());
        System.out.println(per.toString());
        System.out.println("Add you Friend:");
        per.setFriends(scanner.nextLine());
        System.out.println(per.toString());
        System.out.println("Add URL for friend's photo");
        per.setUrl(scanner.nextLine());
        System.out.println(per.toString());
*/
//       /*
                System.out.println("Hi");
                System.out.println("----- That's an example.------");
                Person per = new Person("123", "Ivanov Ivan" );
                System.out.println(per.toString());
                per.setFriends("Petr");
                System.out.println(per.toString());
                per.setUrl("https://1.1.1.1.....");
                System.out.println(per.toString());
                System.out.println("----- The end.------");
                System.out.println("Add yourself according to example");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Add you Id:");
                per.setId(scanner.nextLine());
                System.out.println("Add you Name:");
                per.setName(scanner.nextLine());
                System.out.println(per.toString());
                System.out.println("Add you Friend:");
                per.setFriends(scanner.nextLine());
                System.out.println(per.toString());
                System.out.println("Add URL for friend's photo");
                per.setUrl(scanner.nextLine());
                System.out.println(per.toString());
   //     */
    }

}
