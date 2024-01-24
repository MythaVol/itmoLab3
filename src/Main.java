import Classes.*;
import Classes.Actions.*;
import Classes.Items.Dream;
import Classes.Items.Everything;
import Classes.Items.Long;
import Classes.Persons.*;
import Classes.Places.*;
import Enums.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Plot p = new Plot();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of sentence which from we start");
        int j = s.nextInt();
        p.run(j);

    }
}