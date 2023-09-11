import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        askIfSmart();
        askIfFunny();
        askIfBlond();
    }


    public void askIfSmart() {
        Scanner in = new Scanner(System.in);
        System.out.print("You are smart (true/false): ");
        boolean isSmart = in.nextBoolean();
        if (isSmart) {
            System.out.println("Congratulations! You are smart.");

        }
    }

    public void askIfFunny() {
        Scanner in = new Scanner(System.in);
        System.out.print("You are funny (true/false): ");
        boolean isFunny = in.nextBoolean();
        if (isFunny) {
            System.out.println("Bigger Congratulations! You are both smart and funny.");
        }
    }

    public void askIfBlond() {
        Scanner in = new Scanner(System.in);
        boolean isFunny = false;
        boolean isSmart = false;
        System.out.print("You are blonde (true/false): ");
        boolean isBlonde = in.nextBoolean();

        if (isBlonde) {
            System.out.println("Ultimate Congratulations! You are smart, funny, and blonde.");
        } else if (!isBlonde) {
            System.out.println("You are not blonde, but you are smart and funny!");
        }
        else if (!isFunny && !isBlonde) {
            System.out.println("You are not funny, but you are smart.");
        }
         else {
            System.out.println("Lower Remark: You are not smart useless");
        }


    }
}





