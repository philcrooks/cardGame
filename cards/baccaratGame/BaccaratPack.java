package baccaratGame;
import cardGameTypes.*;
import cardGame.*;

public class BaccaratPack extends Pack {

  public BaccaratPack() {
    super();
  }

  protected int valueOfCard(Suit suit, Rank rank) {
    switch (rank) {
      case ACE:   return 1;
      case TWO:   return 2;
      case THREE: return 3;
      case FOUR:  return 4;
      case FIVE:  return 5;
      case SIX:   return 6;
      case SEVEN: return 7;
      case EIGHT: return 8;
      case NINE:  return 9;
      case TEN:   return 0;
      case JACK:  return 0;
      case QUEEN: return 0;
      case KING:  return 0;
    }
    // shouldn't get here
    return -1;
  }
}