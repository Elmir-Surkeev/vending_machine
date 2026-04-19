package model;

public interface PaymentAcceptor {
    void addDeposit();
    int getDeposit();
    boolean withDraw(int price);
}
