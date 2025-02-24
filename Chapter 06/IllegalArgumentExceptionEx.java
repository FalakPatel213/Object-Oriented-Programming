class IllegalArgumentExceptionEx {
    public static void main(String[] args) {
        try{
            ExCircle c1 = new ExCircle(5);
            ExCircle c2 = new ExCircle(-5);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}

class ExCircle{
    double radius;
    ExCircle(double newRadius){
        setRadius(newRadius);
    }
    void setRadius(double newRadius) throws IllegalArgumentException{
        if(newRadius >= 0){
            radius = newRadius;
        }
        else{
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
    }
}
