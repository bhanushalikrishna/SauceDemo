public class Test {

    public static void main(String[] args) {
         greet("Krishna");
         abuse("Abhishek");
         call("Nishant" );
    }

    public static void greet(String person){
        System.out.println("Hello "+ person);
    }

    public static void abuse(String person){
        System.out.println("Gu Kha Le " + person);


    }
    public static void call(String person){
        System.out.println("Calling...."+person);
    }
}
