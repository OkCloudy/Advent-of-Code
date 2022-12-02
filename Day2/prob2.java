package Day2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class prob2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("prob1.txt");
            Scanner myReader = new Scanner(myObj);
            int totalScore = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                String split[] = data.split(" ", 0);
             /*   System.out.println(split[0]);
                System.out.println(split[1]);
                for (String s: split) {
                  //  System.out.println(s);
                } */
                Character enemyStrat = split[0].charAt(0);
                Character myStrat = split[1].charAt(0);
                
                
                // Rock 1 A X
                // Paper 2 B Y
                // Scissors 3 C Z
                if (enemyStrat.equals('A') && myStrat.equals('X')) {
                    totalScore += 3;
                } else if (enemyStrat.equals('A') && myStrat.equals('Y')) {
                    totalScore += 4;
                } else if (enemyStrat.equals('A') && myStrat.equals('Z')) {
                    totalScore += 8;
                } else if (enemyStrat.equals('B') && myStrat.equals('X')) {
                    totalScore += 1;
                } else if (enemyStrat.equals('B') && myStrat.equals('Y')) {
                    totalScore += 5;
                } else if (enemyStrat.equals('B') && myStrat.equals('Z')) {
                    totalScore += 9;
                } else if (enemyStrat.equals('C') && myStrat.equals('X')) {
                    totalScore += 2;
                } else if (enemyStrat.equals('C') && myStrat.equals('Y')) {
                    totalScore += 6;
                } else if (enemyStrat.equals('C') && myStrat.equals('Z')) {
                    totalScore += 7;
                }
                
            }
            System.out.println(totalScore);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
