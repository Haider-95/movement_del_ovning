package se.trixzta.adventure;

public class DirectionHandler {
    private int x;
    private int y;

    public DirectionHandler() {
        this.x = 0;
        this.y = 0;
        //starting pos
    }

    public void moveNorth() {
        if (y <= 0 && x==0) {
            this.y++;
            System.out.println("You moved north " + getPosition() +"\n");
        }
        else if (x > 0 || x < 0){
            System.out.println("You cant move in this direction\n");
        }
        else {
            System.out.println("You can only move south from here\n ");
        }
    }

    public void moveSouth() {
        if (y >= 0 && x == 0) {
            this.y--;
            System.out.println("You moved south "+ getPosition() + "\n" );
        }
         else if (x > 0 || x < 0){
            System.out.println("You cant move in this direction\n");
        }
        else {
            System.out.println("You can only move north from here\n ");
        }
    }

    public void moveEast() {
        if (x <= 0 && y == 0) {
            this.x++;
            System.out.println("You moved east " + getPosition() + "\n");
        }
        else if (y > 0 || y <0 ) {
            System.out.println("You cant move in this direction\n");
        }
        else {
            System.out.println("You can only move west fom here\n ");
        }
    }

    public void moveWest() {
        if (x >= 0 && y == 0) {
            this.x--;
            System.out.println("You moved west " + getPosition() + "\n");
        }
        else if (y > 0 || y <0 ) {
            System.out.println("You cant move in this direction\n");
        }
        else {
            System.out.println("You can only move east from here\n ");
        }

    }
    public String getPosition(){
        return "Your current postion(" + x + "," + y + ")";
    }
}
