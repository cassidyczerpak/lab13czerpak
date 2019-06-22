/*
Project: Lab 13
Feature: Exceptions
Course: IST 242
Author: Cassidy Czerpak
Date Developed: 6/19/19
Last Date Changed: 6/19/19
Rev: development build 1
*/


import java.util.InputMismatchException;

public class Main

{

    public static void main(String args[])

    {


        int num;


        try

        {



            num = Integer.parseInt(args[0]);





            System.out.println("You've entered: " + num + " This is a valid integer.");

        }



        catch(Exception exe)

        {




            System.out.println("You've entered: " + args[0] + " Please only enter an integer.");

        }



        float numFloat;


        try

        {


            numFloat = Float.parseFloat(args[1]);



            if(numFloat%1 == 0)

            {

                throw new Exception();

            }



            System.out.println("You've entered: " + numFloat + " This is a valid float.");

        }


        catch(Exception exe)

        {


            System.out.println("You've entered: " + args[1] + " Please only enter a float.");

        }

        String input;


        try

        {


            input = args[2];


            String replacedString = input.replaceAll

                    ("[^A-Za-z]+", "");



            if(replacedString!=input)

            {

                throw new InputMismatchException();

            }



            System.out.println("You've entered: " + input + " This is a valid string.");

        }



        catch(InputMismatchException exe)

        {


            System.out.println("You've entered: " + args[2] + " Please only enter a string.");

        }




        int i, index, value, countOfInt;

        i = 0;

        index = 0;

        countOfInt = 0;


        int inputArray[] = new int[args.length];


        try

        {

            for(i = 0; i < args.length; i++)

            {


                value = Integer.parseInt(args[i]);

                inputArray[index] = value;



                index++;

                countOfInt++;

            }


            if(countOfInt != 3)

            {

                throw new Exception();

            }



            System.out.print("You've entered: ");
            for(int j = 0; j < index; j++)

            {

                System.out.print (inputArray[j]);


            }

            System.out.println(" This is a valid integer");

        }


        catch(Exception exe)

        {


            System.out.println("Please only enter a valid integer of 3");
            }



        String inputFilename;



        try

        {


            inputFilename = args[3];


            char restricted[] = new char[]{'\\', '/',

                    ':', '*', '?', '"', '<', '>', '|'};



            for(int index2 = 0; index <

                    inputFilename.length(); index++)

            {

                for(int index1 = 0; index1 <

                        restricted.length; index1++)

                {


                    if(inputFilename.charAt(index) ==

                            restricted[index1])

                    {

                        throw new Exception();

                    }

                }

            }



            System.out.print("You've entered: " + inputFilename + " This is a valid filename.");

        }


        catch(Exception exe)

        {

            System.out.print("Please enter a valid filename.");
        }

    }

}






