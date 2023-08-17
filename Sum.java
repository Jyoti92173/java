import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=sc.nextInt();
        int [][] line=new int [rows][cols];
        ///input rows..........
        System.out.println("Matrix are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               line[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               sum=sum+line[i][j];
            }
        }
        System.out.println("Sum of all elements:"+ sum);


        

    }
}
