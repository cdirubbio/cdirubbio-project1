public class Mouse extends Creature {
    /*
        After 20 rounds of simulation time, a mouse produces a new baby mouse at the same location
        A mouse dies after 22 rounds simulation time
        A mouse randomly changes directions 20% of the time. 
     */
    private int roundsAlive = 0;
    public Mouse(int x, int y, City city) {
        super(x, y, city);
        this.lab = LAB_BLUE;
    }
/*
 * You must use the city’s getNextRandomTurn() method to generate the next
 * random number from which to decide to turn; see how this list of numbers 
 * is generated in City (starting at line 64). Check for ‘0’ or ‘1’ to be the 
 * number returned by that method for the 20% value. If the mouse should change 
 * direction, your code must also rely on the city’s getNextDir() to get the next 
 * random direction in which to turn. Failure to use these methods correctly to implement 
 * randomness will cause you to not pass the unit tests.
 */
    public void takeAction(){
        // Change dir 20% of the time:     0 || 1 out of 0-9
        int randomNum = city.getNextRandomTurn();
        if (randomNum == 0 || randomNum == 1) {
            this.randomTurn();
        }
        if (roundsAlive == 20) {
            Mouse m = new Mouse(this.getX(), this.getY(), this.city);
            this.city.creaturesToAdd.add(m);
        }
        if (roundsAlive == 22) {
            this.dead = true;
        }

    }

    public void step() {
        super.step();
        roundsAlive++;
    }
}
