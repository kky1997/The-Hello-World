import java.util.Scanner;
import com.github.lalyos.jfiglet.FigletFont;
public class HelloWorld{

    public static final String RED = "\u001B[31m";
    public static final String LILAC = "\u001B[38;2;221;160;221m";
    public static final String RESET = "\u001B[0m";
    public static Scanner input = new Scanner(System.in);

    public static String arg = "";

    public static void progressBar() throws Exception{
        for(int i = 20; i <= 80; i += 20){
            System.out.print("\rProcessing... [" + i + "%]");
            Thread.sleep(700);
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        String banner = FigletFont.convertOneLine("SIGMACRON");
        System.out.println(RED + banner + RESET);
        Thread.sleep(350);
        System.out.println("Booting Quantum Cores..." + "\n");
        Thread.sleep(700);
        System.out.println("[BOOT] Loading mainframe                            [OK]");
        Thread.sleep(300);
        System.out.println("[BOOT] Executing kernel Instructions                [OK]");
        Thread.sleep(300);
        System.out.println("[BOOT] Virtualizing CPU cores                       [OK]");
        Thread.sleep(300);
        System.out.println("[BOOT] Orchestrating containerization               [OK]");
        Thread.sleep(300);
        System.out.println("[BOOT] Linking AI knowledge base                    [OK]");
        Thread.sleep(300);
        System.out.println("[BOOT] Calibrating fibre optic connection           [OK]" + "\n");
        System.out.println("Initilizing Multi Threaded Quantum Engine v7.37...");
        Thread.sleep(300);
        System.out.println("Calibrating Anoix Antidrive Blockchain...");
        Thread.sleep(300);
        System.out.println("Allocating Binary Metaphase processor...");
        Thread.sleep(300);
        System.out.println("Loading AI neural network..." +"\n");
        Thread.sleep(300);

        System.out.println("[WARNING] Are you sure you wish to proceed? Yes/No");
        arg = input.next().toLowerCase();

        if(arg.equals("yes")){
            String output = FigletFont.convertOneLine("HELLO WORLD");

            progressBar();
            Thread.sleep(300);
            System.out.println(LILAC + output + RESET);
            
        }
        else if(arg.equals("no")){
            System.out.print("Terminating thread pool and killing all processes" + "\n");
        }
        else{
            System.out.print("Invalid input, unlinking virtualized containers and exiting" + "\n");
        }
        

    }
}

