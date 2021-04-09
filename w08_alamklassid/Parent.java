public abstract class Parent{
    public String name ="default";
    public String dream;

    public Parent(String name, String dream){
        this.name =name;
        this.dream = dream;
    }

    public void favouriteHobbyIs(String hobby){
        System.out.println(this.name + " hobby is " + hobby);
    }

    public void firstthingIDo(){
        System.out.println("midagi muud");
    }

    public abstract void howISpendMyEvening();
}