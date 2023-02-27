package home_work_9;

import java.util.Objects;

public class Receipt {
        private String message;
        int amount;

        public Receipt(String message, int amount) {
            this.message = message;
            this.amount = amount;
        }
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
        public int getAmount() {
            return amount;
        }
        public void setAmount(int amount) {
            this.amount = amount;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Receipt receipt = (Receipt) o;
            return amount == receipt.amount && Objects.equals(message, receipt.message);
        }
        @Override
        public int hashCode() {
            return Objects.hash(message, amount);
        }

        @Override
        public String toString() {
            return "Receipt{" +
                    "message='" + message + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

