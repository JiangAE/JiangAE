import java.math.*;
public class Circular extends Graph{

    private int position_X;
    private int position_y;
    private float radius;
    private float alpha;
    public Circular(String type,String name,int position_x,int position_y,float radius,float alpha)
    {
        super(name,type);
        this.position_X=position_x;
        this.position_y=position_y;
        this.alpha=alpha;
        this.radius=radius;
    }
    @Override
    public float area() {
        float area= (float) (Math.PI*(float) Math.pow(radius,2));
        return area;
    }
}
