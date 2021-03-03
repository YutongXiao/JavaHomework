import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class FolderHash {
    public static void main(String[] args) {
        String path = "";
        byte[] sha1 = folderHash(path);

        //打印哈希值
        String result = "";
        for (int i = 0; i < sha1.length; i++){
            result += Integer.toString(sha1[i]&0xFF, 16);
        }

        System.out.println("hashcode for folder " + path + " is " + result);
    }

    //求文件夹的SHA1Checksum
    public static byte[] folderHash(String path) {
        try {
            //function dfs 搜索目录里所有文件
            File dir = new File(path);
            File[] fs = dir.listFiles();
            java.util.Arrays.sort(fs);

            byte[] buffer = new byte[1024]; //用于计算hash值的文件缓冲区
            MessageDigest complete = MessageDigest.getInstance("SHA-1"); //使用SHA1哈希/摘要算法
            int numRead = 0;

            //循环读取所有文件
            for (int i = 0; i < fs.length; i++) {

                //读取并累加所有file文件类型到buffer中
                if (fs[i].isFile()) {
                    System.out.println("file-- " + fs[i].getName() + " ");


                    try {
                        File file = new File(fs[i].getAbsolutePath());
                        FileInputStream is = new FileInputStream(file);
                        //SHA1Checksum算法
                        do {
                            //读取numRead字节到buffer中
                            numRead = is.read(buffer);
                            if (numRead > 0) {
                                //根据buffer[0:numRead]的内容更新hash值
                                complete.update(buffer, 0, numRead);
                            }
                            //文件已读完，退出循环
                        } while (numRead != -1);
                        //关闭输入流
                        is.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                //读取到文件夹则用folderHash递归遍历其中所有文件
                if (fs[i].isDirectory()) {
                    System.out.println("Directory-- " + fs[i].getName());
                    folderHash(path + File.separator + fs[i].getName());
                }
            }
            return complete.digest();
        }

        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

