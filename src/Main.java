import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Student> arr = new ArrayList<Student>();

    public static void main(String[] args) {

        String r = "i";

        Student stu = new Student();
        do {

            System.out.println("1.Add student\n2.Show All Students\n3.Search Student By ID\n4.Search Student By Name\n5.Update Student\n6.Delete Student\nChoose Operation: ");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:

                    stu.add();
                    break;
                case 2:
                    stu.show();
                    break;

                case 3:
                    stu.searchbyID();

                    break;
                case 4:
                    stu.searchbyName();


                    break;
                case 5:
                    stu.update();

                    break;
                case 6:
                    stu.Delete();

                    break;
                default:
                    System.out.println("Try again");
            }
            System.out.println("Do you want to continue ( y /n )");
            Scanner sc1 = new Scanner(System.in);
            String choose1 = sc1.nextLine();
            r = choose1;
            System.out.println(r);
        } while (r.equals("y"));


    }


}
