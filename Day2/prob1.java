package Day2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class prob1 { 
    public static void main(String[] args) {
        try {
            File myObj = new File("prob1.txt");
            Scanner myReader = new Scanner(myObj);
            int totalScore = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String split[] = data.split(" ", 0);
                Character enemyStrat = split[0].charAt(0);
                Character myStrat = split[1].charAt(0);
                
                // Rock 1 A X
                // Paper 2 B Y
                // Scissors 3 C Z
                if (enemyStrat.equals('A') && myStrat.equals('X')) {
                    totalScore += 4;
                } else if (enemyStrat.equals('A') && myStrat.equals('Y')) {
                    totalScore += 8;
                } else if (enemyStrat.equals('A') && myStrat.equals('Z')) {
                    totalScore += 3;
                } else if (enemyStrat.equals('B') && myStrat.equals('X')) {
                    totalScore += 1;
                } else if (enemyStrat.equals('B') && myStrat.equals('Y')) {
                    totalScore += 5;
                } else if (enemyStrat.equals('B') && myStrat.equals('Z')) {
                    totalScore += 9;
                } else if (enemyStrat.equals('C') && myStrat.equals('X')) {
                    totalScore += 7;
                } else if (enemyStrat.equals('C') && myStrat.equals('Y')) {
                    totalScore += 2;
                } else if (enemyStrat.equals('C') && myStrat.equals('Z')) {
                    totalScore += 6;
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

