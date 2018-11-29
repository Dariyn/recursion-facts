public class factorial {
    int n;
    public factorial (int user) {
       int n = user;
    }
    public int facts (int n) {
        if (n==1) 
        {
            return 1;
        }
        else 
        {
            return n*facts(n-1);
        }
    }
}