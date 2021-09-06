public class main {
    public static void main(String[] args) {
        /*demoInnerClass.InnerClass innerClass = new demoInnerClass.InnerClass();
        innerClass.setAge(16);
        System.out.println(innerClass.getAge());
        demoInnerClass demoInnerClass = new demoInnerClass();*/

        // demo studentbuilder

        student student = new student.StudentBuilder().address("bac ninh")
                .age(16)
                .email("truongjae@gmail.com")
                .name("nguyen gia truong")
                .build();
        student student2 = new student.StudentBuilder().id("2")
                .age(15)
                .address("ha noi")
                .build();
        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}
