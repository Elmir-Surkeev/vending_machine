package model;

import java.util.Scanner;

public class CoinAcceptor implements PaymentAcceptor {
    private int userDeposit;
    Scanner sc = new Scanner(System.in);
    public CoinAcceptor() {
        this.userDeposit = 0;
    }

    public int getUserDeposit() {
        return userDeposit;
    }

    public void setUserDeposit(int userDeposit) {
        this.userDeposit = userDeposit;
    }

    @Override
    public void addDeposit() {
        System.out.println("Введите сумму для пополнения депозита");
        try {
            int amount = sc.nextInt();
            if (amount <= 0) {
                System.out.println("Ваш депозит должен быть больше 0");
            }
            setUserDeposit(userDeposit += amount);
            System.out.println("Вы внесли" + amount + " сомов на вашем депозите");
            System.out.println("У вас есть " + userDeposit + " сом");
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели  число");
        }
    }
    @Override
    public int getDeposit() {
        return userDeposit;
    }

    @Override
    public boolean withDraw(int amount) {
        if (userDeposit >= amount){
            userDeposit-=amount;
            return true;
        }
        else {
            return false;
        }
    }
}
