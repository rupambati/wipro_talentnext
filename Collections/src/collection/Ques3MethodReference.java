package collection;

interface PrimeChecker {
    MyPrime check(int num);
}

class MyPrime {
    MyPrime(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
    
public class Ques3MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeChecker pc = MyPrime::new;
		pc.check(17);
        pc.check(18);

	}

}