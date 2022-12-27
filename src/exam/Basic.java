package exam;

public class Basic {
    public Basic(){

    }

    public boolean isPrime(int n){
        for (int i = 2; i<n; i++){
            if (i*i >= n){
                break;
            }
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
