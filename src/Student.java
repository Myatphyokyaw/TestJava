import java.util.Scanner;

public class Student {


    int ID;
    String Name;
    int age;
    String Address;
    Main main = new Main();


    void add() {
        Student stu = new Student();
        int patientID = main.arr.size();
        Scanner sc = new Scanner(System.in);
        stu.ID = patientID + 1;
        System.out.println("Enter Student name: ");
        stu.Name = sc.nextLine();
        System.out.println("Enter Student Age: ");
        stu.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Student Address: ");
        stu.Address = sc.nextLine();
        main.arr.add(stu);
    }

    void show() {
        System.out.println("Student ID \t Student Name \t Age \t Address");
        for (int i = 0; i < main.arr.size(); i++) {
            System.out.println("\t" + main.arr.get(i).ID + "\t\t\t" + main.arr.get(i).Name + " \t\t "
                    + main.arr.get(i).age + " \t  " + main.arr.get(i).Address + "");
        }
    }

    void Delete() {
        int id=0;
        try{
            Student stu = new Student();
            System.out.println("Enter Student ID: ");
            Scanner sc = new Scanner(System.in);
            int id1 = Integer.parseInt(sc.nextLine());
            id=id1;
            main.arr.remove(id1 - 1);
        }catch (IndexOutOfBoundsException e){
            System.out.println("ID -> "+id+" is not find please type other id");
        }



    }

    void searchbyID() {
        System.out.println("Enter Student ID: ");
        Scanner sc = new Scanner(System.in);
        int id1 = Integer.parseInt(sc.nextLine());
        System.out.println("Student ID \t Student Name \t Age \t Address");
        System.out.println("\t" + main.arr.get(id1 - 1).ID + "\t\t\t " + main.arr.get(id1 - 1).Name + " \t\t "
                + main.arr.get(id1 - 1).age + " \t " + main.arr.get(id1 - 1).Address + "");
    }

    void searchbyName() {
        System.out.println("Enter Student Name: ");
        Scanner sc = new Scanner(System.in);
        String id1 = sc.nextLine();
        System.out.println("Student ID \t Student Name \t Age \t Address");
        for (int i = 0; i < main.arr.size(); i++) {
            if (main.arr.get(i).Name.equals(id1)) {
                System.out.println("\t" + main.arr.get(i).ID + "\t\t\t " + main.arr.get(i).Name + " \t\t "
                        + main.arr.get(i).age + " \t  " + main.arr.get(i).Address + "");
            }

        }
    }

    void update() {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        int id1 = Integer.parseInt(sc.nextLine());
        stu.ID = id1;
        System.out.println("Enter Student name: ");
        stu.Name = sc.nextLine();
        System.out.println("Enter Student Age: ");
        stu.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Student Address: ");
        stu.Address = sc.nextLine();
        main.arr.set(id1 - 1, stu);

    }
}
