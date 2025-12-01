public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public String getColor() {
        return color;
    }
    
    public Cube2(String color) {
        this.color = color;
    }
    
    public Cube2(int side, String color){
        basicCube = new Cube(side);
        this.color = color;
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { 
        return basicCube.calculateVolume();
    }
    
    public int calculateSurfaceArea() { 
        return basicCube.calculateSurfaceArea();
    }
    
    public Cube2 add(Cube2 otherCube) { 
        int x = this.getSide();
        int y = otherCube.getSide();
        int z = (int) Math.sqrt(x*x + y*y);

        if (z*z != x*x + y*y){
            throw new IllegalArgumentException();
        }

        return new Cube2(z, this.color); 
    }

    public Cube2 minus(Cube2 otherCube) { 
        int x = this.getSide();
        int y = otherCube.getSide();
        int z = (int) Math.sqrt(x*x - y*y);

         if (z*z != x*x - y*y){
            throw new IllegalArgumentException();
        }

        return new Cube2(z, this.color); 
    }
    
    public boolean equals(Cube2 otherCube) { 
        if (this.getSide() != otherCube.getSide()){
            return false;
        }
        if (!this.color.equals(otherCube.color)){
            return false;
        }
        return true;
     }

    public String toString() {
        return "Cube{side=" + getSide() + ", color=" + '"' + color + '"' + "}";
    }
}
