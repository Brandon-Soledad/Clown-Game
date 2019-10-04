package mypackage;
import java.awt.*;

/**
 * Created by Brandizzy on 5/18/2017.
 */
public abstract class GameObject {

    protected int x, y;
    protected ID id;
    protected float velX;
	protected float velY;

    public GameObject(int x, int y , ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public ID getId(){
        return id;
    }


}
