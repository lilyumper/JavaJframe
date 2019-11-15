package assignment.lewis;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SplatPanel extends JPanel
{
    private Circle circle1;
    public SplatPanel()
    {
        //circle1 = new Circle(30, Color.red, 70, 35);
        circle1 = new Circle(newCircleSize(),newCircleColor(),newCircleUpperX(),newCircleUpperY());
        setPreferredSize(new Dimension(newWidth(), newHeight()));
        setBackground(newBackGroundColor());
    }
    //-----------------------------------------------------------------
    //  Draws this panel by requesting that each circle draw itself.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        circle1.draw(page);
    }

    public static int newCircleSize() {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter the size of your circle");
        int size = scan.nextInt();

       return size;
    }
    public static Color newCircleColor() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your color \n" +
                "1: Red \n" + "2: Blue \n" + "3: pink \n" );

        int number = scan.nextInt();
        Color color = new Color(number);

        switch (number) {
            case 1: {
                color = Color.RED;
                break;
            }
            case 2: {
                color = Color.BLUE;
                break;
            }
            case 3: {
                color = Color.pink;
                break;
            }
        }
        return color;
    }

    public static int newCircleUpperX () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your upperx");
        int upperX = (scan.nextInt());

        return upperX;
    }

    public static int newCircleUpperY () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your upperY");
        int upperY = (scan.nextInt());

        return upperY;
    }
    public static int newWidth() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your width");
        int width = (scan.nextInt());

        return width;
    }
    public static int newHeight() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your Height");
        int height = (scan.nextInt());

        return height;
    }

    public static Color newBackGroundColor() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter your color \n" +
                "1: Black \n" + "2: Yellow \n" + "3: Orange \n" );

        int number = scan.nextInt();
        Color color = new Color(number);

        switch (number) {
            case 1: {
                color = Color.BLACK;
                break;
            }
            case 2: {
                color = Color.YELLOW;
                break;
            }
            case 3: {
                color = Color.ORANGE;
                break;
            }
        }
        return color;
    }
}
