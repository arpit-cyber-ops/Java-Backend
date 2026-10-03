import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char star = '*';
        System.out.print("Enter the number of levels: ");
        int lvl = sc.nextInt();
        int star_at_lvl = (lvl * 2 ) - 1;
        int start = lvl;
        int end = lvl;
        for (int i = 0; i < lvl; i++) {
            for (int j = 1; j <= star_at_lvl; j++) {
                if (j < start) {
                    System.out.print(" ");
                }
                else if (j <= end) {
                    System.out.print(star);
                }
                else {
                    break;
                }
            }
            System.out.println();
            start--;
            end++;
        }
        sc.close(); 
    }
}