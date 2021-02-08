


import java.util.Scanner;


public class S24083 {

    
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int p ;
        
        while (true) {
            System.out.println("Lütfen 2 ile 10 arasında bir  p sayısı giriniz...");
            p=oku.nextInt();
            if (p>2 & p<=10 ) {
                break;
                
            }}
            
         int x ;
            
            while (true) {
                System.out.println("Lütfen 0 dan büyük pozitif x sayısını giriniz");
                x = oku.nextInt();
                if (x>0) {
                    break;                    
                }
            }
            
            for (int i = p+1; i <= x; i++) {
                for (int j = 2; j <= p; j++) {
                    if (i%j==0) {
                        if ((i+1)%3!=0) {
                            System.out.print(i+" ");
                        break;                        
                    }}
                
                }
                    
                
                
            }
            
        
        
        
        
        
    }
    
}
