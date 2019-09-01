import java.io.*;
import java.util.ArrayList;

//之后再优化效率，先写这么多啦
public class WordsFile {  //读取单词本文件类
    String path = "F:/java/HelloWeb/src/EnglishWords/words.txt";
    File file = new File(path);
    String str;

    public ArrayList<String> getfile() throws IOException {
        //将字节流FileInputStream转换为gbk格式的字符流InputStreamReader,再转成BufferReader，因为我们要对文字处理，再一块读，所以用BufferReader，而非之前的直接读字节流
        //上面的话是自我认定，需要老师确定
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
        ArrayList<String> arr = new ArrayList<>();
        while ((str = in.readLine()) != null) {   //BufferReader的方法：读一行
            arr.add(str.trim());          //百度得单词本空前后有空格，trim去除空格，再add到ArrayList中
        }
        in.close();  //缓存流一定要记得关闭哈
        return arr;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        WordsFile w = new WordsFile();
        ArrayList<String> arrayList = w.getfile();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}