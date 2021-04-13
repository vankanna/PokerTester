//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.wctc.poker.test;

import edu.wctc.poker.Card;
import edu.wctc.poker.Deck;
import edu.wctc.poker.Poker;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*import static org.junit.jupiter.api.Assertions.*; */


class PokerTest {
    Deck deck = new Deck();
    List<Card> straightFlushHand = new ArrayList();
    List<Card> threeOfAKindHand = new ArrayList();
    List<Card> fourOfAKindHand = new ArrayList();
    List<Card> onePairHand = new ArrayList();
    List<Card> twoPairHand = new ArrayList();
    List<Card> highCardHand = new ArrayList();

    Poker poker = new Poker();


    @BeforeEach
    void runIt() {
        this.straightFlushHand.add(this.deck.getCard(2));
        this.straightFlushHand.add(this.deck.getCard(3));
        this.straightFlushHand.add(this.deck.getCard(4));
        this.straightFlushHand.add(this.deck.getCard(5));
        this.straightFlushHand.add(this.deck.getCard(6));

        this.onePairHand.add(this.deck.getCard(2));
        this.onePairHand.add(this.deck.getCard(2));
        this.onePairHand.add(this.deck.getCard(3));
        this.onePairHand.add(this.deck.getCard(4));
        this.onePairHand.add(this.deck.getCard(5));

        this.twoPairHand.add(this.deck.getCard(2));
        this.twoPairHand.add(this.deck.getCard(2));
        this.twoPairHand.add(this.deck.getCard(3));
        this.twoPairHand.add(this.deck.getCard(3));
        this.twoPairHand.add(this.deck.getCard(5));

        // threeOfAKindHand
        this.threeOfAKindHand.add(this.deck.getCard(2));
        this.threeOfAKindHand.add(this.deck.getCard(2));
        this.threeOfAKindHand.add(this.deck.getCard(2));
        this.threeOfAKindHand.add(this.deck.getCard(3));
        this.threeOfAKindHand.add(this.deck.getCard(4));

        // fourOfAKindHand
        this.fourOfAKindHand.add(this.deck.getCard(2));
        this.fourOfAKindHand.add(this.deck.getCard(2));
        this.fourOfAKindHand.add(this.deck.getCard(2));
        this.fourOfAKindHand.add(this.deck.getCard(2));
        this.fourOfAKindHand.add(this.deck.getCard(4));

        //highCardHand
        this.highCardHand.add(this.deck.getCard(2));
        this.highCardHand.add(this.deck.getCard(2));
        this.highCardHand.add(this.deck.getCard(2));
        this.highCardHand.add(this.deck.getCard(3));
        this.highCardHand.add(this.deck.getCard(12));
    }

    @Test
    void isStraight() {
        Assertions.assertTrue(this.poker.isStraight(this.straightFlushHand));
    }

    @Test
    void isStraightFlush() {
        Assertions.assertTrue(this.poker.isStraightFlush(this.straightFlushHand));
    }

    @Test
    void isThreeOfAKind() {
        Assertions.assertTrue(this.poker.isThreeOfAKind(this.threeOfAKindHand));
    }

    @Test
    void isFourOfAKind() {
        Assertions.assertTrue(this.poker.isFourOfAKind(this.fourOfAKindHand));
    }

    @Test
    void isOnePair() {
        Assertions.assertTrue(this.poker.isOnePair(this.onePairHand));
    }

    @Test
    void isTwoPair() {
        Assertions.assertTrue(this.poker.isTwoPair(this.twoPairHand));
    }

    @Test
    void isHighCard() {
        Assertions.assertTrue(this.poker.isHighCard(this.highCardHand));
    }


}
