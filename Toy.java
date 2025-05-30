
import java.util.*;

public class Toy implements Comparable<Toy> {
    private String toyId;
    private String name;
    private double weight;
    
    
    public Toy(String toyId, String name, String weight) {
        this.toyId = toyId;
        this.name = name;
        this.weight = Double.parseDouble(weight);
    }
    
    
    public String getToyId() { return toyId; }
    public String getName() { return name; }
    public double getWeight() { return weight; }
    
    
    public void setWeight(double weight) { this.weight = weight; }
    
    @Override
    public int compareTo(Toy other) {
        return Double.compare(other.weight, this.weight); 
    }
    
    @Override
    public String toString() {
        return String.format("Toy{ID: %s, Name: %s, Weight: %.2f}", toyId, name, weight);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toy toy = (Toy) obj;
        return Objects.equals(toyId, toy.toyId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(toyId);
    }
}