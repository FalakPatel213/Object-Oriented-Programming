interface Bank {
    float RateOfInterest ();
}

class SBI implements Bank {
    public float RateOfInterest () {
        return 9.15f;
    }
}

class PNB implements Bank {
    public float RateOfInterest () {
        return 9.7f;
    }
}

class ExMain {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println("SBI ROI : " + b1.RateOfInterest());
        Bank b2 = new PNB();
        System.out.println("SBI ROI : " + b2.RateOfInterest());
    }
}