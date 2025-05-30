
import java.util.*;


public class ToyStoreDrawing {
    private ToyStorage storage;
    private DrawingManager drawingManager;
    
    public ToyStoreDrawing() {
        storage = new ToyStorage();
        drawingManager = new DrawingManager(storage);
    }
    
    
    public void addToy(String toyId, String name, String weight) {
        
        Toy toy = new Toy(toyId, name, weight);
        
        
        storage.addToyData(toyId, name, toy.getWeight());
        
        
        drawingManager.addToyToQueue(toy);
        
        System.out.println("Added toy: " + toy);
    }
    
    
    public boolean setToyWeight(String toyId, String newWeight) {
        double weight = Double.parseDouble(newWeight);
        
        if (storage.updateToyWeight(toyId, weight)) {
        
            drawingManager.rebuildQueue();
            System.out.println("Updated weight for toy ID " + toyId + " to " + weight);
            return true;
        }
        
        System.out.println("Toy with ID " + toyId + " not found.");
        return false;
    }
    
    
    public void performDrawing(int numDraws) {
        List<Toy> drawnToys = drawingManager.performDrawing(numDraws);
        FileManager.writeResultsToFile(drawnToys);
    }
    
    
    public void displayToys() {
        storage.displayToys();
    }
    
    
    public void displayStatistics() {
        System.out.println("\n=== SYSTEM STATISTICS ===");
        System.out.println("Total toys in storage: " + storage.size());
        System.out.println("Toys in drawing queue: " + drawingManager.getQueueSize());
        System.out.println("Queue status: " + (drawingManager.isQueueEmpty() ? "Empty" : "Ready"));
    }
}