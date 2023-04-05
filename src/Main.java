public class Main {
    public static void main(String[] args) {

        int inBalance = 50; //начальная сумма на счете
        int plusAmount = 1200; //сумма пополнения
        int outBalance; //итоговая сумма на счете
        int bonus; //бонус

        if (plusAmount > 1000) {
            bonus = plusAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Сумма на Вашем счете составляет:");
        System.out.println((outBalance = inBalance + plusAmount + bonus) + " рублей");
        System.out.println("В том числе - бонусных:");
        System.out.println((bonus) + " рублей");

        
    }
}