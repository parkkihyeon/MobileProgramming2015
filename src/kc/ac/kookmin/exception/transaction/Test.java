package kc.ac.kookmin.exception.transaction;

class Bank {
	private int balance = 1000;
	public void oneqTrade() {
		try
		{
			tradeWithA();
			tradeWithB();
			tradeWithC();
			Exception ex = new Exception();
			throw ex;
		}
		catch(Exception e)
		{
			System.out.println("�ŷ��� ���� �߻�, ��ü ��� ");
			cancelA();
			cancelB();
			cancelC();
		}
		
		System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ���� �ϰ� �ʹ�.
	}
	
	public void tradeWithA () {
		int m = 100; // A���¿��� ����� �ݾ�
		try {
			System.out.println("A ���¿��� ��� - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("A���� �ŷ� ���� �߻�");
			cancelA();
		}
		
	}
	public void tradeWithB() {
		int m = 200;
		try {
			System.out.println("B ���¿��� ��� - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("B���� �ŷ� ���� �߻�");
			cancelB();
		}
	}
	public void tradeWithC() {
		int m = 300;
		try {
			System.out.println("C ���¿��� ��� - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("C���� �ŷ� ���� �߻�");
			cancelC();
		}
	}
        public void cancelA() {
		System.out.println("A ���� �ŷ� ���  ");
		balance += 100;
	}
	public void cancelB() {
		System.out.println("B ���� �ŷ� ���  ");
		balance += 200;
	}
	public void cancelC() {
		System.out.println("C ���� �ŷ� ���  ");
		balance += 300;
	}
}

public class Test {
    public static void main(String args[]) 
    {
    	Bank b = new Bank();
    	b.oneqTrade();
    }
} 