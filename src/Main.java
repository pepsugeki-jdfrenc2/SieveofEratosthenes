public class Main {
    public static void main(String[] args) {
        System.out.println("John French: SER450 - Project 1\n\n");
        boolean verbose = false;
        PrimeNumberFinder prime = new PrimeNumberFinder();
        System.out.println("Testing runtime with 100,000 limit");
        prime.finder(100000, verbose);
        System.out.println("Testing runtime with 1,000,000 limit");
        prime.finder(1000000, verbose);
        System.out.println("Testing runtime with 10,000,000 limit");
        prime.finder(10000000, verbose);
    }
}