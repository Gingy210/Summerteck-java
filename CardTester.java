public class CardTester {
    public static void main(String[]arrgs){
        CardDeck DeckCard=new CardDeck();
Card card=new Card(5, "Spades");
System.out.println(card.valueGet());
System.out.println(card.suitGet());
System.out.println(card);
card.setValue(4);
card.setSuit("Politoeds");
System.out.println(card);
DeckCard.shuffle();
DeckCard.print();
for(int draw=0;DeckCard.isEmpty()==false;draw++){
    Card d= DeckCard.drawing();
System.out.println(d);

}

}
    
}
