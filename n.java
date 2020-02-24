import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class BooglesHackathon
{
    static int meatPoints = 0;
    static int veggiePoints = 0;
    static int grainPoints = 0;
    static int dairyPoints = 0;
    static int sweetPoints = 0;
    static int foodGroup = 0;
    static int permission = 0;


    public static int intro()
    {
        System.out.println("Do you want to go back and choose more food? Please respond with 100 if you want to.");
        Scanner scan = new Scanner(System.in);
        permission = scan.nextInt();
        if (permission == 100)
        {
            System.out.println("For meat, type \"1\".");
            System.out.println("For vegetables or fruits, type \"2\".");
            System.out.println("For grains, type \"3\".");
            System.out.println("For dairy, type \"4\".");
            System.out.println("For oils, fats, and sweets type \"5\".");
            foodGroup = scan.nextInt();
        }
        return foodGroup;
    }


    public static int meat(int meatPoints)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of meat did you eat?");
        System.out.println("For lamb, type \"1\".");
        System.out.println("For beef, type \"2\".");
        System.out.println("For pork, type \"3\".");
        System.out.println("For seafood, type \"4\".");
        System.out.println("For turkey or chicken, type \"5\".");
        int meatType = scan.nextInt();

        if (meatType == 1)
        {
            meatPoints++;
        }

        if (meatType == 2)
        {
            meatPoints+=2;
        }

        if (meatType == 3)
        {
            meatPoints+=3;
        }

        if (meatType == 4)
        {
            meatPoints+=4;
        }

        if (meatType == 5)
        {
            meatPoints+=5;
        }
        System.out.println("here are the total meat points: " + meatPoints);
        return meatPoints;
    }

    public static int veggies(int veggiePoints)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of vegetables or fruits did you eat?");
        String veggiesEaten = scan.nextLine();
        System.out.println("What was your serving size?");
        System.out.println("For less than 0.5 servings, type \"1\".");
        System.out.println("For 0.5 servings, type \"2\".");
        System.out.println("For 1 serving, type \"3\".");
        System.out.println("For 2 servings, type \"4\".");
        System.out.println("For 3 servings, type \"5\".");
        int servingSize = scan.nextInt();

        if (servingSize == 1)
        {
            veggiePoints++;
        }

        if (servingSize == 2)
        {
            veggiePoints+=2;
        }

        if (servingSize == 3)
        {
            veggiePoints+=3;
        }

        if (servingSize == 4)
        {
            veggiePoints+=4;
        }

        if (servingSize == 5)
        {
            veggiePoints+=5;
        }
        System.out.println("here are the total veggie points: " + veggiePoints);
        return veggiePoints;
    }

    public static int grains(int grainPoints)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of grains did you eat?");
        System.out.println("For pasta, type \"1\".");
        System.out.println("For rice, type \"2\".");
        System.out.println("For bread, type \"3\".");
        int actualGrainType = scan.nextInt();

        if (actualGrainType == 1)
        {
            System.out.println("What type of pasta did you eat?");
            System.out.println("For white pasta, type \"1\".");
            System.out.println("For whole wheat pasta, type \"2\".");
            int grainType = scan.nextInt();
            if (grainType == 1);
            {
                {
                    grainPoints += 2;
                }
            }
            if (grainType == 2) ;
            {
                {
                    grainPoints += 5;
                }
            }
            return grainPoints;
        }

        if (actualGrainType == 2)
        {
            System.out.println("What type of rice did you eat?");
            System.out.println("For white rice, type \"1\".");
            System.out.println("For brown, type \"2\".");
            int grainType = scan.nextInt();
            if (grainType == 1);
            {
                {
                    grainPoints += 2;
                }
            }

            if (grainType == 2) ;
            {
                {
                    grainPoints += 5;
                }
            }
            return grainPoints;
        }

        if (actualGrainType == 3)
        {
            System.out.println("What type of bread did you eat?");
            System.out.println("For white bread, type \"1\".");
            System.out.println("For whole wheat bread, type \"2\".");
            int grainType = scan.nextInt();
            if (grainType == 1);
            {
                {
                    grainPoints += 2;
                }
            }

            if (grainType == 2) ;
            {
                {
                    grainPoints += 5;
                }
            }
            return grainPoints;
        }

        System.out.println("here are the total grain points: " + grainPoints);
        return grainPoints;
    }

    public static int dairy(int dairyPoints)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of dairy did you eat?");
        System.out.println("For anything with animal-based milk, type \"1\".");
        System.out.println("For anything with cheese, type \"2\".");
        System.out.println("For anything with plant-based milk, type \"3\".");
        int dairyType = scan.nextInt();

        if ((dairyType == 1) || (dairyType == 2))
        {
            dairyPoints+=2;
        }

        if (dairyType == 3)
        {
            dairyPoints+=5;
        }
        System.out.println("here are the total dairy points: " + dairyPoints);
        return dairyPoints;
    }

    public static int sweet(int sweetPoints)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of oils, fats, or sweets did you eat?");
        System.out.println("For ice cream, type \"1\".");
        System.out.println("For butter, type \"2\".");
        System.out.println("For cake, type \"3\".");
        int sweetType = scan.nextInt();

        if ((sweetType == 1) || (sweetType == 2) || (sweetType == 3))
        {
            sweetPoints++;
        }

        System.out.println("here are the total sweet points: " + sweetPoints);
        return sweetPoints;
    }


    public static void main (String str[]) throws IOException {
        int totalMeatPoints = 0;
        int totalVeggiePoints = 0;
        int totalGrainPoints = 0;
        int totalDairyPoints = 0;
        int totalSweetPoints = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("What did you eat today?");
        System.out.println("For meat, type \"1\".");
        System.out.println("For vegetables or fruits, type \"2\".");
        System.out.println("For grains, type \"3\".");
        System.out.println("For dairy, type \"4\".");
        System.out.println("For oils, fats, and sweets type \"5\".");
        foodGroup = scan.nextInt();


        if (foodGroup == 1)
        {
            totalMeatPoints = meat(meatPoints);
            intro();
        }
        else if (foodGroup == 2)
        {
            totalVeggiePoints = veggies(veggiePoints);
            intro();
        }
        else if (foodGroup == 3)
        {
            totalGrainPoints = grains(grainPoints);
            intro();

        }
        else if (foodGroup == 4)
        {
            totalDairyPoints = dairy(dairyPoints);
            intro();
        }
        else if (foodGroup == 5)
        {
            totalSweetPoints = sweet(sweetPoints);
            intro();
        }

        while (permission == 5)
        {
            if (foodGroup == 1)
            {
                totalMeatPoints = meat(meatPoints);
            }
            else if (foodGroup == 2)
            {
                totalVeggiePoints = veggies(veggiePoints);
            }
            else if (foodGroup == 3)
            {
                totalGrainPoints = grains(grainPoints);

            }
            else if (foodGroup == 4)
            {
                totalDairyPoints = dairy(dairyPoints);
            }
            else if (foodGroup == 5)
            {
                totalSweetPoints = sweet(sweetPoints);
            }
            intro();
        }

        System.out.println("Here is a summary of your sustainability progress!");
        int totalPoints = (totalMeatPoints + totalVeggiePoints + totalGrainPoints + totalDairyPoints + totalSweetPoints);
        if (totalPoints >= 25)
        {
            System.out.println("Congrats! You get a gold medal!!");
        }
        else if (totalPoints >= 20)
        {
            System.out.println("Congrats! You get a silver medal!!");
        }
        else
        {
            System.out.println("Good job! You get a bronze medal!!");
        }

    }
}