public class Main {
    public static void main(String args[]){
// создать объект класса, вызвав конструктор с параметрами
        Vector vector1=new Vector();
// создать объект класса, вызвав конструктор без параметров
        Vector vector2=new Vector(1,1,13,5);
// вызвать каждый из методов

        System.out.println(vector2.getEndPointX());
        vector1.setStartPointX(5);
        vector1.setStartPointY(2);
        vector1.setSecondPointX(13);
        vector1.setSecondPointY(9);

        Vector sum=vector1.addVector(vector2);
        System.out.println(vector1.length());
        System.out.println(sum.getEndPointX());

        double sc=vector2.scalarProduct(vector1);
        double vp=vector2.vectorProduct(vector1);
        System.out.println(sc+" "+ vp);
    }
}