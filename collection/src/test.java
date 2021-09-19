public class test {
    public static boolean checkStr(String str){
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
//        String s = "((((()))))";
//        char[] ss = s.toCharArray();
//        boolean check = true;
//        for (int i = 0; i <= s.length()/2; i++) {
//            if(ss[i] == ss[s.length()-i-1]) check = false;
//        }
//        System.out.println(check);
        System.out.println(checkStr("ABCCBA"));
    }
}
