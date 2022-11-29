public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; /* количество денег на счету до пополнения */
        int refill = 877; /* сумма пополнения */

        int bonus = 100; /* количество рублей к одному бонусному рублю по условиям акции */
        int totalBonus; /* количество бонусных рублей */

        if (refill > 1_000) {
            totalBonus = refill / bonus;
        } else {
            totalBonus = 0;
        }

        int totalBalance = initialBalance + refill + totalBonus; /* сумма на счету после пополнения с учетом бонусов */
        System.out.println("Количество бонусных рублей: " + totalBonus);
        System.out.println("Итоговый счёт: " + totalBalance);
    }
}
