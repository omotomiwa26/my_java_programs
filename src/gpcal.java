import java.util.Scanner;

public class gpcal {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Course Code");
		CharSequence code = inp.next();
		System.out.println(code + " Score");
		int code1 = inp.nextInt();
		System.out.println(code + " unit");
		double unit = inp.nextInt();
		double A = 4.00;
		double AB = 3.63;
		double B = 3.13;
		double C = 2.63;
		double D = 2.13;
		double E = 0;
		double gp = 0;

		if ((code1 < 0) && (code1 > 100)) {
			System.out.println("Input Error");
		}
		if ((code1 >= 80) && (code1 <= 100)) {
			gp = unit * A;
			System.out.println(code + " = A");
			System.out.println(code + "= " + gp);
		}
		if ((code1 >= 70) && (code1 <= 79)) {
			gp = unit * AB;
			System.out.println(code + " = AB");
			System.out.println(code + " = " + gp);
		}
		if ((code1 >= 60) && (code1 <= 69)) {
			gp = unit * B;
			System.out.println(code + " = B");
			System.out.println(code + " = " + gp);
		}
		if ((code1 >= 50) && (code1 <= 59)) {
			gp = unit * C;
			System.out.println(code + " = C");
			System.out.println(code + " = " + gp);
		}
		if ((code1 >= 40) && (code1 <= 49)) {
			gp = unit * D;
			System.out.println(code + " = D");
			System.out.println(code + " = " + gp);
		}
		if ((code1 >= 0) && (code1 <= 39)) {
			gp = unit * E;
			System.out.println(code + " = E");
			System.out.println(code + " = " + gp);
		}
		System.out.println("Enter Course2 Code");
		CharSequence code2 = inp.next();
		System.out.println(code2 + " Score");
		int code3 = inp.nextInt();
		System.out.println(code + " unit");
		int unit1 = inp.nextInt();
		double gp1 = 0;
		if ((code3 < 0) && (code3 > 100)) {
			System.out.println("Input Error");
		}
		if ((code3 >= 80) && (code3 <= 100)) {
			gp1 = unit1 * A;
			System.out.println(code2 + " = A");
			System.out.println(code2 + "= " + gp1);
		}
		if ((code3 >= 70) && (code3 <= 79)) {
			gp1 = unit1 * AB;
			System.out.println(code2 + " = AB");
			System.out.println(code2 + " = " + gp1);
		}
		if ((code3 >= 60) && (code3 <= 69)) {
			gp1 = unit1 * B;
			System.out.println(code2 + " = B");
			System.out.println(code2 + " = " + gp1);
		}
		if ((code3 >= 50) && (code3 <= 59)) {
			gp1 = unit1 * C;
			System.out.println(code2 + " = C");
			System.out.println(code2 + " = " + gp1);
		}
		if ((code3 >= 40) && (code3 <= 49)) {
			gp1 = unit1 * D;
			System.out.println(code2 + " = D");
			System.out.println(code2 + " = " + gp1);
		}
		if ((code3 >= 0) && (code3 <= 39)) {
			gp1 = unit1 * E;
			System.out.println(code2 + " = E");
			System.out.println(code2 + " = " + gp1);
		}
		System.out.println("Enter Course3 Code");
		CharSequence codeA = inp.next();
		System.out.println(codeA + " Score");
		int code4 = inp.nextInt();
		System.out.println(codeA + " unit");
		int unit2 = inp.nextInt();
		double gp2 = 0;
		if ((code4 < 0) && (code4 > 100)) {
			System.out.println("Input Error");
		}
		if ((code4 >= 80) && (code4 <= 100)) {
			gp2 = unit2 * A;
			System.out.println(codeA + " = A");
			System.out.println(codeA + "= " + gp2);
		}
		if ((code4 >= 70) && (code4 <= 79)) {
			gp2 = unit2 * AB;
			System.out.println(codeA + " = AB");
			System.out.println(codeA + " = " + gp2);
		}
		if ((code4 >= 60) && (code4 <= 69)) {
			gp2 = unit2 * B;
			System.out.println(codeA + " = B");
			System.out.println(codeA + " = " + gp2);
		}
		if ((code4 >= 50) && (code4 <= 59)) {
			gp2 = unit2 * C;
			System.out.println(codeA + " = C");
			System.out.println(codeA + " = " + gp2);
		}
		if ((code4 >= 40) && (code4 <= 49)) {
			gp2 = unit2 * D;
			System.out.println(codeA + " = D");
			System.out.println(codeA + " = " + gp2);
		}
		if ((code4 >= 0) && (code4 <= 39)) {
			gp2 = unit2 * E;
			System.out.println(codeA + " = E");
			System.out.println(codeA + " = " + gp2);
		}
		System.out.println("Enter Course4 Code");
		CharSequence codeB = inp.next();
		System.out.println(codeB + " Score");
		int code5 = inp.nextInt();
		System.out.println(codeB + " unit");
		int unit3 = inp.nextInt();
		double gp3 = 0;
		if ((code5 < 0) && (code5 > 100)) {
			System.out.println("Input Error");
		}
		if ((code5 >= 80) && (code5 <= 100)) {
			gp3 = unit3 * A;
			System.out.println(codeB + " = A");
			System.out.println(codeB + "= " + gp3);
		}
		if ((code5 >= 70) && (code5 <= 79)) {
			gp3 = unit3 * AB;
			System.out.println(codeB + " = AB");
			System.out.println(codeB + " = " + gp3);
		}
		if ((code5 >= 60) && (code5 <= 69)) {
			gp3 = unit3 * B;
			System.out.println(codeB + " = B");
			System.out.println(codeB + " = " + gp3);
		}
		if ((code5 >= 50) && (code5 <= 59)) {
			gp3 = unit3 * C;
			System.out.println(codeB + " = C");
			System.out.println(codeB + " = " + gp3);
		}
		if ((code5 >= 40) && (code5 <= 49)) {
			gp3 = unit3 * D;
			System.out.println(codeB + " = D");
			System.out.println(codeB + " = " + gp3);
		}
		if ((code5 >= 0) && (code5 <= 39)) {
			gp3 = unit3 * E;
			System.out.println(codeB + " = E");
			System.out.println(codeB + " = " + gp3);
		}
		System.out.println("Enter Course5 Code");
		CharSequence codeC = inp.next();
		System.out.println(codeC + " Score");
		int code6 = inp.nextInt();
		System.out.println(codeC + " unit");
		int unit4 = inp.nextInt();
		double gp4 = 0;
		if ((code6 < 0) && (code6 > 100)) {
			System.out.println("Input Error");
		}
		if ((code6 >= 80) && (code6 <= 100)) {
			gp4 = unit4 * A;
			System.out.println(codeC + " = A");
			System.out.println(codeC + "= " + gp4);
		}
		if ((code6 >= 70) && (code6 <= 79)) {
			gp4 = unit4 * AB;
			System.out.println(codeC + " = AB");
			System.out.println(codeC + " = " + gp4);
		}
		if ((code6 >= 60) && (code6 <= 69)) {
			gp4 = unit4 * B;
			System.out.println(codeC + " = B");
			System.out.println(codeC + " = " + gp4);
		}
		if ((code6 >= 50) && (code6 <= 59)) {
			gp4 = unit4 * C;
			System.out.println(codeC + " = C");
			System.out.println(codeC + " = " + gp4);
		}
		if ((code6 >= 40) && (code6 <= 49)) {
			gp4 = unit4 * D;
			System.out.println(codeC + " = D");
			System.out.println(codeC + " = " + gp4);
		}
		if ((code6 >= 0) && (code6 <= 39)) {
			gp4 = unit4 * E;
			System.out.println(codeC + " = E");
			System.out.println(codeC + " = " + gp4);
		}
		System.out.println("Enter Course6 Code");
		CharSequence codeD = inp.next();
		System.out.println(codeD + " Score");
		int code7 = inp.nextInt();
		System.out.println(codeD + " unit");
		int unit5 = inp.nextInt();
		double gp5 = 0;
		if ((code7 < 0) && (code7 > 100)) {
			System.out.println("Input Error");
		}
		if ((code7 >= 80) && (code7 <= 100)) {
			gp5 = unit5 * A;
			System.out.println(codeD + " = A");
			System.out.println(codeD + "= " + gp5);
		}
		if ((code7 >= 70) && (code7 <= 79)) {
			gp5 = unit5 * AB;
			System.out.println(codeD + " = AB");
			System.out.println(codeD + " = " + gp5);
		}
		if ((code7 >= 60) && (code7 <= 69)) {
			gp5 = unit5 * B;
			System.out.println(codeD + " = B");
			System.out.println(codeD + " = " + gp5);
		}
		if ((code7 >= 50) && (code7 <= 59)) {
			gp5 = unit5 * C;
			System.out.println(codeD + " = C");
			System.out.println(codeD + " = " + gp5);
		}
		if ((code7 >= 40) && (code7 <= 49)) {
			gp5 = unit5 * D;
			System.out.println(codeD + " = D");
			System.out.println(codeD + " = " + gp5);
		}
		if ((code7 >= 0) && (code7 <= 39)) {
			gp5 = unit5 * E;
			System.out.println(codeD + " = E");
			System.out.println(codeD + " = " + gp5);
		}
		System.out.println("Enter Course7 Code");
		CharSequence codeE = inp.next();
		System.out.println(codeE + " Score");
		int code8 = inp.nextInt();
		System.out.println(codeE + " unit");
		int unit6 = inp.nextInt();
		double gp6 = 0;
		if ((code8 < 0) && (code8 > 100)) {
			System.out.println("Input Error");
		}
		if ((code8 >= 80) && (code8 <= 100)) {
			gp6 = unit6 * A;
			System.out.println(codeE + " = A");
			System.out.println(codeE + "= " + gp6);
		}
		if ((code8 >= 70) && (code8 <= 79)) {
			gp6 = unit6 * AB;
			System.out.println(codeE + " = AB");
			System.out.println(codeE + " = " + gp6);
		}
		if ((code8 >= 60) && (code8 <= 69)) {
			gp6 = unit6 * B;
			System.out.println(codeE + " = B");
			System.out.println(codeE + " = " + gp6);
		}
		if ((code8 >= 50) && (code8 <= 59)) {
			gp6 = unit6 * C;
			System.out.println(codeE + " = C");
			System.out.println(codeE + " = " + gp6);
		}
		if ((code8 >= 40) && (code8 <= 49)) {
			gp6 = unit6 * D;
			System.out.println(codeE + " = D");
			System.out.println(codeE + " = " + gp6);
		}
		if ((code8 >= 0) && (code8 <= 39)) {
			gp6 = unit6 * E;
			System.out.println(codeE + " = E");
			System.out.println(codeE + " = " + gp6);
		}
		System.out.println("Enter Course8 Code");
		CharSequence codeF = inp.next();
		System.out.println(codeF + " Score");
		int code9 = inp.nextInt();
		System.out.println(codeF + " unit");
		int unit7 = inp.nextInt();
		double gp7 = 0;
		if ((code9 < 0) && (code9 > 100)) {
			System.out.println("Input Error");
		}
		if ((code9 >= 80) && (code9 <= 100)) {
			gp7 = unit7 * A;
			System.out.println(codeF + " = A");
			System.out.println(codeF + "= " + gp7);
		}
		if ((code9 >= 70) && (code9 <= 79)) {
			gp7 = unit7 * AB;
			System.out.println(codeF + " = AB");
			System.out.println(codeF + " = " + gp7);
		}
		if ((code9 >= 60) && (code9 <= 69)) {
			gp7 = unit7 * B;
			System.out.println(codeF + " = B");
			System.out.println(codeF + " = " + gp7);
		}
		if ((code9 >= 50) && (code9 <= 59)) {
			gp7 = unit7 * C;
			System.out.println(codeF + " = C");
			System.out.println(codeF + " = " + gp7);
		}
		if ((code9 >= 40) && (code9 <= 49)) {
			gp7 = unit7 * D;
			System.out.println(codeF + " = D");
			System.out.println(codeF + " = " + gp7);
		}
		if ((code9 >= 0) && (code9 <= 39)) {
			gp7 = unit7 * E;
			System.out.println(codeF + " = E");
			System.out.println(codeF + " = " + gp7);
		}
		System.out.println("Enter Course9 Code");
		CharSequence codeG = inp.next();
		System.out.println(codeG + " Score");
		int code10 = inp.nextInt();
		System.out.println(codeG + " unit");
		int unit8 = inp.nextInt();
		double gp8 = 0;
		if ((code10 < 0) && (code10 > 100)) {
			System.out.println("Input Error");
		}
		if ((code10 >= 80) && (code10 <= 100)) {
			gp8 = unit8 * A;
			System.out.println(codeG + " = A");
			System.out.println(codeG + "= " + gp8);
		}
		if ((code10 >= 70) && (code10 <= 79)) {
			gp8 = unit8 * AB;
			System.out.println(codeG + " = AB");
			System.out.println(codeG + " = " + gp8);
		}
		if ((code10 >= 60) && (code10 <= 69)) {
			gp8 = unit8 * B;
			System.out.println(codeG + " = B");
			System.out.println(codeG + " = " + gp8);
		}
		if ((code10 >= 50) && (code10 <= 59)) {
			gp8 = unit8 * C;
			System.out.println(codeG + " = C");
			System.out.println(codeG + " = " + gp8);
		}
		if ((code10 >= 40) && (code10 <= 49)) {
			gp8 = unit8 * D;
			System.out.println(codeG + " = D");
			System.out.println(codeG + " = " + gp8);
		}
		if ((code10 >= 0) && (code10 <= 39)) {
			gp8 = unit8 * E;
			System.out.println(codeG + " = E");
			System.out.println(codeG + " = " + gp8);
		}
		System.out.println("Enter Course10 Code");
		CharSequence codeH = inp.next();
		System.out.println(codeG + " Score");
		int code11 = inp.nextInt();
		System.out.println(codeG + " unit");
		int unit9 = inp.nextInt();
		double gp9 = 0;
		if ((code11 < 0) && (code11 > 100)) {
			System.out.println("Input Error");
		}
		if ((code11 >= 80) && (code11 <= 100)) {
			gp9 = unit9 * A;
			System.out.println(codeH + " = A");
			System.out.println(codeH + "= " + gp9);
		}
		if ((code11 >= 70) && (code11 <= 79)) {
			gp9 = unit9 * AB;
			System.out.println(codeH + " = AB");
			System.out.println(codeH + " = " + gp9);
		}
		if ((code11 >= 60) && (code11 <= 69)) {
			gp9 = unit9 * B;
			System.out.println(codeH + " = B");
			System.out.println(codeH + " = " + gp9);
		}
		if ((code11 >= 50) && (code11 <= 59)) {
			gp9 = unit9 * C;
			System.out.println(codeH + " = C");
			System.out.println(codeH + " = " + gp9);
		}
		if ((code11 >= 40) && (code11 <= 49)) {
			gp9 = unit9 * D;
			System.out.println(codeH + " = D");
			System.out.println(codeH + " = " + gp9);
		}
		if ((code11 >= 0) && (code11 <= 39)) {
			gp9 = unit9 * E;
			System.out.println(codeH + " = E");
			System.out.println(codeH + " = " + gp9);
		}
		System.out.println("Enter Course11 Code");
		CharSequence codeI = inp.next();
		System.out.println(codeI + " Score");
		int code12 = inp.nextInt();
		System.out.println(codeI + " unit");
		int unit10 = inp.nextInt();
		double gp10 = 0;
		if ((code12 < 0) && (code12 > 100)) {
			System.out.println("Input Error");
		}
		if ((code12 >= 80) && (code12 <= 100)) {
			gp10 = unit10 * A;
			System.out.println(codeI + " = A");
			System.out.println(codeI + "= " + gp10);
		}
		if ((code12 >= 70) && (code12 <= 79)) {
			gp10 = unit10 * AB;
			System.out.println(codeI + " = AB");
			System.out.println(codeI + " = " + gp10);
		}
		if ((code12 >= 60) && (code12 <= 69)) {
			gp10 = unit10 * B;
			System.out.println(codeI + " = B");
			System.out.println(codeI + " = " + gp10);
		}
		if ((code12 >= 50) && (code12 <= 59)) {
			gp10 = unit10 * C;
			System.out.println(codeI + " = C");
			System.out.println(codeI + " = " + gp10);
		}
		if ((code12 >= 40) && (code12 <= 49)) {
			gp10 = unit10 * D;
			System.out.println(codeI + " = D");
			System.out.println(codeI + " = " + gp10);
		}
		if ((code12 >= 0) && (code12 <= 39)) {
			gp10 = unit10 * E;
			System.out.println(codeI + " = E");
			System.out.println(codeI + " = " + gp10);
		}
		System.out.println("Enter Course12 Code");
		CharSequence codeJ = inp.next();
		System.out.println(codeJ + " Score");
		int code13 = inp.nextInt();
		System.out.println(codeJ + " unit");
		int unit11 = inp.nextInt();
		double gp11 = 0;
		if ((code13 < 0) && (code13 > 100)) {
			System.out.println("Input Error");
		}
		if ((code13 >= 80) && (code13 <= 100)) {
			gp11 = unit11 * A;
			System.out.println(codeJ + " = A");
			System.out.println(codeJ + "= " + gp11);
		}
		if ((code13 >= 70) && (code13 <= 79)) {
			gp11 = unit11 * AB;
			System.out.println(codeJ + " = AB");
			System.out.println(codeJ + " = " + gp11);
		}
		if ((code13 >= 60) && (code13 <= 69)) {
			gp11 = unit11 * B;
			System.out.println(codeJ + " = B");
			System.out.println(codeJ + " = " + gp11);
		}
		if ((code13 >= 50) && (code13 <= 59)) {
			gp11 = unit11 * C;
			System.out.println(codeJ + " = C");
			System.out.println(codeJ + " = " + gp11);
		}
		if ((code13 >= 40) && (code13 <= 49)) {
			gp11 = unit11 * D;
			System.out.println(codeJ + " = D");
			System.out.println(codeJ + " = " + gp11);
		}
		if ((code13 >= 0) && (code13 <= 39)) {
			gp11 = unit11 * E;
			System.out.println(codeJ + " = E");
			System.out.println(codeJ + " = " + gp11);
		}
		System.out.println("Enter Course13 Code");
		CharSequence codeK = inp.next();
		System.out.println(codeK + " Score");
		int code14 = inp.nextInt();
		System.out.println(codeK + " unit");
		int unit12 = inp.nextInt();
		double gp12 = 0;
		if ((code14 < 0) && (code14 > 100)) {
			System.out.println("Input Error");
		}
		if ((code14 >= 80) && (code14 <= 100)) {
			gp12 = unit12 * A;
			System.out.println(codeK + " = A");
			System.out.println(codeK + "= " + gp12);
		}
		if ((code14 >= 70) && (code14 <= 79)) {
			gp12 = unit12 * AB;
			System.out.println(codeK + " = AB");
			System.out.println(codeK + " = " + gp12);
		}
		if ((code14 >= 60) && (code14 <= 69)) {
			gp12 = unit12 * B;
			System.out.println(codeK + " = B");
			System.out.println(codeK + " = " + gp12);
		}
		if ((code14 >= 50) && (code14 <= 59)) {
			gp12 = unit12 * C;
			System.out.println(codeK + " = C");
			System.out.println(codeK + " = " + gp12);
		}
		if ((code14 >= 40) && (code14 <= 49)) {
			gp12 = unit12 * D;
			System.out.println(codeK + " = D");
			System.out.println(codeK + " = " + gp12);
		}
		if ((code14 >= 0) && (code14 <= 39)) {
			gp12 = unit12 * E;
			System.out.println(codeK + " = E");
			System.out.println(codeK + " = " + gp12);
		}
		System.out.println("Enter Course14 Code");
		CharSequence codeL = inp.next();
		System.out.println(codeL + " Score");
		int code15 = inp.nextInt();
		System.out.println(codeL + " unit");
		int unit13 = inp.nextInt();
		double gp13 = 0;
		if ((code15 < 0) && (code15 > 100)) {
			System.out.println("Input Error");
		}
		if ((code15 >= 80) && (code15 <= 100)) {
			gp13 = unit13 * A;
			System.out.println(codeL + " = A");
			System.out.println(codeL + "= " + gp13);
		}
		if ((code15 >= 70) && (code15 <= 79)) {
			gp13 = unit13 * AB;
			System.out.println(codeL + " = AB");
			System.out.println(codeL + " = " + gp13);
		}
		if ((code15 >= 60) && (code15 <= 69)) {
			gp13 = unit13 * B;
			System.out.println(codeL + " = B");
			System.out.println(codeL + " = " + gp13);
		}
		if ((code15 >= 50) && (code15 <= 59)) {
			gp13 = unit13 * C;
			System.out.println(codeL + " = C");
			System.out.println(codeL + " = " + gp13);
		}
		if ((code15 >= 40) && (code15 <= 49)) {
			gp13 = unit13 * D;
			System.out.println(codeL + " = D");
			System.out.println(codeL + " = " + gp13);
		}
		if ((code15 >= 0) && (code15 <= 39)) {
			gp13 = unit13 * E;
			System.out.println(codeL + " = E");
			System.out.println(codeL + " = " + gp13);
		}
		System.out.println("Enter Course15 Code");
		CharSequence codeM = inp.next();
		System.out.println(codeM + " Score");
		int code16 = inp.nextInt();
		System.out.println(codeM + " unit");
		int unit14 = inp.nextInt();
		double gp14 = 0;
		if ((code16 < 0) && (code16 > 100)) {
			System.out.println("Input Error");
		}
		if ((code16 >= 80) && (code16 <= 100)) {
			gp14 = unit14 * A;
			System.out.println(codeM + " = A");
			System.out.println(codeM + "= " + gp14);
		}
		if ((code16 >= 70) && (code16 <= 79)) {
			gp14 = unit14 * AB;
			System.out.println(codeM + " = AB");
			System.out.println(codeM + " = " + gp14);
		}
		if ((code16 >= 60) && (code16 <= 69)) {
			gp14 = unit14 * B;
			System.out.println(codeM + " = B");
			System.out.println(codeM + " = " + gp14);
		}
		if ((code16 >= 50) && (code16 <= 59)) {
			gp14 = unit14 * C;
			System.out.println(codeM + " = C");
			System.out.println(codeM + " = " + gp14);
		}
		if ((code16 >= 40) && (code16 <= 49)) {
			gp14 = unit14 * D;
			System.out.println(codeM + " = D");
			System.out.println(codeM + " = " + gp14);
		}
		if ((code16 >= 0) && (code16 <= 39)) {
			gp14 = unit14 * E;
			System.out.println(codeM + " = E");
			System.out.println(codeM + " = " + gp14);
		}
		System.out.println("Enter Course16 Code");
		CharSequence codeN = inp.next();
		System.out.println(codeN + " Score");
		int code17 = inp.nextInt();
		System.out.println(codeN + " unit");
		int unit15 = inp.nextInt();
		double gp15 = 0;
		if ((code17 < 0) && (code17 > 100)) {
			System.out.println("Input Error");
		}
		if ((code17 >= 80) && (code17 <= 100)) {
			gp15 = unit15 * A;
			System.out.println(codeN + " = A");
			System.out.println(codeN + "= " + gp15);
		}
		if ((code17 >= 70) && (code17 <= 79)) {
			gp15 = unit15 * AB;
			System.out.println(codeN + " = AB");
			System.out.println(codeN + " = " + gp15);
		}
		if ((code17 >= 60) && (code17 <= 69)) {
			gp15 = unit15 * B;
			System.out.println(codeN + " = B");
			System.out.println(codeN + " = " + gp15);
		}
		if ((code17 >= 50) && (code17 <= 59)) {
			gp15 = unit15 * C;
			System.out.println(codeN + " = C");
			System.out.println(codeN + " = " + gp15);
		}
		if ((code17 >= 40) && (code17 <= 49)) {
			gp15 = unit15 * D;
			System.out.println(codeN + " = D");
			System.out.println(codeN + " = " + gp15);
		}
		if ((code17 >= 0) && (code17 <= 39)) {
			gp15 = unit15 * E;
			System.out.println(codeN + " = E");
			System.out.println(codeN + " = " + gp15);
		}
		System.out.println("Enter Course17 Code");
		CharSequence codeO = inp.next();
		System.out.println(codeO + " Score");
		int code18 = inp.nextInt();
		System.out.println(codeO + " unit");
		int unit16 = inp.nextInt();
		double gp16 = 0;
		if ((code18 < 0) && (code18 > 100)) {
			System.out.println("Input Error");
		}
		if ((code18 >= 80) && (code18 <= 100)) {
			gp16 = unit16 * A;
			System.out.println(codeO + " = A");
			System.out.println(codeO + "= " + gp16);
		}
		if ((code18 >= 70) && (code18 <= 79)) {
			gp16 = unit16 * AB;
			System.out.println(codeO + " = AB");
			System.out.println(codeO + " = " + gp16);
		}
		if ((code18 >= 60) && (code18 <= 69)) {
			gp16 = unit16 * B;
			System.out.println(codeO + " = B");
			System.out.println(codeO + " = " + gp16);
		}
		if ((code18 >= 50) && (code18 <= 59)) {
			gp16 = unit16 * C;
			System.out.println(codeO + " = C");
			System.out.println(codeO + " = " + gp16);
		}
		if ((code18 >= 40) && (code18 <= 49)) {
			gp16 = unit16 * D;
			System.out.println(codeO + " = D");
			System.out.println(codeO + " = " + gp16);
		}
		if ((code18 >= 0) && (code18 <= 39)) {
			gp16 = unit16 * E;
			System.out.println(codeO + " = E");
			System.out.println(codeO + " = " + gp16);
		}
		System.out.println("Enter Course18 Code");
		CharSequence codeP = inp.next();
		System.out.println(codeP + " Score");
		int code19 = inp.nextInt();
		System.out.println(codeP + " unit");
		int unit17 = inp.nextInt();
		double gp17 = 0;
		if ((code19 < 0) && (code19 > 100)) {
			System.out.println("Input Error");
		}
		if ((code19 >= 80) && (code19 <= 100)) {
			gp17 = unit17 * A;
			System.out.println(codeP + " = A");
			System.out.println(codeP + "= " + gp17);
		}
		if ((code19 >= 70) && (code19 <= 79)) {
			gp17 = unit17 * AB;
			System.out.println(codeP + " = AB");
			System.out.println(codeP + " = " + gp17);
		}
		if ((code19 >= 60) && (code19 <= 69)) {
			gp17 = unit17 * B;
			System.out.println(codeP + " = B");
			System.out.println(codeP + " = " + gp17);
		}
		if ((code19 >= 50) && (code19 <= 59)) {
			gp17 = unit17 * C;
			System.out.println(codeP + " = C");
			System.out.println(codeP + " = " + gp17);
		}
		if ((code19 >= 40) && (code19 <= 49)) {
			gp17 = unit17 * D;
			System.out.println(codeP + " = D");
			System.out.println(codeP + " = " + gp17);
		}
		if ((code19 >= 0) && (code19 <= 39)) {
			gp17 = unit17 * E;
			System.out.println(codeP + " = E");
			System.out.println(codeP + " = " + gp17);
		}
		System.out.println("Enter Course19 Code");
		CharSequence codeQ = inp.next();
		System.out.println(codeQ + " Score");
		int code20 = inp.nextInt();
		System.out.println(codeQ + " unit");
		int unit18 = inp.nextInt();
		double gp18 = 0;
		if ((code20 < 0) && (code20 > 100)) {
			System.out.println("Input Error");
		}
		if ((code20 >= 80) && (code20 <= 100)) {
			gp18 = unit18 * A;
			System.out.println(codeQ + " = A");
			System.out.println(codeQ + "= " + gp18);
		}
		if ((code20 >= 70) && (code20 <= 79)) {
			gp18 = unit18 * AB;
			System.out.println(codeQ + " = AB");
			System.out.println(codeQ + " = " + gp18);
		}
		if ((code20 >= 60) && (code20 <= 69)) {
			gp18 = unit18 * B;
			System.out.println(codeQ + " = B");
			System.out.println(codeQ + " = " + gp18);
		}
		if ((code20 >= 50) && (code20 <= 59)) {
			gp18 = unit18 * C;
			System.out.println(codeQ + " = C");
			System.out.println(codeQ + " = " + gp18);
		}
		if ((code20 >= 40) && (code20 <= 49)) {
			gp18 = unit18 * D;
			System.out.println(codeQ + " = D");
			System.out.println(codeQ + " = " + gp18);
		}
		if ((code20 >= 0) && (code20 <= 39)) {
			gp18 = unit18 * E;
			System.out.println(codeQ + " = E");
			System.out.println(codeQ + " = " + gp18);
		}
		System.out.println("Enter Course20 Code");
		CharSequence codeR = inp.next();
		System.out.println(codeR + " Score");
		int code21 = inp.nextInt();
		System.out.println(codeR + " unit");
		int unit19 = inp.nextInt();
		double gp19 = 0;
		if ((code21 < 0) && (code21 > 100)) {
			System.out.println("Input Error");
		}
		if ((code21 >= 80) && (code21 <= 100)) {
			gp19 = unit19 * A;
			System.out.println(codeR + " = A");
			System.out.println(codeR + "= " + gp19);
		}
		if ((code21 >= 70) && (code21 <= 79)) {
			gp19 = unit19 * AB;
			System.out.println(codeR + " = AB");
			System.out.println(codeR + " = " + gp19);
		}
		if ((code21 >= 60) && (code21 <= 69)) {
			gp19 = unit19 * B;
			System.out.println(codeR + " = B");
			System.out.println(codeR + " = " + gp19);
		}
		if ((code21 >= 50) && (code21 <= 59)) {
			gp19 = unit19 * C;
			System.out.println(codeR + " = C");
			System.out.println(codeR + " = " + gp19);
		}
		if ((code21 >= 40) && (code21 <= 49)) {
			gp19 = unit19 * D;
			System.out.println(codeR + " = D");
			System.out.println(codeR + " = " + gp19);
		}
		if ((code21 >= 0) && (code21 <= 39)) {
			gp19 = unit19 * E;
			System.out.println(codeR + " = E");
			System.out.println(codeR + " = " + gp19);
		}
		System.out.println("Enter Course21 Code");
		CharSequence codeS = inp.next();
		System.out.println(codeS + " Score");
		int code22 = inp.nextInt();
		System.out.println(codeS + " unit");
		int unit20 = inp.nextInt();
		double gp20 = 0;
		if ((code22 < 0) && (code22 > 100)) {
			System.out.println("Input Error");
		}
		if ((code22 >= 80) && (code22 <= 100)) {
			gp20 = unit20 * A;
			System.out.println(codeS + " = A");
			System.out.println(codeS + "= " + gp20);
		}
		if ((code22 >= 70) && (code22 <= 79)) {
			gp20 = unit20 * AB;
			System.out.println(codeS + " = AB");
			System.out.println(codeS + " = " + gp20);
		}
		if ((code22 >= 60) && (code22 <= 69)) {
			gp20 = unit20 * B;
			System.out.println(codeS + " = B");
			System.out.println(codeS + " = " + gp20);
		}
		if ((code22 >= 50) && (code22 <= 59)) {
			gp20 = unit20 * C;
			System.out.println(codeS + " = C");
			System.out.println(codeS + " = " + gp20);
		}
		if ((code22 >= 40) && (code22 <= 49)) {
			gp20 = unit20 * D;
			System.out.println(codeS + " = D");
			System.out.println(codeS + " = " + gp20);
		}
		if ((code22 >= 0) && (code22 <= 39)) {
			gp20 = unit20 * E;
			System.out.println(codeS + " = E");
			System.out.println(codeS + " = " + gp20);
		}
		System.out.println("Enter Course22 Code");
		CharSequence codeT = inp.next();
		System.out.println(codeT + " Score");
		int code23 = inp.nextInt();
		System.out.println(codeT + " unit");
		int unit21 = inp.nextInt();
		double gp21 = 0;
		if ((code23 < 0) && (code23 > 100)) {
			System.out.println("Input Error");
		}
		if ((code23 >= 80) && (code23 <= 100)) {
			gp21 = unit21 * A;
			System.out.println(codeT + " = A");
			System.out.println(codeT + "= " + gp21);
		}
		if ((code23 >= 70) && (code23 <= 79)) {
			gp21 = unit21 * AB;
			System.out.println(codeT + " = AB");
			System.out.println(codeT + " = " + gp21);
		}
		if ((code23 >= 60) && (code23 <= 69)) {
			gp21 = unit21 * B;
			System.out.println(codeT + " = B");
			System.out.println(codeT + " = " + gp21);
		}
		if ((code23 >= 50) && (code23 <= 59)) {
			gp21 = unit21 * C;
			System.out.println(codeT + " = C");
			System.out.println(codeT + " = " + gp21);
		}
		if ((code23 >= 40) && (code23 <= 49)) {
			gp21 = unit21 * D;
			System.out.println(codeT + " = D");
			System.out.println(codeT + " = " + gp21);
		}
		if ((code23 >= 0) && (code23 <= 39)) {
			gp21 = unit21 * E;
			System.out.println(codeT + " = E");
			System.out.println(codeT + " = " + gp21);
		}
		System.out.println("Enter Course23 Code");
		CharSequence codeU = inp.next();
		System.out.println(codeU + " Score");
		int code24 = inp.nextInt();
		System.out.println(codeU + " unit");
		int unit22 = inp.nextInt();
		double gp22 = 0;
		if ((code24 < 0) && (code24 > 100)) {
			System.out.println("Input Error");
		}
		if ((code24 >= 80) && (code24 <= 100)) {
			gp22 = unit22 * A;
			System.out.println(codeU + " = A");
			System.out.println(codeU + "= " + gp22);
		}
		if ((code24 >= 70) && (code24 <= 79)) {
			gp22 = unit22 * AB;
			System.out.println(codeU + " = AB");
			System.out.println(codeU + " = " + gp22);
		}
		if ((code24 >= 60) && (code24 <= 69)) {
			gp22 = unit22 * B;
			System.out.println(codeU + " = B");
			System.out.println(codeU + " = " + gp22);
		}
		if ((code24 >= 50) && (code24 <= 59)) {
			gp22 = unit22 * C;
			System.out.println(codeU + " = C");
			System.out.println(codeU + " = " + gp22);
		}
		if ((code24 >= 40) && (code24 <= 49)) {
			gp22 = unit22 * D;
			System.out.println(codeU + " = D");
			System.out.println(codeU + " = " + gp22);
		}
		if ((code24 >= 0) && (code24 <= 39)) {
			gp22 = unit22 * E;
			System.out.println(codeU + " = E");
			System.out.println(codeU + " = " + gp22);
		}
		System.out.println("Enter Course24 Code");
		CharSequence codeV = inp.next();
		System.out.println(codeV + " Score");
		int code25 = inp.nextInt();
		System.out.println(codeV + " unit");
		int unit23 = inp.nextInt();
		double gp23 = 0;
		if ((code25 < 0) && (code25 > 100)) {
			System.out.println("Input Error");
		}
		if ((code25 >= 80) && (code25 <= 100)) {
			gp23 = unit23 * A;
			System.out.println(codeV + " = A");
			System.out.println(codeV + "= " + gp23);
		}
		if ((code25 >= 70) && (code25 <= 79)) {
			gp23 = unit23 * AB;
			System.out.println(codeV + " = AB");
			System.out.println(codeV + " = " + gp23);
		}
		if ((code25 >= 60) && (code25 <= 69)) {
			gp23 = unit23 * B;
			System.out.println(codeV + " = B");
			System.out.println(codeV + " = " + gp23);
		}
		if ((code25 >= 50) && (code25 <= 59)) {
			gp23 = unit23 * C;
			System.out.println(codeV + " = C");
			System.out.println(codeV + " = " + gp23);
		}
		if ((code25 >= 40) && (code25 <= 49)) {
			gp23 = unit23 * D;
			System.out.println(codeV + " = D");
			System.out.println(codeV + " = " + gp23);
		}
		if ((code25 >= 0) && (code25 <= 39)) {
			gp23 = unit23 * E;
			System.out.println(codeV + " = E");
			System.out.println(codeV + " = " + gp23);
		}
		System.out.println("Enter Course25 Code");
		CharSequence codeX = inp.next();
		System.out.println(codeX + " Score");
		int code26 = inp.nextInt();
		System.out.println(codeX + " unit");
		int unit24 = inp.nextInt();
		double gp24 = 0;
		if ((code26 < 0) && (code26 > 100)) {
			System.out.println("Input Error");
		}
		if ((code26 >= 80) && (code26 <= 100)) {
			gp24 = unit24 * A;
			System.out.println(codeX + " = A");
			System.out.println(codeX + "= " + gp24);
		}
		if ((code26 >= 70) && (code26 <= 79)) {
			gp24 = unit24 * AB;
			System.out.println(codeX + " = AB");
			System.out.println(codeX + " = " + gp24);
		}
		if ((code26 >= 60) && (code26 <= 69)) {
			gp24 = unit24 * B;
			System.out.println(codeX + " = B");
			System.out.println(codeX + " = " + gp24);
		}
		if ((code26 >= 50) && (code26 <= 59)) {
			gp24 = unit24 * C;
			System.out.println(codeX + " = C");
			System.out.println(codeX + " = " + gp24);
		}
		if ((code26 >= 40) && (code26 <= 49)) {
			gp24 = unit24 * D;
			System.out.println(codeX + " = D");
			System.out.println(codeX + " = " + gp24);
		}
		if ((code26 >= 0) && (code26 <= 39)) {
			gp24 = unit24 * E;
			System.out.println(codeX + " = E");
			System.out.println(codeX + " = " + gp24);
		}
		System.out.println("Enter Course26 Code");
		CharSequence codeW = inp.next();
		System.out.println(codeW + " Score");
		int code27 = inp.nextInt();
		System.out.println(codeW + " unit");
		int unit25 = inp.nextInt();
		double gp25 = 0;
		if ((code27 < 0) && (code27 > 100)) {
			System.out.println("Input Error");
		}
		if ((code27 >= 80) && (code27 <= 100)) {
			gp25 = unit25 * A;
			System.out.println(codeW + " = A");
			System.out.println(codeW + "= " + gp25);
		}
		if ((code27 >= 70) && (code27 <= 79)) {
			gp25 = unit25 * AB;
			System.out.println(codeW + " = AB");
			System.out.println(codeW + " = " + gp25);
		}
		if ((code27 >= 60) && (code27 <= 69)) {
			gp25 = unit25 * B;
			System.out.println(codeW + " = B");
			System.out.println(codeW + " = " + gp25);
		}
		if ((code27 >= 50) && (code27 <= 59)) {
			gp25 = unit25 * C;
			System.out.println(codeW + " = C");
			System.out.println(codeW + " = " + gp25);
		}
		if ((code27 >= 40) && (code27 <= 49)) {
			gp25 = unit25 * D;
			System.out.println(codeW + " = D");
			System.out.println(codeW + " = " + gp25);
		}
		if ((code27 >= 0) && (code27 <= 39)) {
			gp25 = unit25 * E;
			System.out.println(codeW + " = E");
			System.out.println(codeW + " = " + gp25);
		}
		System.out.println("Enter Course27 Code");
		CharSequence codeY = inp.next();
		System.out.println(codeY + " Score");
		int code28 = inp.nextInt();
		System.out.println(codeY + " unit");
		int unit26 = inp.nextInt();
		double gp26 = 0;
		if ((code28 < 0) && (code28 > 100)) {
			System.out.println("Input Error");
		}
		if ((code28 >= 80) && (code28 <= 100)) {
			gp26 = unit26 * A;
			System.out.println(codeY + " = A");
			System.out.println(codeY + "= " + gp26);
		}
		if ((code28 >= 70) && (code28 <= 79)) {
			gp26 = unit26 * AB;
			System.out.println(codeY + " = AB");
			System.out.println(codeY + " = " + gp26);
		}
		if ((code28 >= 60) && (code28 <= 69)) {
			gp26 = unit26 * B;
			System.out.println(codeY + " = B");
			System.out.println(codeY + " = " + gp26);
		}
		if ((code28 >= 50) && (code28 <= 59)) {
			gp26 = unit26 * C;
			System.out.println(codeY + " = C");
			System.out.println(codeY + " = " + gp26);
		}
		if ((code28 >= 40) && (code28 <= 49)) {
			gp26 = unit26 * D;
			System.out.println(codeY + " = D");
			System.out.println(codeY + " = " + gp26);
		}
		if ((code28 >= 0) && (code28 <= 39)) {
			gp26 = unit26 * E;
			System.out.println(codeY + " = E");
			System.out.println(codeY + " = " + gp26);
		}
		System.out.println("Enter Course28 Code");
		CharSequence codeZ = inp.next();
		System.out.println(codeZ + " Score");
		int code29 = inp.nextInt();
		System.out.println(codeZ + " unit");
		int unit27 = inp.nextInt();
		double gp27 = 0;
		if ((code29 < 0) && (code29 > 100)) {
			System.out.println("Input Error");
		}
		if ((code29 >= 80) && (code29 <= 100)) {
			gp27 = unit27 * A;
			System.out.println(codeZ + " = A");
			System.out.println(codeZ + "= " + gp27);
		}
		if ((code29 >= 70) && (code29 <= 79)) {
			gp27 = unit27 * AB;
			System.out.println(codeZ + " = AB");
			System.out.println(codeZ + " = " + gp27);
		}
		if ((code29 >= 60) && (code29 <= 69)) {
			gp27 = unit27 * B;
			System.out.println(codeZ + " = B");
			System.out.println(codeZ + " = " + gp27);
		}
		if ((code29 >= 50) && (code29 <= 59)) {
			gp27 = unit27 * C;
			System.out.println(codeZ + " = C");
			System.out.println(codeZ + " = " + gp27);
		}
		if ((code29 >= 40) && (code29 <= 49)) {
			gp27 = unit27 * D;
			System.out.println(codeZ + " = D");
			System.out.println(codeZ + " = " + gp27);
		}
		if ((code29 >= 0) && (code29 <= 39)) {
			gp27 = unit27 * E;
			System.out.println(codeZ + " = E");
			System.out.println(codeZ + " = " + gp27);
		}
		System.out.println("Enter Course29 Code");
		CharSequence codeA1 = inp.next();
		System.out.println(codeA1 + " Score");
		int code30 = inp.nextInt();
		System.out.println(codeA1 + " unit");
		int unit28 = inp.nextInt();
		double gp28 = 0;
		if ((code30 < 0) && (code30 > 100)) {
			System.out.println("Input Error");
		}
		if ((code30 >= 80) && (code30 <= 100)) {
			gp28 = unit28 * A;
			System.out.println(codeA1 + " = A");
			System.out.println(codeA1 + "= " + gp28);
		}
		if ((code30 >= 70) && (code30 <= 79)) {
			gp28 = unit28 * AB;
			System.out.println(codeA1 + " = AB");
			System.out.println(codeA1 + " = " + gp28);
		}
		if ((code30 >= 60) && (code30 <= 69)) {
			gp28 = unit28 * B;
			System.out.println(codeA1 + " = B");
			System.out.println(codeA1 + " = " + gp28);
		}
		if ((code30 >= 50) && (code30 <= 59)) {
			gp28 = unit28 * C;
			System.out.println(codeA1 + " = C");
			System.out.println(codeA1 + " = " + gp28);
		}
		if ((code30 >= 40) && (code30 <= 49)) {
			gp28 = unit28 * D;
			System.out.println(codeA1 + " = D");
			System.out.println(codeA1 + " = " + gp28);
		}
		if ((code30 >= 0) && (code30 <= 39)) {
			gp28 = unit28 * E;
			System.out.println(codeA1 + " = E");
			System.out.println(codeA1 + " = " + gp28);
		}
		System.out.println("Enter Course30 Code");
		CharSequence codeA2 = inp.next();
		System.out.println(codeA2 + " Score");
		int code31 = inp.nextInt();
		System.out.println(codeA2 + " unit");
		int unit29 = inp.nextInt();
		double gp29 = 0;
		if ((code31 < 0) && (code31 > 100)) {
			System.out.println("Input Error");
		}
		if ((code31 >= 80) && (code31 <= 100)) {
			gp29 = unit29 * A;
			System.out.println(codeA2 + " = A");
			System.out.println(codeA2 + "= " + gp29);
		}
		if ((code31 >= 70) && (code31 <= 79)) {
			gp29 = unit29 * AB;
			System.out.println(codeA2 + " = AB");
			System.out.println(codeA2 + " = " + gp29);
		}
		if ((code31 >= 60) && (code31 <= 69)) {
			gp29 = unit29 * B;
			System.out.println(codeA2 + " = B");
			System.out.println(codeA2 + " = " + gp29);
		}
		if ((code31 >= 50) && (code31 <= 59)) {
			gp29 = unit29 * C;
			System.out.println(codeA2 + " = C");
			System.out.println(codeA2 + " = " + gp29);
		}
		if ((code31 >= 40) && (code31 <= 49)) {
			gp29 = unit29 * D;
			System.out.println(codeA2 + " = D");
			System.out.println(codeA2 + " = " + gp29);
		}
		if ((code31 >= 0) && (code31 <= 39)) {
			gp29 = unit29 * E;
			System.out.println(codeA2 + " = E");
			System.out.println(codeA2 + " = " + gp29);
		}
		double Sum = unit + unit1 + unit2 + unit3 + unit4 + unit5 + unit6
				+ unit7 + unit8 + unit9 + unit10 + unit11 + unit12 + unit13
				+ unit14 + unit15 + unit16 + unit17 + unit18 + unit19 + unit20
				+ unit21 + unit22 + unit23 + unit24 + unit25 + unit26 + unit27
				+ unit28 + unit29;
		double SumGp = gp + gp1 + gp2 + gp3 + gp4 + gp5 + gp6 + gp7 + gp8 + gp9
				+ gp10 + gp11 + gp12 + gp13 + gp14 + gp15 + gp16 + gp17 + gp18
				+ gp19 + gp20 + gp21 + gp22 + gp23 + gp24 + gp25 + gp26 + gp27
				+ gp28 + gp29;
		double TotalGp = SumGp / Sum;
		System.out.println("Your G.P is " + TotalGp);
	}
}