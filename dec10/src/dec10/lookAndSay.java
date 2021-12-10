package dec10;

public class lookAndSay {
public static void main(String[] args) {
	System.out.println(lookandsay("120311"));
}

public static String lookandsay(String s){
	if(s.length()%2 !=0) {
		return "-1";
	}
	String r="";
	for(int i=0;i<s.length();i=i+2) {
		char j=s.charAt(i);
		int a = Character.getNumericValue(j);
		for(int z=0;z<a;z++) {
			char p=s.charAt(i+1);
			int o = Character.getNumericValue(p);
			if(a==0) {
				r=r+"0";
				continue;
			}
			r=r+p;
		}
		
	}
	
	return r;
	
}
}
