//Write your code here
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
    
        if(n==1)
            return 1;
        int sum = n + 1;
        for(int i = 2 ;i < n; i++){
            if ( n % i == 0 ) {
                sum = sum + i ;
            }
        }
        return sum;
    }
}
