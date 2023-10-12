public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePos= calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePos);

    }
    public static void displayHighScorePosition(String Pname, int pos){
        System.out.println(Pname+" managed to get into position "+ pos+" on the high score list");

    }
    public static int calculateHighScorePosition(int Pscore){
        if(Pscore>= 1000) {
            return 1;
        }
        else if(Pscore>= 500 && Pscore< 1000) {
            return 2;
        }
        else if(Pscore>= 100 && Pscore< 500) {
            return 3;
        }else{ return 4;}
    }
}
