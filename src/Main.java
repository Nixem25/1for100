public class Main {
    public static void main(String[] args) {
        int initBalance = 100;
        int bonus;
        //     Решение через тернарный оператор
        //     int bonus = (transferedFunds > 1000) ? transferedFunds / 100 : 0;
        int transferedFunds = 1100;
        if (transferedFunds > 1000) {
        bonus = transferedFunds / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = initBalance + transferedFunds + bonus;
        System.out.println("Current Balance: "+totalBalance);
        System.out.println("Bonus: "+bonus);

    }
}
