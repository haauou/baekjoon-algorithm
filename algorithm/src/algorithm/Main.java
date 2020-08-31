package algorithm;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int t = Integer.parseInt(br.readLine());

	    for (int i=0; i<t; i++) {
	    	int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        br.close();
	        System.out.println(a+b);
	       }
	}

}
