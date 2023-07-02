import java.util.*;

public class StudentSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Student list");
        int size = sc.nextInt();
        if (size < 10){
            System.out.println("Error - Size of the List is less than 10!!");
            return;
        }
        System.out.println("Enter 1 for UGStudent List, 2 for PGStudent List and 3 for a Student List");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                UGStudent[] studList1 = new UGStudent[size];
                break;
            case 2:
                PGStudent[] studList2 = new PGStudent[size];
                break;
            case 3:
                Student[] studList = new Student[size];
            default:
                System.out.println("Only 3 choice available to select from!!!");
        }

//        PGStudent stud = new PGStudent("1", "abc", "Nanotech", "MCA");
//        stud.setugDegree("M.Tech");
    }
}
