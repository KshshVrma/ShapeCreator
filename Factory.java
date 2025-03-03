package shape;

public class Factory {
    
    public Shape getShape(String S){
        if(S.equals("Circle")){
            return new Circle();
        }else if(S.equals("Rectangle")){
            return new Rectangle();
        }
        return new Shape();
    }
}
