package Day5;

public class Game{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    private boolean isBonus;
    private int playCounter;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Game(Level level1, Level level2, Level level3, boolean isBonus) {
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
        this.isBonus = isBonus;
        playCounter = 0;
    }

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public boolean isBonus() {
        return isBonus;
    }
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore(){
        int score = 0;
        if (levelOne.goalReached()){
            score = levelOne.getPoints();
            if (levelTwo.goalReached()){
                score+=levelTwo.getPoints();
                if (levelThree.goalReached()){
                    score+=levelThree.getPoints();
                }
            }
        }
        if (isBonus()){
            score *= 3;
        }
        return score;
    }
    public void play() {
        if (playCounter == 0) {
            levelOne = new Level(true, 10);
            levelTwo = new Level(true, 20);
            levelThree = new Level(true, 45);
        } else if (playCounter == 1) {
            levelOne = new Level(true, 15);
            levelTwo = new Level(true, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 2) {
            levelOne = new Level(true, 90);
            levelTwo = new Level(false, 35);
            levelThree = new Level(false, 25);
        } else if (playCounter == 3) {
            levelOne = new Level(true, 5);
            levelTwo = new Level(true, 5);
            levelThree = new Level(true, 10);
        } else if (playCounter == 4) {
            levelOne = new Level(true, 50);
            levelTwo = new Level(true, 15);
            levelThree = new Level(true, 35);
        } else if (playCounter == 5) {
            levelOne = new Level(true, 110);
            levelTwo = new Level(false, 50);
            levelThree = new Level(true, 10);
        }
        playCounter++;
    }

    /** Simulates the play of num games and returns the highest score earned, as
    * described in part (b)
    * Precondition: num > 0
    */
    public int playManyTimes(int num){
        int max = 0;
        for (int i = 0; i < num; i++){
            play();
            int score = getScore();
            if (score > max){
                max = score;
            }
        }
        return max;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    }

    
