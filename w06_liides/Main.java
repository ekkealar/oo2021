public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("39912214711");
        FinnishID fin = new FinnishID("230181-237J");

        Cat cat = new Cat("cat name");
        Dog dog = new Dog("dog name");

        System.out.println("Finnish ID: ");
        System.out.println("Gender: " + est.getGender());
        System.out.println("Date of birth: " + est.getDOB());
        System.out.println("Age: " + est.getAge());
        System.out.println("Day of birth: " + est.getDay());
        System.out.println("Month of birth: " + est.getMonth());
        System.out.println("Year of birth: " + est.getFullYear());

        System.out.println("Finnish ID: ");
        System.out.println("Gender: " + fin.getGender());
        System.out.println("Date of birth: " + fin.getDOB());
        System.out.println("Age: " + fin.getAge());
        System.out.println("Day of birth: " + fin.getDay());
        System.out.println("Month of birth: " + fin.getMonth());
        System.out.println("Year of birth: " + fin.getFullYear());
    }
}
