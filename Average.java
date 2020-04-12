import java.util.Scanner;

public class Average {

    public static double Average2(int p, int j){
        double avg = (double)(p+j)/2;
        return avg;
    }

    public static double Average2(int p, int j, int m){
        double avg = (double)(p+j+m)/3;
        return avg;
    }

    public static double Average2(int p, int j, int m, int s){
        double avg = (double)(p+j+m+s)/4;
        return avg;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p,j,m,s;

        System.out.print("Enter 1st number: ");
        p = input.nextInt();
        System.out.print("Enter 2nd number: ");
        j = input.nextInt();
        System.out.print("Enter 3rd number: ");
        m = input.nextInt();
        System.out.print("Enter 4th number: ");
        s = input.nextInt();

        System.out.println("\nAverage for 2 numbers: " + Average2(p,j));
        System.out.println("Average for 3 numbers: " + Average2(p,j,m));
        System.out.println("Average for 4 numbers: " + Average2(p,j,m,s));

    }
}
