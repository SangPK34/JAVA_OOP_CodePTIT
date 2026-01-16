package J04014_Tinh_Toan_Phan_So;
import java.util.*;

class Fraction {
    long num, den;

    public Fraction(long num, long den) {
        this.num = num;
        this.den = den;
        normalize();
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }

    void normalize() {
        if (den < 0) {
            den = -den;
            num = -num;
        }
        long g = gcd(num, den);
        num /= g;
        den /= g;
    }

    Fraction add(Fraction o) {
        long n = this.num * o.den + this.den * o.num;
        long d = this.den * o.den;
        return new Fraction(n, d);
    }

    Fraction mul(Fraction o) {
        long n = this.num * o.num;
        long d = this.den * o.den;
        return new Fraction(n, d);
    }

    Fraction square() {
        return new Fraction(num * num, den * den);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            Fraction A = new Fraction(a, b);
            Fraction B = new Fraction(c, d);

            Fraction C = A.add(B).square();
            Fraction D = A.mul(B).mul(C);

            System.out.println(C + " " + D);
        }
    }
}
