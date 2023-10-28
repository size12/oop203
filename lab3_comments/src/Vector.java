//import java.io.IOException;
import java.io.IOException;

/**
 * <b> Класс векторов </b>
 * Класс Vector реализует приложение, которое
 * позволяет работать с векторами
 * на плоскости и демонстрирует работу всех методов.
 *
 * @author Bantorin Alexey
 * @version 1.0
 * @since 2023-10-09
 * */

public class Vector {
    private double x1=0;
    private double y1=0;
    private double x2=0;
    private double y2=0;

    /** Этот конструктор без параметров создает вектор с нулевыми значениями**/
    public Vector() {}

    /** Этот конструктор с параметрами создает вектор с заданными значениями
     * @param x1 - значение абсциссы начала вектора
     * @param y1 - значение ординаты начала вектора
     * @param x2 - значение абсциссы конца вектора
     * @param y2 - значение ординаты конца вектора
     * */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /** Возвращает значение абсциссы начала
     * @return double - абсцисса начала
     * */
    public double getStartPointX() {
        return x1;
    }
    /** Возвращает значение ординаты начала
     * @return double - ордината начала
     * */
    public double getStartPointY() {
        return y1;
    }
    /** Возвращает значение абсциссы конца
     * @return double - абсцисса конца
     * */
    public double getEndPointX() {
        return x2;
    }
    /** Возвращающет значение ординаты конца
     * @return double - ордината конца
     * */
    public double getEndPointY() {
        return y2;
    }

    /** Изменяет значение абсциссы начала
     * @param value новое значение
     * */
    public void setStartPointX(double value) {
        this.x1= value;
    }
    /** Это стандартный сеттер, изменяющий значение ординаты начала
     * @param value новое значение
     * */
    public void setStartPointY(double value) {
        this.y1 = value;
    }
    /** Это стандартный сеттер, изменяющий значение абсциссы конца
     * @param value новое значение
     * */
    public void setSecondPointX(double value) {
        this.x2= value;
    }
    /** Это стандартный сеттер, изменяющий значение ординаты конца
     * @param value новое значение
     * */
    public void setSecondPointY(double value) {
        this.y2 = value;
    }


    /**
     * Метод используется для нахождения векторного произведения вектороного произведения векторов A и B.
     * @param B - вектор, на который производится умножение
     * * @return double - векторное произведение.
     * */

    public double vectorProduct(Vector B){
        double Ax=x2-x1;
        double Ay=y2-y1;

        double Bx=B.x2- B.x1;
        double By=B.y2- B.y1;

        return (Ax*By-Ay*Bx);
    }

    // метод для нахождения скалярного произведения
    /**
     * Метод используется для нахождения скалярного произведения текущего вектор на вектор B.
     * @param B - вектор, на который производится умножение
     * * @return double - скалярное произведение
     * */
    public double scalarProduct(Vector B){
        double Ax=x2-x1;
        double Ay=y2-y1;

        double Bx=B.x2- B.x1;
        double By=B.y2- B.y1;

        return (Ax*Bx+Ay*By);
    }

    // метод для нахождения длины вектора
    /** Метод используется для нахождения длины вектора.
     * * @return double - длина вектора
     * */
    public double length(){
        double Ax=x2-x1;
        double Ay=y2-y1;
        return Math.sqrt(Ax*Ax+Ay*Ay);
    }
    // метод для умножения вектора на число
    /** Метод используется для метод для умножения вектора на число.
     * @param k - число, на которое производится умножение вектора.
     * */
    public void multiply(double k){
        this.x1 *= k;
        this.y1 *= k;
        this.x2 *= k;
        this.y2 *= k;
    }

    // метод для нахождения суммы векторов
    /** Метод используется для нахождения суммы векторов, возвращающий вектор с первой точкой в начале первого вектора
     * и со второй точкой в конце второго.
     * @param A - вектор, c которым складываем текущий
     * * @return Vector - получившийся вектор.
     * */
    public Vector addVector(Vector A){
        double x = A.x2 - A.x1;
        double y = A.y2 - A.y1;
        return new Vector(x1,y1, A.x2 + x, A.y2 + y);
    }
    // метод для нахождения разности векторов
    /** Метод используется для нахождения разности векторов
     * @param A - вектор, который вычитаем
     * * @return Vector - получившийся вектор.
     * */
    public Vector subVector(Vector A){
        double x = A.x2 - A.x1;
        double y = A.y2 - A.y1;
        return new Vector(x1,y1, A.x2 - x, A.y2 - y);
    }


    /**
     * Это основной метод, использующий методы класса Vector.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */

}
