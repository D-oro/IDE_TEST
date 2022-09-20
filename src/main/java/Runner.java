public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Balu", 25, 56.76); //this is an instance of bear
//we need to add age and weight if we're testing this even though it's a different instance of bear,
//so it doesn't have to match the instances we use in the tests
        String name = bear.getName();
        System.out.println(name);
        bear.setName("Baloo");
        System.out.println(bear.getName());
    }
}
