package demoadapter;

public class Dog extends AnimalAdapter{
    @Override
    public void thucan() {
        System.out.println("thuc an cua cho");
    }

    @Override
    public void giongnoi() {
        System.out.println("day la tieng sua gaugau");
    }
}
