public class Vector {
    private float y;
    private float x;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String printCoordinates() {
        return("<" + x + ", " + y + ">");
    }

    public Vector add(Vector addend) {
        float newX = x + addend.getVectorCoordinates()[0];
        float newY = y + addend.getVectorCoordinates()[1];
        return(new Vector(newX, newY));
    }

    private float[] getVectorCoordinates() {
        return(new float[]{x, y});
    }

    public Vector subtract(Vector subtrahend) {
        float newX = x - subtrahend.getVectorCoordinates()[0];
        float newY = y - subtrahend.getVectorCoordinates()[1];
        return(new Vector(newX, newY));
    }

    public double Length() {
        return(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    
}
