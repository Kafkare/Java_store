
public class Main {
    public static void main(String[] args) {
        ToyStoreDrawing toyStore = new ToyStoreDrawing();
        
        System.out.println("=== TOY STORE DRAWING SYSTEM ===\n");
        
        
        System.out.println("=== ADDING TOYS TO STORE ===");
        toyStore.addToy("TOY001", "Teddy Bear", "15.5");
        toyStore.addToy("TOY002", "Racing Car", "8.2");
        toyStore.addToy("TOY003", "Doll House", "25.0");
        toyStore.addToy("TOY004", "Action Figure", "5.5");
        toyStore.addToy("TOY005", "Building Blocks", "12.3");
        toyStore.addToy("TOY006", "Puzzle", "3.8");
        toyStore.addToy("TOY007", "Board Game", "18.7");
        toyStore.addToy("TOY008", "Remote Control Helicopter", "22.1");
        toyStore.addToy("TOY009", "Stuffed Animal", "7.9");
        toyStore.addToy("TOY010", "Art Set", "14.2");
        toyStore.addToy("TOY011", "Musical Instrument", "9.6");
        toyStore.addToy("TOY012", "Sports Ball", "4.3");
        
        
        toyStore.displayToys();
        toyStore.displayStatistics();
        
        
        System.out.println("\n=== UPDATING TOY WEIGHTS ===");
        toyStore.setToyWeight("TOY002", "10.5");
        toyStore.setToyWeight("TOY006", "6.0");
        
        
        toyStore.performDrawing(10);
        
        
        toyStore.displayStatistics();
        
        System.out.println("\n=== PROGRAM COMPLETED ===");
        System.out.println("Check 'drawing_results.txt' for detailed results.");
        
        
        FileManager.readResultsFromFile("drawing_results.txt");
    }
}