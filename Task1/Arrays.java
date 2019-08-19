package Task1;

// Mariia Palyga
// Lesson 1, Task 1
public class Arrays {

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.startTest1();
        arrays.startTest2();
        arrays.startTest3();
        arrays.startTest4();
        arrays.startTest5();
        arrays.startTest6();
    }

    public void startTest1 (){
        int[] array = new int[20];
        int max = array[0];
        int min = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
                indexMax = i;
            }
            if (array[i]<min){
                min = array [i];
                indexMin = i;
            }}
        System.out.println("The minimal value is "+ min);
        System.out.println("The maximum value is " + max);
        System.out.println("The index of the minimal value is "+indexMin);
        System.out.println("The index of the maximum value is "+indexMax);
        for (int i = 0; i < array.length; i++) {
            temp = array [indexMin];
            array[indexMin] = array [indexMax];
            array[indexMax] = temp;
            System.out.println(array[i]);
        }
    }

    public void startTest2 (){
        int[] array = new int[20];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                sum+=array[i];
            }}
        System.out.println("The sum of elements at even positions is " + sum);

    }
    public void startTest3 (){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                array[i]=0;
            }
            System.out.print(array[i]);
        }

    }

    public void startTest4 (){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0 && array [i+1]<0 ){
                array[i]= array[i]*3;
            }
            System.out.print(array[i]+ " ");
        }
    }
    public void startTest5 (){
        int[] array = new int[20];
        int min = array[0];
        int sum = 0;
        int average = 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum/array.length;
            if (array[i]<min){
                min = array [i];
            }
            result = average - min;
        }
        System.out.println("The average is "+ average);
        System.out.println("The min is "+ min);
        System.out.println("The result is "+ result);

    }
    public void startTest6 (){
        int[] array = new int[20];
        int newElements = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
            System.out.print(array[i]+ " ");
        }
        System.out.println("Duplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1;j<array.length;j++){
                if (i % 2 != 0 && array[i] == array[j]) {
                    System.out.println(array[j]);}
            }
        }}}

