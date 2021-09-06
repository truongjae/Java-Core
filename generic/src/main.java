public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDiem(10);
        Employee employee = new Employee();
        employee.setLuong(100000);
        BasePeople.getInstance(Constain.Student).execute(student);
        BasePeople.getInstance(Constain.Employee).execute(employee);
    }
}
