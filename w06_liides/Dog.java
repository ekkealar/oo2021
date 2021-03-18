public class Dog implements AnimalCodeBehaviour{

    private String name;

    public Dog(String name){
        this.name = name; 
    }

    @Override
    public String speak() {
        return "'dog noises!'";
    }

    @Override
    public String eat() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String sleep() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String beSneaky() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String lookAround() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String attack() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String defend() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
