
import java.util.*;
import java.io.*;;


public class DrawingManager {
    private PriorityQueue<Toy> toyQueue;
    private ToyStorage storage;
    
    public DrawingManager(ToyStorage storage) {
        this.storage = storage;
        this.toyQueue = new PriorityQueue<>();
        rebuildQueue();
    }
    
    
    public void rebuildQueue() {
        toyQueue.clear();
        List<Toy> allToys = storage.getAllToys();
        toyQueue.addAll(allToys);
    }
    
    
    public void addToyToQueue(Toy toy) {
        toyQueue.offer(toy);
    }
    
    
    public List<Toy> performDrawing(int numDraws) {
        List<Toy> drawnToys = new ArrayList<>();
        
        System.out.println("\n=== PERFORMING TOY DRAWING ===");
        System.out.println("Drawing " + numDraws + " toys...\n");
        
        
        PriorityQueue<Toy> drawQueue = new PriorityQueue<>(toyQueue);
        
        for (int i = 1; i <= numDraws && !drawQueue.isEmpty(); i++) {
            Toy drawnToy = drawQueue.poll();
            drawnToys.add(drawnToy);
            System.out.println("Draw " + i + ": " + drawnToy);
        }
        
        return drawnToys;
    }
    
    
    public int getQueueSize() {
        return toyQueue.size();
    }
    
    
    public boolean isQueueEmpty() {
        return toyQueue.isEmpty();
    }
}