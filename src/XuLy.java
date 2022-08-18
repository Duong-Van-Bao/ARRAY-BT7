import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;
	
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = nhapN(scan);
       int a[] = taoMang(n);
       xuatMang(a);
       a = themPhanTu(a,scan);
       xuatMang(a);
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập a > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];  
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static int[] themPhanTu(int a[], Scanner scan) {
		int k;
		do {
			System.out.println("Vui lòng nhập K từ 0 đến " + a.length);
			k = Integer.parseInt(scan.nextLine());
		} while(k < 0 || k >= a.length);
		
		System.out.println("Vui lòng nhập giá trị phần tử cần thêm: x = ");
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int[a.length + 1]; //tạo mảng tạm với kích thước tăng thêm 1
		for(int i = 0; i < b.length; i++) {
			if(i < k) {
				b[i] = a[i];
			} else if(i == k) {
				b[i] = x;
			} else if(i > k) {
				b[i] = a[i-1];
			}
		}
		a = b; //gán mảng tạm về cho mảng góc 
		return a;
	}
}
