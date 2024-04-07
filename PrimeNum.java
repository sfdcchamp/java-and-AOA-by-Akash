class PrimeNum{
    public static void main(String[] args){
        
        
        int n = 31;
        int flag = 0 ;
        int m =0;
        m = n/2;
        for(int i =2;i<m;i++){
            if(n%i==0){
                System.out.println("not a prime number");
                flag = 1; 
                break;
            }
            
        }
        if(flag ==0){
            System.out.println("prime number ");
        }
    }
}
