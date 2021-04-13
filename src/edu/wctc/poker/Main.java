package edu.wctc.poker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();

        List<Card> hand = new ArrayList<>();
        Poker poker = new Poker();

        hand.add(deck.getCard(2));
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(12));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(6));


        determineHand(hand);

    }

    public static void determineHand(List<Card> hand) {
        Poker poker = new Poker();

        if(poker.isStraightFlush(hand)) {
            System.out.println("Your have a Straight Flush");
        } else if (poker.isStraight(hand)) {
            System.out.println("Your have a Straight");
        } else if (poker.isFourOfAKind(hand)) {
            System.out.println("Your have a Four of A Kind");
        } else if (poker.isThreeOfAKind(hand)) {
            System.out.println("Your have a Three Of A Kind");
        } else if (poker.isTwoPair(hand)) {
            System.out.println("Your have Two Pairs");
        } else if (poker.isOnePair(hand)) {
            System.out.println("Your have a Pair");
        } else if (poker.isHighCard(hand)) {
            System.out.println("Your have a High Card");
        }
    }
}
