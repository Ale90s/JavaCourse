package javacourse.Section04_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex11_PlayingCat;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;
    }
}
