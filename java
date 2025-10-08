import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
                
            }
        }
        if(num%2!=0&&count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("no");
        }
        
    }
}
