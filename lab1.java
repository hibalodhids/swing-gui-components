//A program that uses the Box class .To run the prigram save this file "BoxDemo.java"

class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Assign values to mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Assign values to mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Compute volumes
        double vol1 = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is: " + vol1);   // MUST end with ;

        double vol2 = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is: " + vol2);   // MUST run
    }
}



