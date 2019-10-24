package ui;

import java.util.ArrayList;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        ArrayList<String> deck = getDeck;
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        int count = 4;
        System.out.println("HAND OF " + count + " CARDS");
        ArrayList<String> hand = dealcards<>(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King"};        

        ArrayList<String> deck = new ArrayList<>(52);
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i] = rank + " of " + suit;
                i++;
            }
        }
        return deck;
    }

    private static void displayCards(String[] cards) {
        System.out.print("|");        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(ArrayList<String>deck) {
        for (int i = 0; i < deck.length; i++) {
            String savedCard = deck[i];
            int randomIndex = (int) (Math.random() * deck.length-1);
            deck[i] = deck[randomIndex];
            deck[randomIndex] = savedCard;
        }
    }

    private static String[] dealCards(ArrayList<String> deck, int count) {
        ArrayList<String> hand = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            hand.add(deck.remove(i));
        
        return hand;
    }
}