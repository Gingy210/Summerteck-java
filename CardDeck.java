public class CardDeck {
   private Card[]Deck;
public CardDeck(){
    for(int index=0;index<13;index++){
        for(int x=1;x<=13;x++){
        Deck[index]=new Card(x, "Spades");
    }
    }
    
     for(int index=0;index<13;index++){
        for(int x=1;x<=13;x++){
        Deck[index]=new Card(x, "Hearts");
     }
    }
 for(int index=0;index<13;index++){
    for(int x=1;x<=13;x++){
        Deck[index]=new Card(x, "Diamonds");
    }
 }
    for(int index=0;index<13;index++){
    for(int x=1;x<=13;x++){
        Deck[index]=new Card(x, "Clubs");
    }
 }
 
}
public void print(){
for(int x=0;x<13;x++){
    System.out.println(Deck);
}
 }
}


