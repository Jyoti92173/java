import java.util.Scanner;

public class LargestElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=sc.nextInt();
        int [][] lelement=new int[rows][cols];
        int largest=lelement[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                lelement[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(largest<lelement[i][j]){
                    largest=lelement[i][j];
                }
            }
        }
        System.out.println("Largest element of an array is:"+ largest);
    }
}
