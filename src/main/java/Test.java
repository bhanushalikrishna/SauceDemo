public class Test {
    public static void main(String[] args) {
         String person= "Human";
         Test test = new Test();
         test.greet(person);
    }

    public  void greet(String person){
        System.out.println("Hello "+ person);
    }
}
