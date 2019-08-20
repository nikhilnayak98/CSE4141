public class Number {

    int number;

    static int count = 0;

    public Number() {
        count++;
    }

    public Number(int number) {
        this.number = number;
        count++;
    }

    static int countObj() {
        return count;
    }

    boolean isPrime() {
        if(number <= 1)
            return false;
        if(number <= 3)
            return true;
        if(number % 2 == 0 || number % 3 == 0)
            return false;

        for(int i = 5; i * i <= number; i += 6)
            if((number % i == 0) || ((number % (i + 2)) == 0))
                return false;
        return true;
    }

    int factorial() {
        int result = 1, i;
        for(i = 2; i <= number; i++)
            result *= i;
        return result;
    }

    int sumOfDigits() {
        int sum = 0, n = number;
        while(n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    int reverseNum() {
        int num = number;
        int rev_num = 0;
        while(num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    double operate(String op, int b) {
        if(op.equalsIgnoreCase("+"))
            return number + b;
        else if(op.equalsIgnoreCase("-"))
            return number - b;
        else if(op.equalsIgnoreCase("/"))
            return number / b;
        else if(op.equalsIgnoreCase("*"))
            return number * b;
        else {
            System.out.println("Invalid Operator");
            return 0;
        }
    }

}
