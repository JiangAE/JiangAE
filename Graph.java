public abstract class Graph {
    private String name;
    private String type;
    public  Graph(String type,String name)
    {
        this.name=name;
        this.type=type;
    }
    public abstract float area();
}
