import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	private List<Product> list ;
	private Scanner sc;
	private File file;
	
	public Input(List<Product> list) {
		this.list = list;
		this.file = new File("C://temp//pro.dat");
		try {
			this.sc = new Scanner(this.file,"utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("못찾음");
		}
		}
	public void fileInput() {
		String line = null;
		StringTokenizer st = null;
		while (this.sc.hasNextLine()) {
			line = this.sc.nextLine();
			st = new StringTokenizer(line);
			String[] array = new String[st.countTokens()];
			for(int i=0; i<array.length;i++) {
				array[i] = st.nextToken();
			}
			Product student = new Product(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]));
			
		}
				
	}




}
