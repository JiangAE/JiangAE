public class Triangle extends Graph{

    private int vertex1_x;
    private int vertex1_y;
    private int vertex2_x;
    private int vertex2_y;
    private int vertex3_y;
    private int vertex3_x;
    private float alpha;
    public Triangle(String type,String name,int vertex1_x,int vertex1_y,int vertex2_x,int vertex2_y,int vertex3_x,int vertex3_y,float alpha)
    {
        super(name,type);
        this.vertex1_x=vertex1_x;
        this.vertex2_x=vertex2_x;
        this.vertex3_x=vertex3_x;
        this.vertex1_y=vertex1_y;
        this.vertex2_y=vertex2_y;
        this.vertex3_y=vertex3_y;
        this.alpha=alpha;
    }

    @Override
    public float area() {
        float area= (float) (0.5*Math.abs(vertex1_x*(vertex2_y-vertex3_y)+vertex2_x*(vertex3_y-vertex1_y)+vertex3_x*(vertex1_y-vertex2_y)));

        return area;
    }
}
