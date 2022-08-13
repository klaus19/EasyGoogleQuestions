public class MultiplyString {

    public String multiply(String num1, String num2) {

           int st = Integer.parseInt(num1);
           int st2 = Integer.parseInt(num2);

           int result = Integer.parseInt(String.valueOf(st*st2));
           return String.valueOf(result);
    }

    public static void main(String[] args) {
        MultiplyString mt = new MultiplyString();
        String str = "2";
        String ts = "3";

        System.out.println(mt.multiply(str,ts));
    }
}
