package test01;

public class Test1 {
    public static void main(String[] args) {
        String input = "jhgihghjhgGHJGJhgJHGewioruopwkdlmIYDFTYEjdlkfesrTRTY";
        Counter counter = new Counter(input.toCharArray());
        counter.run();
    }
}
