package fintech.model;

    public class Transaction {
        private  int count = 0;
        private int id;
        private String accountName;
        private double amount;
        private String postedAt;
        private String note;
        private Account account;
    
        public Transaction(String accountName, double amount, String postedAt, String note, Account account) {
            this.id = ++count;
            this.accountName = accountName;
            this.amount = amount;
            this.postedAt = postedAt;
            this.note = note;
            this.account = account;
        }
    
        public int getId() {
            return id;
        }
    
        public String getAccountName() {
            return accountName;
        }
    
        public double getAmount() {
            return amount;
        }
    
        public String getPostedAt() {
            return postedAt;
        }
    
        public String getNote() {
            return note;
        }
    }
    
