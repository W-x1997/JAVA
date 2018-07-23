import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		ServerSocket server=new ServerSocket(12306);
		System.out.println("坚挺服务开始啦！！！"); 
		Socket socket=server.accept();
		
		InputStream is=socket.getInputStream();
		InputStreamReader reader=new InputStreamReader(is);
		
		
		BufferedReader bufReader = new BufferedReader(reader);
		String s=null;
		 StringBuffer sb = new StringBuffer();
		while((s=bufReader.readLine())!=null){
			sb.append(s);
			
		}
		
		System.out.println("服务器：" + sb.toString());
        // 关闭输入流
        socket.shutdownInput();

        OutputStream os = socket.getOutputStream();
        os.write(("我是服务端,客户端发给我的数据就是："+sb.toString()).getBytes());
        os.flush();
        // 关闭输出流
        socket.shutdownOutput();
        os.close();

        // 关闭IO资源
        bufReader.close();
        reader.close();
        is.close();

        socket.close();// 关闭socket
        server.close();// 关闭ServerSocket


        
	}

}
