import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        Car myNewCar = new Car();
        Car myNewCarOne = new Car();
        Car myNewCarTwo = new Car();
        Car myNewCarThree = new Car();

        myNewCar.seyStart();
        myNewCar.seyStop();

        myNewCarOne.brand = " Mazda";
        myNewCarOne.model = "MPV";
        myNewCarOne.year = 2020;


        myNewCarTwo.brand = " BMV";
        myNewCarTwo.model = "IX2";
        myNewCarTwo.year = 2023;


        myNewCarThree.brand = " KIA";
        myNewCarThree.model = " Ceed";
        myNewCarThree.year = 2027;


        System.out.println("first Car:  " + myNewCarOne.brand);
        System.out.println(myNewCarOne.model);
        System.out.println(myNewCarOne.year);

        System.out.println("first Car:  " + myNewCarOne.brand);
        System.out.println(myNewCarTwo.model);
        System.out.println(myNewCarTwo.year);

        System.out.println("first Car:  " + myNewCarOne.brand);
        System.out.println(myNewCarThree.model);
        System.out.println(myNewCarThree.year);


    }

}