

import java.io.File;

public class FileOperate {
	private File file = null;
	public FileOperate(String path){
		this.file = new File(path);
		System.out.println("Hello World!");
	}
	

}
