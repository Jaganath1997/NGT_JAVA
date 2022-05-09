package basics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] marks = new int[5];
        //
        int[] mark = new int[]{100,200,300,400,500};
        for(int i=0;i<mark.length;i++) {
        	System.out.println(mark[i]);
        }
        //write/update an array
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;
        //read single element
        System.out.println(marks[3]);
        System.out.println("array elements are: ");
        //read all elements
        for(int i=0;i<marks.length;i++) {
        	System.out.println(marks[i]);
        }
        System.out.println("using enhanced for loop: ");
        for(int s:mark) {
        	System.out.println(s);
        }
	}

}
