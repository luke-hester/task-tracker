package tasktracker;

public class App {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        if (args.length == 0) {
            System.out.println("No arguments provided");
            // Not implemented yet
            //System.out.println("Type 'help' for a list of commands");
            return;
        }

        if (args[0].equals("add")) {
            if (args.length < 2){
                System.out.println("Not enough arguments. Usage: add <task name>");
            } else {
                tracker.add(args[1]);
            }
        }
    }
}
