public class tinhtoan {
    private int index;
    public String check(String str){
        for (int i = 0; i < str.length(); i++) {
            this.index =i;
            if(str.charAt(i) == '+') return "+";
            else if(str.charAt(i) == '-') return "-";
            else if(str.charAt(i) == '*') return "*";
            else if(str.charAt(i) == '/') return "/";
        }
        return null;
    }
    public float tinh(String str){
        String x = check(str);
        if(x!=null){
            float a= 0;
            float b = 0;
            try {
                 a = Integer.parseInt(str.substring(0,index));
                 b = Integer.parseInt(str.substring(index+1,str.length()));
            }
            catch (Exception e){
                return 0;
            }
            switch (x){
                case "+":
                    return a+b;
                case "-":
                    return a-b;
                case "*":
                    return a*b;
                case "/":
                    return a/b;
            }
        }
        return 0;
    }
}
