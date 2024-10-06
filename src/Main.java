public class Main {
    public static void main(String[] args) {

        FizzyPrinter printer = new FizzyPrinter();


        System.out.println(printer.printFizzy(15, true));
        System.out.println(printer.printFizzy(7, false));
        System.out.println(printer.printFizzy(105, true));
        System.out.println(printer.printFizzy(2, false));
    }
}