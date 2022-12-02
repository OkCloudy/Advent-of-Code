import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class highestCals {

    public static int highestCal() {
        int maxCals = 0;
        try {
            File myObj = new File("elf_inventory.txt");
            Scanner myReader = new Scanner(myObj);
            int currElfCals = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                
                 if (!data.equals("")) {
                    int itemCals = Integer.parseInt(data);
                    currElfCals += itemCals;
                } else {
                    if (currElfCals > maxCals) {
                        maxCals = currElfCals;
                    }
                    currElfCals = 0;
                } 
        
            }
            System.out.println(maxCals);
        
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        return maxCals;
    }

    public static int totalTopThree() {
        int maxCals = 0;
        
        try {
            File myObj = new File("elf_inventory.txt");
            Scanner myReader = new Scanner(myObj);
            int currElfCals = 0;
            int first = 0;
            int second = 0;
            int third = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.equals("")) {
                    int itemCals = Integer.parseInt(data);
                    currElfCals += itemCals;
                } else { // currElfCals: 80000
                    if (currElfCals > first) { // first: 70000
                        third = second;
                        second = first;
                        first = currElfCals;
                    } else if (currElfCals > second) { // second: 68000
                        third = second;
                        second = currElfCals;
                    } else if (currElfCals > third) { // third: 65000
                        third = currElfCals;
                    }
                    currElfCals = 0;
                }
            }
            maxCals += first;
            maxCals += second;
            maxCals += third;
            System.out.println(maxCals);
            myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        return maxCals;
    }
    public static void main(String[] args) {
        totalTopThree();
  }
}