public class BaseEmloyee extends BasePeople<Employee>{
    @Override
    public void execute(Employee employee) {
        System.out.println(employee.getLuong());
    }
}
