public interface Sensor{
    public Class getSignal();
    public int[] getX();
    public int[] getY();
    public int getRange();
    public double score(TheWorld world, int[][] visible);
}
