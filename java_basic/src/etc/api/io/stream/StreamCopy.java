package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) throws IOException {
		
		FileInputStream oldfile = null;
		FileOutputStream newfile = null;
		
		try {
			oldfile = new FileInputStream("C:/Mywork/aaa.jpg");
			newfile = new FileOutputStream("C:/Users/ict/Desktop/copy.jpg");
			
			byte[] arr = new byte[100];
			
			
			while(true) {
				// 읽어들인 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1을 반환.
				int result = oldfile.read(arr);
				if(result == -1)break;
				
				//바이트 단위로 0부터 읽은 크기까지의 파일을 작성
				newfile.write(arr,0,result);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oldfile.close();
				newfile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
