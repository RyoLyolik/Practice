package mirea.kvbo1.bichikov.practice6;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        super(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2,y2, xSpeed, ySpeed);
    }
    @Override
    public void moveUp(){
        super.moveUp();
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }
    @Override
    public void moveDown() {
        super.moveDown();
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }
    @Override
    public void moveLeft(){
        super.moveLeft();
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }
    @Override
    public void moveRight(){
        super.moveRight();
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    @Override
    public String toString(){
        return topLeft.toString()+"\t"+bottomRight.toString();
    }
}
