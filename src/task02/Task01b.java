package task02;
import java.util.Scanner;
public class Task01b {
	

	

	

		public static void main(String[] args) {
			int lensmax = Integer.MIN_VALUE;
			int lensmin = Integer.MAX_VALUE;
			String smin = new String();
			String smax = new String();
			String setalon = new String();
			Scanner sin = new Scanner(System.in);
			System.out.println("������� n �����, ��������� ����� �����, ��������� ������ �������.");
			do {
				System.out.print("������� ������ ��������: ");
				setalon = sin.nextLine();
				if (setalon.length() >= lensmax) {
					smax = setalon;
					lensmax = setalon.length();
				}
				if (setalon.length() <= lensmin && setalon.length() > 0) {
					smin = setalon;
					lensmin = setalon.length();
				}
			} while (setalon.length() > 0);
			System.out.println();
			if (lensmax > lensmin) {
				System.out.println("����� ������� ������ (��������� ��� ��������� �������): " + smax);
				
				System.out.println("����� ������ : " + lensmax + " ����.");
				System.out.println();
				System.out.println("����� �������� ������ (��������� ��� ��������� ��������): " + smin);				
				System.out.println("����� ������ : " + lensmin + " ����.");
			} else if (lensmax != 0) {
				System.out.println("�� ����� ������ ��������� : �� " + lensmax + " ����.");
			} else {
				System.out.println("������������ ����� ��� ���������.");
			}

		}

	}


