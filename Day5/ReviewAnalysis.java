package Day5;

import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        int res=0;
        for(int i=0; i<allReviews.length;i++){
            res+= allReviews[i].getRating();
        }
        return (double) res/allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> newList = new ArrayList<String>();
        for(int i=0; i<allReviews.length;i++){
            if (allReviews[i].getComment().contains("!")) {
                newList.add(i + "-" + allReviews[i].getComment());
            }
        }
        return newList;
    }
}

