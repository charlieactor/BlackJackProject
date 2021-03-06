package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	protected List<Card> deck = new ArrayList<>();
	
	public Deck() {
		this.deck = makeDeck();
	}

	public void setDeck(){
		this.deck = makeDeck();
	}

	public List<Card> makeDeck() {
		List<Card> theDeck = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				Ranks[] nums = Ranks.values();
				for (int j = 0; j < nums.length; j++) {
					Card thisCard = new Card(nums[j], Suits.HEARTS);
					theDeck.add(thisCard);
				}
			}
			else if (i == 1) {
				Ranks[] nums = Ranks.values();
				for (int j = 0; j < nums.length; j++) {
					Card thisCard = new Card(nums[j], Suits.DIAMONDS);
					theDeck.add(thisCard);
				}
			}
			else if (i == 2) {
				Ranks[] nums = Ranks.values();
				for (int j = 0; j < nums.length; j++) {
					Card thisCard = new Card(nums[j], Suits.SPADES);
					theDeck.add(thisCard);
				}
			}
			else {
				Ranks[] nums = Ranks.values();
				for (int j = 0; j < nums.length; j++) {
					Card thisCard = new Card(nums[j], Suits.CLUBS);
					theDeck.add(thisCard);
				}
			}

		}
		return theDeck;
	}
	
	public List<Card> getDeck() {
		return deck;
	}
	
}
