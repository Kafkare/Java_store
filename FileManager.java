
import java.io.*;
import java.util.*;


public class FileManager {
    private static final String DEFAULT_FILENAME = "drawing_results.txt";
    
    
    public static boolean writeResultsToFile(List<Toy> drawnToys) {
        return writeResultsToFile(drawnToys, DEFAULT_FILENAME);
    }
    
    
    public static boolean writeResultsToFile(List<Toy> drawnToys, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("=== TOY STORE DRAWING RESULTS ===");
            writer.println("Date: " + new Date());
            writer.println("Total toys drawn: " + drawnToys.size());
            writer.println();
            
            for (int i = 0; i < drawnToys.size(); i++) {
                writer.println("Position " + (i + 1) + ": " + drawnToys.get(i));
            }
            
            System.out.println("\nResults written to '" + filename + "'");
            return true;
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }
    
    
    public static void readResultsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n=== READING FROM FILE: " + filename + " ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}