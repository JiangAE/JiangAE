 public class Rectangle extends Graph{

     private int position_x;
     private int position_y;
     private int width;
     private int height;
     private  float alpha;
    public Rectangle(String type,String name,int position_x,int position_y,int width,int height,float alpha)
    {
        super(name,type);
        this.position_x=position_x;
        this.position_y=position_y;
        this.width=width;
        this.height=height;
        this.alpha=alpha;
    }
     @Override
     public float area() {

         float  area=width*height;
         return area;
     }
}
