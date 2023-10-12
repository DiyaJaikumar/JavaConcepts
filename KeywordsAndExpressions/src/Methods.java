import org.w3c.dom.css.CSSPrimitiveValue;

public class Methods {
    public static void main(String[] args) {
        int levelCompleted=5;
        calculateScore(true,800,levelCompleted,200);//levelCompleted has an identified literal being passed
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /*boolean gameOver = true;
        int score=100;
        int levelComp=5;
        int bonus=100;*/
        int finalScore = score;
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score="+finalScore);
        }
    }
}
/*methods can have return types as well,ex:
public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
{
    int finalScore = score;
    if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score="+finalScore);
            return finalScore}}*/