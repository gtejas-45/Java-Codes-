package JavaBasic;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter Age Between 1 to max 150 years age not be in negative so give in positive");
        System.out.println("Enter age : ");
        int age= sc.nextInt();
        if(age<3){
            System.out.println("Infancy");
            System.out.println("This stage, from birth to around 2 years old, is characterized by rapid physical growth, the development of basic motor skills, and the beginnings of social and emotional bonding. ");
        }
        else if(age>2 && age<13) {
            if (age>2 && age < 9) {
                System.out.println("Early Childhood");

            }
            else{
                System.out.println("Middle Childhood");
            }
            System.out.println("Divided into early childhood (3-8 years) and middle childhood (9-12 years), this phase focuses on further development of motor skills, cognitive abilities, and social skills through play and interaction with peers. ");
        }
        else if(age>12 && age<18){
            System.out.println("Adolescence");
            System.out.println("Spanning from puberty (around 12 years old) to late teens, this stage involves significant physical changes (puberty), emotional and social development, and the search for identity. ");

        }
        else if(age>17 && age<66){
            if(age>17 && age<36){
                System.out.println("Early Adulthood");
                System.out.println("Focus on career building, forming relationships, and potentially starting a family. ");
            }
            else if(age>35 && age<56){
                System.out.println("Middle adulthood");
            System.out.println(" Marked by career consolidation, family responsibilities, and the onset of physical changes associated with aging. ");}
            else{
                System.out.println("late Adulthood");
                System.out.println("Includes retirement, potential health challenges, and a focus on maintaining independence and social connections. ");
            }

        }
        else{
            System.out.println("Old age");
            System.out.println("This final phase is characterized by further decline in physical and cognitive abilities, and a focus on maintaining quality of life and social connections. ");
        }
    }
}
