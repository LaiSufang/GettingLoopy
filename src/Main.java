public class Main {
    public static void main(String[] args) {

        //A nested loop that creates this figure (there are no blank lines)
        //
        //*****
        //*****
        //*****
        //*****
        //*****
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        //A nested loop that creates this figure (there are no blank lines)
        //
        //*****
        //****
        //***
        //**
        //*
        for (int r = 0; r < 5; r++) {
            for (int c = 5; c > r; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();




        //A nested loop that creates this figure (there are no blank lines)
        //
        //*
        //**
        //***
        //****
        //*****
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }




        //A loop that counts down by 2 from 10 to 0
        for (int count3 = 10; count3 >= 0; count3 -=2) {
            System.out.print(count3 + " ");
        }
        System.out.println();

        //A loop that counts up by 3 from 0 to 18
        for(int count2=0; count2 <= 18; count2+=3) {
            System.out.print(count2 + " ");
        }
        System.out.println();

        //A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        for (int count = 0; count <= 30; count++) {
            System.out.print(count + " ");
        }
        System.out.println();


        // A loop that counts down by 1 from 30 to 0
        for (int count1 = 30; count1 >= 0; count1--) {
            System.out.print(count1 + " ");
        }
        System.out.println();
    }
}