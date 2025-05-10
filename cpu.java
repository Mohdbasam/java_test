public class CPU {
    double price;  // Attribute for price of the CPU
    
    // Inner class Processor
    class Processor {
        int cores;
        String manufacturer;
        
        // Constructor for Processor class
        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        
        // Method to print Processor info
        void printProcessorInfo() {
            System.out.println("Processor Info:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    
    // Static Nested class RAM
    static class RAM {
        int memory;  // in GB
        String manufacturer;
        
        // Constructor for RAM class
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        
        // Method to print RAM info
        void printRAMInfo() {
            System.out.println("RAM Info:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    
    // Constructor for CPU class
    CPU(double price) {
        this.price = price;
    }
    
    public static void main(String[] args) {
        // Create a CPU object with price
        CPU cpu = new CPU(299.99);
        
        // Create a Processor object using the inner class
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.printProcessorInfo();  // Print Processor information
        
        // Create a RAM object using the static nested class
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.printRAMInfo();  // Print RAM information
        
        // Print the CPU price
        System.out.println("CPU Price: $" + cpu.price);
    }
}