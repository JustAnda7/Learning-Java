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
        Student[] studArray = new Student[size];
        System.out.println("Yeeeee!!!");
    }
}
