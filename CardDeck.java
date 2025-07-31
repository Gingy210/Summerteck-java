import java.util.Random;

public class CardDeck {
    private Random r;
   private Card[]Deck;
   private int draw;
public CardDeck(){
    Deck=new Card[52];
   r=new Random();
   draw=51;
        for(int x=1;x<=13;x++){
        Deck[x-1]=new Card(x, "Spades");
    }
    
    
 
        for(int x=1;x<=13;x++){
        Deck[x+12]=new Card(x, "Hearts");
     }
    

    for(int x=1;x<=13;x++){
        Deck[x+25]=new Card(x, "Diamonds");
    }
 
  
    for(int x=1;x<=13;x++){
        Deck[x+38]=new Card(x, "Clubs");
    }
 
 
}
public void print(){
for(int x=0;x<52;x++){
    System.out.println(Deck[x]);
}
 }

 public int random(int min, int max) {
      int s = r.nextInt(max - min + 1);
      return s + min;
   }
 public void shuffle() {

      for (int o = 0; o < 52; o++) {
         int u = random(o, 51);
         swap(u, o);

      }

   }
   private void swap(int x1, int x2) {

      Card q = Deck[x1];
      Deck[x1] = Deck[x2];
      Deck[x2] = q;

   }
   public Card drawing(){
    int d=draw;
    draw--;
return Deck[d];

   }
   public boolean isEmpty(){
if (draw<=-1){
    return true;
}
else{
    return false;
}
   }

}


