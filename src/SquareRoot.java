public class SquareRoot {

    public int sqrtx(int n){
        long  y=0;
        while(y*y <=n) y++;
        return (int)y-1;
    }

    public static void main(String[] args) {
        SquareRoot st = new SquareRoot();
        int n = 64;
        System.out.println(st.sqrtx(n));
    }
}
