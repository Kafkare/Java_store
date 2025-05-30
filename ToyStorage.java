
import java.util.*;


public class ToyStorage {
    private ArrayList<String> toyIds;
    private ArrayList<String> toyNames;
    private ArrayList<Double> toyWeights;
    
    public ToyStorage() {
        toyIds = new ArrayList<>();
        toyNames = new ArrayList<>();
        toyWeights = new ArrayList<>();
    }
    
    
    public void addToyData(String toyId, String name, double weight) {
        toyIds.add(toyId);
        toyNames.add(name);
        toyWeights.add(weight);
    }
    
    
    public boolean updateToyWeight(String toyId, double newWeight) {
        int index = toyIds.indexOf(toyId);
        if (index != -1) {
            toyWeights.set(index, newWeight);
            return true;
        }
        return false;
    }
    
    
    public Toy getToyByIndex(int index) {
        if (index >= 0 && index < toyIds.size()) {
            return new Toy(toyIds.get(index), toyNames.get(index), toyWeights.get(index).toString());
        }
        return null;
    }
    
    
    public int findToyIndex(String toyId) {
        return toyIds.indexOf(toyId);
    }
    
    
    public List<Toy> getAllToys() {
        List<Toy> toys = new ArrayList<>();
        for (int i = 0; i < toyIds.size(); i++) {
            toys.add(new Toy(toyIds.get(i), toyNames.get(i), toyWeights.get(i).toString()));
        }
        return toys;
    }
    
    
    public ArrayList<String> getToyIds() { return new ArrayList<>(toyIds); }
    public ArrayList<String> getToyNames() { return new ArrayList<>(toyNames); }
    public ArrayList<Double> getToyWeights() { return new ArrayList<>(toyWeights); }
    
    public int size() { return toyIds.size(); }
    
    public void displayToys() {
        for (int i = 0; i < toyIds.size(); i++) {
            System.out.printf("ID: %s, Name: %s, Weight: %.2f%n", 
                            toyIds.get(i), toyNames.get(i), toyWeights.get(i));
        }
        System.out.println("Total toys: " + toyIds.size());
    }
}