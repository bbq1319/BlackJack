public class Card{
  
  int cardMark;
  int cardPoint;
  String cardShape="";
  
  public Card(){
    
    cardMark = (int)(Math.random()*4);
    cardPoint = (int)(Math.random()*13)+1;
    
    switch(cardMark){
      case 0:
        cardShape = "¡ß";
        break;
      case 1:
        cardShape = "¢¾";
        break;
      case 2:
        cardShape = "¢¼";
        break;
      case 3:
        cardShape = "¢À";
        break;        
    }
    
    switch(cardPoint){
      case 1:
        cardPoint = 11;
        break;
      case 2:
        cardPoint = 2;
        break;
      case 3:
        cardPoint = 3;
        break;
      case 4:
        cardPoint = 4;
        break;
      case 5:
        cardPoint = 5;
        break;
      case 6:
        cardPoint = 6;
        break;
      case 7:
        cardPoint = 7;
        break;
      case 8:
        cardPoint = 8;
        break;
      case 9:
        cardPoint = 9;
        break;
      case 10:
        cardPoint = 10;
        break;
      case 11:
        cardPoint = 10;
        break;
      case 12:
        cardPoint = 10;
        break;
      case 13:
        cardPoint = 10;
        break;
    }
  }  
}