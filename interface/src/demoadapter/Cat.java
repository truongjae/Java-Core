package demoadapter;

public class Cat extends AnimalAdapter{
    @Override
    public void thucan() {
        System.out.println("thuc an cua meo");
    }

    @Override
    public void giongnoi() {
        System.out.println("day la giong noi meomeo cua con meo cu te");
    }
}
