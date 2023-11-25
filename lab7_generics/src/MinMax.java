public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MinMax<Integer> intMinMax = new MinMax<>(array);
        Integer min = intMinMax.findMin();
        Integer max = intMinMax.findMax();
        System.out.println("Min: " + min + ", Max: " + max);

        Double[] array2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        MinMax<Double> doubleMinMax = new MinMax<>(array2);
        Double min2 = doubleMinMax.findMin();
        Double max2 = doubleMinMax.findMax();
        System.out.println("Min: " + min2 + ", Max: " + max2);
    }
}