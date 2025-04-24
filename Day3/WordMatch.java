package Day3;

public class WordMatch {
    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= secret.length(); i++){
            if (i + guess.length() <= secret.length() && secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }
        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        if(scoreGuess(guess1)>scoreGuess(guess2)){
            return guess1;
        }else if (scoreGuess(guess1)<scoreGuess(guess2)) {
            return guess2;
        }else{
            if (guess1.compareTo(guess2)<0) {
                return guess2;
            }
        }
        return guess1;
    }

}
