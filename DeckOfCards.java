package com.bridgelabz.oops;

import java.util.*;

public class DeckOfCards {
    private List<String> cards;

    public DeckOfCards() {
        cards = new ArrayList<String>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(rank + " of " + suit);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[][] dealCards() {
        String[][] players = new String[4][9];
        int index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j][i] = cards.get(index);
                index++;
            }
        }
        return players;
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        String[][] players = deck.dealCards();

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}