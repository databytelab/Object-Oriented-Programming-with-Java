class Bank {
    // Constructor without arguments
    Bank() {
    }

    // Method return an InterestRate
    public float getInterestRate() {
        return 0;
    }
}

class SCB extends Bank {
    public float getInterestRate() {
        return 8.4f;
    }
}

class TTB extends Bank {
    public float getInterestRate() {
        return 5.3f;
    }
}
