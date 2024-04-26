public class Challenge {
  public static int findperimeters(int length, int width)
  {

    int longueur = length * 2;
    int largeur = width * 2;
    return longueur + largeur;
  }   
  
  public static void main(String[] args) {
    System.out.println(findperimeters(2,3));
  }
 
}