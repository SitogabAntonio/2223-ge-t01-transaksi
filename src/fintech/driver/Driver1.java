package fintech.driver;
import java.util.Scanner;

import fintech.model.Account;

/**
 * @author NIM Nama
 * @author NIM Nama
 * @author 12S21007 Dame J Sitinjak
 * @author 12S21015 Sitogab Antonio Girsang
 */

 public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();

        // codes
            Account account = new Account(owner, accountName);
            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());

        } else {
            System.out.println("command salah!!!");
        }
    }

    
}