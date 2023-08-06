
package ex21;

import java.util.Scanner;


public class Ex21 {
public void SearchPalindom(int a,int b){
    int temp1=0,res=0;
    for(int i=a;i<=b;i++){
        int temp=i;
        while(temp!= 0){
            temp1=temp%10;
            res=(res*10)+temp1;
            temp=temp/10;
        }
        if(i==res){
            System.out.println(res+" ");
        }
    }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex21 e=new Ex21();
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        e.SearchPalindom(a,b);
    }
    
}
