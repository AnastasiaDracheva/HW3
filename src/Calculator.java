import java.io.PrintStream;

public class Calculator {

    public int addition (int num1, int num2) {

        return num1 + num2;

    }
    public boolean compare(double num3, double num4) {

      boolean theyAreEqual;
      if (num3 == num4) theyAreEqual = true;
      else theyAreEqual = false;
      return theyAreEqual;


    }

    public boolean equalOrLess(int num3, double num4) {

        boolean theyAreEqual;
        if (num3 >= num4) theyAreEqual = true;
        else theyAreEqual = false;
        return theyAreEqual;


    }
}





