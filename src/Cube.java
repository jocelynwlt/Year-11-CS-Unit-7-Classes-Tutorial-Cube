public class Cube {
    private int side;



    public Cube(int side){
        if(side<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side=side;
    }

    public Cube(){
        this(1);

    }
    public int getSide(){
        return side;
    }

    public void setSide(int side){
        if(side<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side=side;
    }

    public int getSurfaceArea(){
        return side*side*6;
    }

    public String toString(){
        return "side= "+ side;
    }

    public int getVolume(){
        return side*side*side;
    }




}
