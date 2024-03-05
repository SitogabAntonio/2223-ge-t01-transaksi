package fintech.driver;
import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S21007 Dame J Sitinjak
 * @author 12S21015 Sitogab Antonio Girsang
 */

 public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();

        // codes
            Account account = new Account(owner, accountName);

            String cmd = scanner.nextLine();

        if(cmd.equals("create-transaction")) {
            accountName = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            String postedAt = scanner.nextLine();
            String note = scanner.nextLine();

            Transaction transaction = new Transaction( accountName,amount,postedAt,note,account);

            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            System.out.println(transaction.getId() + "|" + account.getAccountName() + "|" + transaction.getAmount() + "|" + transaction.getPostedAt() + "|" + transaction.getNote() + "|" + (account.getBalance() + transaction.getAmount()));
            }

        }
    }
}
