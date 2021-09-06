public class main {
    public static void main(String[] args) throws NoSuchFieldException {
        String name = Student.class.getDeclaredField("ID").getDeclaredAnnotation(MyAnnotation.class).value();
        System.out.println(name);
    }
}
