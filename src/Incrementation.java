import java.util.Scanner;

class Incrementation {
	public static void main(String args[]) {
		/*
		//Post incrementation  
		int a = 10;
		int b;
		b = a++;
		System.out.println(a);
		System.out.println(b);
		
		//Pre incrementation  
		int c = 10;
		int d;
		d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int e = 7;
		System.out.println(e++ + e--);
		
		
		int f = 7;
		System.out.println(--f + --f + f++);
		System.out.println(f);
		
		int g = 7;
		System.out.println(++g + --g - ++g + --g - ++g + ++g - ++g + g++);
		System.out.println(g);
		
		int h = 7;
		System.out.println(((--h + --h) + (h-- + --h) * (++h + h++) - (--h + --h)));
		System.out.println(h);

		char c= 'a';
		++c;
		System.out.println(c);
		
		double d = 12.4;
		d++;
		System.out.println(d);
		
		
		boolean e = false;
		e++;
		System.out.println(e);
		
		
		byte a = 1;
		byte b = 2;
		short c = 3;
		int d = 4;
		int e = 5;
		long f = 6;
		
		a = a + b;
		System.out.println(a);
		
		
		int a = 100;
		byte b;
		b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		
		
		String a = "";
		for(int i=0; i < 4; i++) {
			while(a.length() != 5) {
				a += "*";
			}
			System.out.println(a);
		}
		 
		
		String c = "";
		for(int i=0; i < 5; i++) {
			c += "*";
			System.out.println(c);
		}
		
		System.out.println();
		
		int a = 0;
		String b = "";
		for(int i=0; i < 5; i++) {
			a+=1;
			b+=a;
			System.out.println(b);
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=0; i <5; i++) {
			for(int j=0; j <= 5; j++) {
				System.out.print(" ");
			}
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		//tree
		for(int i=0; i<5; i++) {
			for(int j=5; j > i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k <= (2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		//upside down tree
		for(int i=0; i<5; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k=8; k >= (2*i); k--) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		//A
		for(int i=0; i<10; i++) {
			for(int j =0; j<5; j++) {
				if(i==0||i==5||j==0||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		
		//B
		for(int i=0; i<11; i++) {
			for(int j =0; j<10; j++) {
				if(i==0 && j ==9 || i==5 && j ==9 || i==10 && j==9) {
					System.out.print(" ");
				}
				else if(i==0||i==5||i==10||j==0||j==9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		//C
		for(int i=0; i<11; i++) {
			for(int j =0; j<10; j++) {
				if(i==0||i==10||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		//D
		for(int i=0; i<11; i++) {
			for(int j =0; j<10; j++) {
				if(i==0 && j ==9 ||  i==10 && j==9) {
					System.out.print(" ");
				}
				else if(i==0||i==10||j==0||j==9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		//E
		for(int i=0; i<11; i++) {
			for(int j =0; j<10; j++) {
				if(i==0||i==5||i==10||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		//F
		for(int i=0; i<11; i++) {
			for(int j =0; j<10; j++) {
				if(i==0||i==5||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		
		
		
		//Arrays
		//1 dimensional array
		int marks[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		for(int i =0; i<marks.length; i++) {
			marks[i] = scan.nextInt();
			
		}
		System.out.println();
		System.out.print("Marks are: ");
		for(int i =0; i<marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		
		
		//2 dimensional array
		int classMark[][] = new int[2][5];
		Scanner s1 = new Scanner(System.in);
		for(int i=0; i<classMark.length; i++) {
			for(int j=0; j<classMark[i].length; j++) {
				System.out.print("Enter the marks for Class "+ i +" Student " + j + " : ");
				classMark[i][j] = s1.nextInt();
			}
		}
				
		for(int i=0; i<classMark.length; i++) {
			System.out.print("Marks for Class "+ i +" : ");
			for(int j=0; j<classMark[i].length; j++) {
				System.out.print(classMark[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//3 dimensional array
		int school[][][] = new int[2][2][3];
		Scanner s1 = new Scanner(System.in);
		for(int i=0; i<school.length;i++) {
			for(int j=0; j<school[i].length; j++) {
				for(int k=0; k<school[i][j].length; k++) {
					System.out.print("Enter the marks for School "+ i +" Class " + j + " Student " + k + " : ");
					school[i][j][k] = s1.nextInt();
				}
			}
		}
		
		for(int i=0; i<school.length;i++) {
			for(int j=0; j<school[i].length; j++) {
				System.out.print("School "+ i +" Class " + j + " : ");
				for(int k=0; k<school[i][j].length; k++) {
					System.out.print(school[i][j][k] + " ");
					
				}
				System.out.println();
			}
		}
		
		
		
		//Flexiable Arrays
		System.out.print("How many class are there : ");
		Scanner scan = new Scanner(System.in);
		
		int classStudent[][] = new int[scan.nextInt()][];
		for(int i=0; i<classStudent.length;i++) {
			System.out.print("How many amount of student for class " + i +" : ");
			classStudent[i] = new int[scan.nextInt()];
			
			for(int j=0; j<classStudent[i].length; j++) {
				System.out.print("Enter the marks for Class "+ i +" Student " + j + " : ");
				classStudent[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<classStudent.length; i++) {
			System.out.print("Marks for Class "+ i +" : ");
			for(int j=0; j<classStudent[i].length; j++) {
				System.out.print(classStudent[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.print("How many schools are there : ");
		Scanner scan = new Scanner(System.in);
		
		int schoolStudent[][][] = new int[scan.nextInt()][][];
		for(int i=0; i<schoolStudent.length;i++) {
			System.out.print("How many class for school " + i +" : ");
			schoolStudent[i] = new int[scan.nextInt()][];
			for(int j=0; j<schoolStudent[i].length; j++) {
				System.out.print("How many student are there in Class "+ i +" Student " + j + " : ");
				schoolStudent[i][j] = new int[scan.nextInt()];
				for(int k=0; k<schoolStudent[i][j].length; k++) {
					System.out.print("Enter the marks for Student "+ k +" in Class " + j + " at School " + i +" : ");
					schoolStudent[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i=0; i<schoolStudent.length; i++) {
			for(int j=0; j<schoolStudent[i].length; j++) {
				System.out.print("Marks for Class "+ j +" at School " + i + " : ");
				for(int k=0; k<schoolStudent[i][j].length; k++) {
					System.out.print(schoolStudent[i][j][k] + " ");
				}
			}
			System.out.println();
		}
		*/
		//XOR
		int[] a1 = {1,2,1};
		int ans = 0;
		for(int i=0; i< a1.length; i++) {
			ans = ans ^ a1[i];
		}
		System.out.print(ans);
	}
}
