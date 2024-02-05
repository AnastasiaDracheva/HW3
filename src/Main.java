//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {

        Car myNewCarOne = new Car();
        Car myNewCarTwo = new Car();
        Car myNewCarThree = new Car();


        myNewCarOne.brand = " Mazda";
        myNewCarOne.model = "MPV";
        myNewCarOne.year = 2020;
        myNewCarOne.seyStartStop(" The engine is running  " + myNewCarOne.brand);
        myNewCarOne.seyStartStop("        Engine Stopped  " + myNewCarOne.brand);


        myNewCarTwo.brand = " BMV";
        myNewCarTwo.model = "IX2";
        myNewCarTwo.year = 2023;
        myNewCarTwo.seyStartStop(" The engine is running  " + myNewCarTwo.brand);
        myNewCarTwo.seyStartStop("        Engine Stopped  " + myNewCarTwo.brand);


        myNewCarThree.brand = " KIA";
        myNewCarThree.model = " Ceed";
        myNewCarThree.year = 2027;
        myNewCarThree.seyStartStop(" The engine is running  " + myNewCarThree.brand);
        myNewCarThree.seyStartStop("        Engine Stopped  " + myNewCarThree.brand);


        System.out.println("first Car:  " + myNewCarOne.brand);
        System.out.println(myNewCarOne.model);
        System.out.println(myNewCarOne.year);

        System.out.println("second Car: " + myNewCarTwo.brand + "   Model   " + myNewCarTwo.model);
        System.out.println(myNewCarTwo.year);




    }

}