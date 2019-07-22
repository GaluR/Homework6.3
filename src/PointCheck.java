public class PointCheck {
    public String whichPart(Point point){
        if(point.coordinateX >= 0 && point.coordinateY > 0){
            return "Punkt(" + point.coordinateX + ", " + point.coordinateY + ") leży w I ćwiartce";
        }else if(point.coordinateX < 0 && point.coordinateY >= 0) {
            return "Punkt(" + point.coordinateX + ", " + point.coordinateY + ") leży w II ćwiartce";
        }else if(point.coordinateX <= 0 && point.coordinateY < 0){
            return "Punkt(" + point.coordinateX + ", " + point.coordinateY + ") leży w III ćwiartce";
        }else{
            return "Punkt(" + point.coordinateX + ", " + point.coordinateY + ") leży w IV ćwiartce";
        }
    }
}
