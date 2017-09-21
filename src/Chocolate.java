// large bars are 5 kilos, small bars are 1 kilo
// goal is the total in pounds and we want the max number of large bars
// small bars make up what's leftover


public class Chocolate {
    public static int makeChocolate (int small, int large, int goal) {

        // figure out how many large bars we would like
        double numLargeBarsRequested = Math.floor(goal/5);

        // do we have that many large bars?
        if( large > numLargeBarsRequested ) {
            // we have the inventory, remainder is small bars
            return (goal % 5);
        }
        // we don't have the inventory of large bars
        else {
            // do we have enough small bars to fill the order?
            if( (goal - (large*5)) <= small ) {
                // we do
                return (goal - (large * 5));
            } else {
                // we don't have enough small bars to fill the order
                return (-1);
            }

        }
    }
}
