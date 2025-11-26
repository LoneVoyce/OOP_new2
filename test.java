git import java.util.Scanner;

    public class test {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            // BILL TO INFORMATION
            System.out.println("Enter Bill To Information");
            System.out.print("Name: ");
            String billName = input.nextLine();

            System.out.print("Address Line 1: ");
            String billAddress1 = input.nextLine();

            System.out.print("Address Line 2: ");
            String billAddress2 = input.nextLine();

            System.out.print("GSTIN: ");
            String billGST = input.nextLine();

            System.out.print("Contact: ");
            String billContact = input.nextLine();

            System.out.print("Email: ");
            String billEmail = input.nextLine();



            // SHIP TO INFORMATION
            System.out.println("\nEnter Ship To Information");

            System.out.print("Name: ");
            String shipName = input.nextLine();

            System.out.print("Address Line 1: ");
            String shipAddress1 = input.nextLine();

            System.out.print("Address Line 2: ");
            String shipAddress2 = input.nextLine();

            System.out.print("GSTIN: ");
            String shipGST = input.nextLine();

            System.out.print("Contact: ");
            String shipContact = input.nextLine();

            System.out.print("Email: ");
            String shipEmail = input.nextLine();


            // --------------------------
            // PRODUCT INFORMATION
            // --------------------------
            System.out.println("\nEnter Product Information");

            System.out.print("S.No: ");
            int sNo = input.nextInt();
            input.nextLine(); // clear buffer

            System.out.print("Product Code: ");
            int productCode = input.nextInt();
            input.nextLine();

            System.out.print("Product Name: ");
            String productName = input.nextLine();

            System.out.print("HSN Code: ");
            int hsn = input.nextInt();

            System.out.print("Quantity: ");
            int qty = input.nextInt();

            System.out.print("Units: ");
            String units = input.next();

            System.out.print("Rate: ");
            double rate = input.nextDouble();

            System.out.print("Tax (%): ");
            double taxRate = input.nextDouble();


            // --------------------------
            // CALCULATIONS
            // --------------------------
            double amount = qty * rate;
            double taxAmount = amount * (taxRate / 100.0);
            double totalBeforeDiscount = amount + taxAmount;
            double discountRate = 0.6368 / 100.0;
            double discount = totalBeforeDiscount * discountRate;
            double grandTotal = totalBeforeDiscount - discount;


            // --------------------------
            // PRINT INVOICE
            // --------------------------
            System.out.println("\n\n=================== SALES INVOICE ===================\n");

            System.out.println("Bill To:");
            System.out.println(billName);
            System.out.println(billAddress1);
            System.out.println(billAddress2);
            System.out.println("GSTIN: " + billGST);
            System.out.println("Contact: " + billContact);
            System.out.println("Email: " + billEmail);

            System.out.println("\nShip To:");
            System.out.println(shipName);
            System.out.println(shipAddress1);
            System.out.println(shipAddress2);
            System.out.println("GSTIN: " + shipGST);
            System.out.println("Contact: " + shipContact);
            System.out.println("Email: " + shipEmail);

            System.out.println("\n-----------------------------------------------------");
            System.out.println("S.No     Product      Qty     Rate     Tax     Amount");
            System.out.println("-----------------------------------------------------");

            System.out.println(
                    sNo + "        " +
                            productName + "     " +
                            qty + "      " +
                            rate + "    " +
                            taxRate + "%    " +
                            String.format("%.2f", totalBeforeDiscount)
            );

            System.out.println("\nTotal Before Discount: " + String.format("%.2f", totalBeforeDiscount));
            System.out.println("Discount (0.6368%):    " + String.format("%.2f", discount));
            System.out.println("Grand Total:           " + String.format("%.2f", grandTotal));

            System.out.println("\n=====================================================");
        }
    }

