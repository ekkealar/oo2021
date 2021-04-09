public class Child extends Parent {
    
    public Child(String name, String dream){
        super(name, dream);
    }

    @Override
    public void firstthingIDo() {
        super.firstthingIDo();
        System.out.println("midagi veel teen");
    }

    @Override
    public void howISpendMyEvening() {
        System.out.println("i run vms");
    }
}
