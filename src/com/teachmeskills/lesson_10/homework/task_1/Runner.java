package com.teachmeskills.lesson_10.homework.task_1;

import com.teachmeskills.lesson_10.homework.task_1.card.BaseCard;
import com.teachmeskills.lesson_10.homework.task_1.client.Client;

/**
 * Objective 1
 * There is a client.
 * The client can have any number of cards.
 * The card has three fields - cvv code, card number and amount on the card.
 * Display a message indicating how many identical cards the client has.
 * The field describing the amount on the card should not be included in the comparison.
 * Those. two multiples with the same cvv codes and numbers, but different amounts are considered the same.
 * Provide different options for the output message - for example, the client does not have any cards, the client does not have identical cards, and other possible situations.
 */

public class Runner {
    public static void main(String[] args) {
        int count = 0;

        BaseCard card1 = new BaseCard(777, "1111-2222-3333-4444", 20000);
        BaseCard card2 = new BaseCard(888, "2222-3333-4444-5555", 10000);
        BaseCard card3 = new BaseCard(666, "3333-4444-5555-6666", 15000);
        BaseCard card4 = new BaseCard(666, "4444-5555-6666-7777", 20000);
        BaseCard card5 = new BaseCard(888, "5555-6666-7777-8888", 10000);
        BaseCard card6 = new BaseCard(777, "2222-3333-4444-5555", 25000);

        BaseCard[] cards = new BaseCard[]{card1, card2, card3, card4, card5, card6};

        Client sergey = new Client("Sergey", cards);

        if (sergey.getCards().length != 0) {
            for (int i = 0; i < sergey.getCards().length - i - 1; i++) {
                if (sergey.getCards()[i].equals(sergey.getCards()[i + 1])) {
                    count++;
                    System.out.println("Number of identical cards a person has: " + count);
                }
            }
        } else {
            System.out.println("No cards found");
        }
        if (count == 0) {
            System.out.println("No identical cards found");
        }
    }
}
