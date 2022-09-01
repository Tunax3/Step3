public class BoundingBox {

    private float minX;
    private float minY;
    private float maxX;
    private float maxY;

    BoundingBox(float minX,float maxX,float minY,float maxY){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public boolean intersect(BoundingBox b) {
        return ( minX<= b.maxX) &&
                (maxX >= b.minX) &&
                (minY <= b.maxY) &&
                (maxY >= b.minY);
    }

    public Vec2 overlapSize(BoundingBox b) {
        Vec2 result = new Vec2(0, 0);
// X-dimension
        if (minX < b.minX)
            result.x = maxX - b.minX;
        else
            result.x = b.maxX - minX;
// Y-dimension
        if (minY < b.minY)
            result.y = maxY - b.minY;
        else
            result.y = b.maxY - minY;
        return result;
    }

    public float getMaxX() {
        return maxX;
    }

    public float getMaxY() {
        return maxY;
    }

    public float getMinX() {
        return minX;
    }

    public float getMinY() {
        return minY;
    }
}
