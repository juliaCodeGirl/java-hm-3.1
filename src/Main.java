public class Main {
    public static void main(String[] args) {
        long ticketPrice = 5800;
        int amountAccrual = 20;
        int bonusMiles = 1;

        long totalBonusMiles =  ticketPrice / amountAccrual * bonusMiles;

        System.out.println("Всего начислено бонусных миль: " + totalBonusMiles);
    }
}