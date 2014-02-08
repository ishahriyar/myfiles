import java.util.Scanner;
public class foodmanager {
       public static void main(String[] args){
        
            System.out.println("how persons you want to input:\t");
              Scanner input = new Scanner(System.in);
                   int size = input.nextInt();
                int[] numArr = new int[size]; 
                int sum=0; 
                System.out.println("input mill persons by persons:\t");
                for(int i=0;i<numArr.length;i++) 
                {
                 numArr[i]=input.nextInt();
             sum = sum + numArr[i]; 
             } 
                System.out.print("total mills:\t"+sum+"\n"); 
            
                
                  System.out.println("how persons tk you want to input ? :\t");
                
                       int sizes = input.nextInt();
                    int[] numArr1 = new int[sizes]; 
                    int sums=0; 
                    System.out.println(" persons tk input:\t");
                    for(int j=0;j<numArr1.length;j++) 
                    {
                     numArr1[j]=input.nextInt();
                 sums = sums + numArr1[j]; 
                 } 
                    System.out.print("total tk:\t"+sums+"\n"); 
                    float statement=prokria(sum,sums);
                    System.out.print("mill rate:\t");
                    System.out.println(statement);
                    
                     }
       
       
         static public float prokria(float value1,float value2){
            float ans=value2/value1;
            
              System.out.println("again.... how persons mill you want to input ? :\t");
              Scanner input = new Scanner(System.in);
                   int sizes1 = input.nextInt();
              
                for(int k=0;k<sizes1;k++) 
                    
                {
                    
                    System.out.println(" persons mill input:\t");
                float num=input.nextInt();
            
                
                
            float rr=ans*num;
            System.out.print("members eat:\t");
            System.out.println(rr);
            System.out.println("input your bazer:\t");
            int oo=input.nextInt();
            
            float khaoa=oo-rr;
            System.out.print(" persons will give or get(if sign is(-) then give or will get) :\t");
            System.out.println(khaoa);
                
                }    
        
        return ans;
                
            }
}
