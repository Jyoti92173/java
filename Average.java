public class Average {
        public static void main(String [] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the size of row:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int Avg=0;
        int Sum=0;
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        Sum=Sum+arr[i];
        Avg=Sum/size;
        }
        System.out.println("Average of array:"+Avg);
        }
        
        }
