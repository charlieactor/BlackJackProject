#Charlie Actor's BlackJack Project
##Making some blackjack games

This is a functioning blackjack game! The game first deals two cards to the user and the dealer, keeping one of the dealer's cards hidden. The user is then prompted whether they would like to hit or stay. The game's checkAceValue function runs every time a card is added to a player's hand to determine whether the ace should remain high or low. 

After the game the user is asked if they would like to play again. If so, play continues from the same deck of cards. A new deck is used once the current deck has less than 15 cards.

One thing I had difficulty with was getting the players' total to change if the ace needed to be worth 1 instead of 11. It turned out the reason I was having trouble with that was that my "get total" method reset the players' total to the total value of all the cards whenever it was called. I added a new method to retrieve the changed total, but a more effective strategy would've been to simply have a "calculate initial total" function, then add to it (rather than recalculate the total value every time getValue is called). Lesson learned! 

I was out of town this weekend for my mother's 60th birthday, and unfortunately did not have the time to achieve the stretch goals I wanted to. Both player's have a money variable that I would like to implement into betting. I also hoped to improve the way the players' current total was retrieved by using a hashmap - with the player's cards as the keys and that cards value as its...well, value. I also wanted to add several other players, which would be pretty easy given a bit more time - but alas, it has been a very busy weekend!