import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int end = Integer.parseInt(br.readLine());
        int i,j,n;
        
        for(n=1;n<=end;n++) {
            for (i=end-n;i>0;i--) {
            	bw.write(" ");
            }
            for (j=1;j<=n;j++) {
            	bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
