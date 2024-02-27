public class Cat extends Creature {

    private int movesSinceMouseEaten = 0;

    public Cat(int x, int y, City city) {
        super(x, y, city);
        this.lab = LAB_YELLOW;
    }
    // Cats jump two spaces at a time. They
    // do not traverse the grid point they jump over. 
    // That is, if they are on space (1,2) they would move to (1,4).
    public void step() {
        super.step();
        super.step();
        movesSinceMouseEaten++;
    }

    public void takeAction(){
        killCatMaybe();
        checkToEat();
        // HUNT time
        // Change dir 10% of the time.>/?
        int randomNum = city.getNextRandomTurn();
        if (randomNum == 0) {
            this.randomTurn();
        }
        // for (Creature c: city.creatures) {
        //     if (this.getGridPoint().dist(c.getGridPoint()) <= 20 && c.lab == LAB_BLUE) {
        //         this.lab == 
        //     }
        // }
    }

    private void killCatMaybe() {
        // cat hasnt eaten mouse in 50 moves
        if (movesSinceMouseEaten >= 50) {
            this.dead = true;
        }
    }

    private void checkToEat() {
        // Check if any mouse is at current x and y, to EAT
        for (Creature c : city.creatures) {
            if (this.getX() == c.getX() && this.getY() == c.getY() && c.lab == LAB_BLUE) {
                c.dead = true;
                movesSinceMouseEaten = 0;
            }
        }
    }
}