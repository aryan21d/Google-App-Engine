import java.util.*;

public class MacroProcessor {
    public static void main(String[] args) {
        // Basic representation of a Macro Definition Table (MDT)
        Map<String, String[]> mdt = new HashMap<>();
        
        // Example: Defining a macro 'INCR'
        mdt.put("INCR", new String[]{"ADD AREG, BREG", "MOVER CREG, AREG"});

        System.out.println("Macro Processor - MDT Content:");
        for (String macroName : mdt.keySet()) {
            System.out.println("Macro: " + macroName);
            for (String line : mdt.get(macroName)) {
                System.out.println("  " + line);
            }
        }
    }
}