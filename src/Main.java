public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int refill = 2345;
        int bonus = refill / 100;
        int finalBalance;
        if (refill >= 1000) {
            finalBalance = (initialBalance + refill + bonus);
            System.out.println("Ваш баланс:" + finalBalance + ". Бонусных рублей :" + bonus );
        }
        if (refill < 1000) {
            finalBalance = (initialBalance + refill);
            System.out.println("Ваш баланс:" + finalBalance + ". Бонусных рублей :0" );
        }
    }
}