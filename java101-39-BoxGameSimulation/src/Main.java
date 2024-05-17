public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A",10,120,100,30);
        Fighter f2 = new Fighter("B",20,85,85,40);

        Match match1 = new Match(f1,f2,85,100);
        match1.run();

    }
}