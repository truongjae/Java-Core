public class test {
    public static void main(String[] args) {
        String s = "";
        int a = 1000,b=100;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s+="else if(a==" + i + " && "+ "b=="+j+"){\n\t"+ "System.out.println("+i+" + "+j+" = "+(i+j)+");\n}";
            }
        }

        System.out.println(s);
    }
}
