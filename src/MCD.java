public class MCD {
    public int mcd(int a,int b){
        int mcd;
        if (b == 0){
            return a;
        }

        mcd = mcd(b, a % b);

        return mcd;
    }
}
