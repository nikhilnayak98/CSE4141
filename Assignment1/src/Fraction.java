public class Fraction {

    int numerator, denominator;

    public Fraction() {}

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    void displayFraction() {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    Fraction addFraction(Fraction f) {
        int cd = this.denominator * f.denominator;

        int den1 = this.denominator;
        int den2 = f.denominator;
        int num1 = this.numerator * (cd / den1);
        int num2 = f.numerator * (cd / den2);
        int num3 = num1 + num2;
        Fraction f2 = new Fraction (num3, cd);
        f2 = f2.simplify();
        return f2;
    }

    Fraction subFraction(Fraction f) {
        int cd = this.denominator * f.denominator;

        int den1 = this.denominator;
        int den2 = f.denominator;
        int num1 = this.numerator * (cd / den1);
        int num2 = f.numerator * (cd / den2);
        int num3 = num1 - num2;

        Fraction f2 = new Fraction (num3, cd);
        f2 = f2.simplify();
        return f2;
    }

    Fraction mulFraction(Fraction f) {
        int den1 = this.denominator;
        int den2 = f.denominator;
        int num1 = this.numerator;
        int num2 = f.numerator;
        int num3 = num1 * num2;
        int den3 = den1 * den2;

        Fraction f2 = new Fraction (num3, den3);
        f2 = f2.simplify();
        return f2;
    }

    Fraction divFraction(Fraction f) {
        int den1 = this.denominator;
        int den2 = f.denominator;
        int num1 = this.numerator;
        int num2 = f.numerator;

        int num3 = num1 * den2;
        if(num2 < 0){
            num2 = 0-num2;
            num3 = 0 - num3;
        }
        int den3 = den1 * num2;

        Fraction f2 = new Fraction (num3, den3);
        f2 = f2.simplify();
        return f2;
    }

    int gcd(Fraction f){
        int testNum = f.numerator;
        int testDen = f.denominator;

        if(testNum < 0)
            testNum = 0 - testNum;
        else if(testDen < 0)
            testDen = 0 - testDen;

        while(testNum != testDen){
            if (testNum > testDen)
                testNum -= testDen;
            else
                testDen -= testNum;
        }
        return testNum;
    }

    Fraction simplify(){
        int gcd = gcd(this);

        int simpNum = this.numerator;
        int simpDen = this.denominator;

        simpNum /= gcd;
        simpDen /= gcd;

        return new Fraction(simpNum, simpDen);
    }

}
