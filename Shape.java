package shape;

public class Shape {
private String description;
public Shape(){
    this.description="no shape";
}
public Shape(String s){
    this.description=s;
}


public String getDescription(){
    return this.description;
}

}
