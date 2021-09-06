public class test {
    public static void main(String[] args) {
        String s = "((((()))))";
        char[] ss = s.toCharArray();
        boolean check = true;
        for (int i = 0; i <= s.length()/2; i++) {
            if(ss[i] == ss[s.length()-i-1]) check = false;
        }
        System.out.println(check);
    }
}
