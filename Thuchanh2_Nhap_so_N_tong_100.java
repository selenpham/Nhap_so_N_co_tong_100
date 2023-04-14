//Bài 2. Thực hành với vòng lặp while và do-while
//Viết chương trình nhập vào số nguyên N từ bàn phím, việc này sẽ tiếp tục cho đến khi tổng 
//các giá trị nhập vào >= 100.
//Thực hiện in ra giá trị N sau cùng thỏa mãn điều kiện:
//- Nếu N là một số lẻ :
//    In ra màn hình “Dãy số lẻ giảm dần : ”  và kèm theo dãy số lẻ giảm dần từ N về 1
//- Ngược lại, nếu N là một số chẵn thì In ra màn hình “Dãy số chẵn giảm dần : ”  và kèm theo 
//dãy số chẵn giảm dần từ N về 2

package LAB2;

import java.util.Scanner;

public class Thuchanh2_Nhap_so_N_tong_100 {

	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tong = 0;
		do {
			System.out.print("Nhap vao so nguyen N: ");
			int N = scanner.nextInt();
			tong = tong + N;
		}while (tong < 100);
		
		System.out.println("Tong cac so nguyen vua nhap: " + tong);
		
		if (tong %2 == 0) {
			int i = 0;
			System.out.print("Day so chan giam dan la: \n");
			while(i<tong) {		
				System.out.println(tong);
				tong -=2;
			}
		}
		
		else {
			int i = 0;
			System.out.print("Day so le giam dan la: \n");
			while(i<tong) {		
				System.out.println(tong);
				tong -=1;
		
			}
		}
	}
}
