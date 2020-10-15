
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter test = new Counter(5);
        test.increase(-1);
        System.out.println(String.valueOf(test.value()));
    }
}
