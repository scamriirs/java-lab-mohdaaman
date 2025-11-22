class Bill {
    int units;

    Bill(int u) {
        units = u;
    }
}

class ElectricityBill extends Bill {

    ElectricityBill(int u) {
        super(u);
    }

    double calculateBill() {
        double amount;

        if (units <= 100)
            amount = units * 5;
        else if (units <= 200)
            amount = (100 * 5) + (units - 100) * 7;
        else
            amount = (100 * 5) + (100 * 7) + (units - 200) * 10;

        return amount;
    }

    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill(250);
        System.out.println("Total Bill Amount: ₹" + obj.calculateBill());
    }
}
