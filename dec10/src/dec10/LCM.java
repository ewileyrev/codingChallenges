package dec10;

import java.util.Arrays;

public class LCM {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	System.out.println(lcm(arr));
}

public static int lcm(int[] arr) {
	Arrays.sort(arr);
	boolean status = true;

	int temp=arr[arr.length-1];
	while(status) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(temp%arr[arr.length-i-1] ==0) {
			}else {
				temp=temp+arr[arr.length-1];
				count++;
			}
		}
		
		if(count ==0) {
			status=false;
		}
	}
	
	return temp;
	
}
}
