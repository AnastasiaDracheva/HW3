public class CalculatorGo {


    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        System.out.println("Sum.num. =  " + myCalculator.addition(7,14));
        System.out.println("Sum.num. =  " + myCalculator.addition(8,4));
        System.out.println("Numbers are equal - " + myCalculator.compare(12.2, 21.24));
        System.out.println("Numbers are equal - " + myCalculator.compare(12.0, 12.0));
        System.out.println("Equal or Less - " + myCalculator.equalOrLess(12, 12.0));


        NumberManipulator toChangeNum = new NumberManipulator();


        System.out.println("Increment By One -  " + toChangeNum.incrementByOne(2.3));
        System.out.println("Decrement By One -  " + toChangeNum.decrementByOne(2.3));

    }



}





