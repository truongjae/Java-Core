public class BaseStudent extends BasePeople<Student>{
    @Override
    public void execute(Student student) {
        System.out.println(student.getDiem());
    }
}
