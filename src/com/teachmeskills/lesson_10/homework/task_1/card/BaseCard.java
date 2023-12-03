package com.teachmeskills.lesson_10.homework.task_1.card;

import java.util.Objects;

public class BaseCard {
    private int CVV;
    private String numberCard;
    private int amount;

    public BaseCard(int CVV, String numberCard, int amount) {
        this.CVV = CVV;
        this.numberCard = numberCard;
        this.amount = amount;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return CVV == baseCard.CVV && Objects.equals(numberCard, baseCard.numberCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CVV, numberCard);
    }
}
