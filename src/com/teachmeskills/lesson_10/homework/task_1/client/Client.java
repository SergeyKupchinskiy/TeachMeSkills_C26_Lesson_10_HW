package com.teachmeskills.lesson_10.homework.task_1.client;

import com.teachmeskills.lesson_10.homework.task_1.card.BaseCard;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private BaseCard[] cards;

    public Client(String name, BaseCard[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
}
