
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void generate() {
        // 相同的根目录
//        String rootDir = "G:\\8910DotNumber\\corr_beha_brain_trialbased\\first_level_trialbased_allTrials\\dot\\";
        String rootDir = "\\";
        // 新建一个大列表列表里面嵌套小列表 。小列表里面限制数据类型为字符串类型
        List<List<String>> all = new ArrayList<>();
        for(int i = 1; i <= 48; i++){
            // 创建一个新的列表
            List<String> list = new ArrayList<>();
            for(int j = i*10 - 9; j <=i*10; j++){
                // 创建一个临时字符串变量
                String temp = rootDir + i + "\\corn" + j;
//                String temp = rootDir + i + "\\corn" + j + ".nii"; 
              // 小列表里面添加临时字符串变量
                list.add(temp);
            }
            // 打印输出每个小列表 。你也可以进行自己的操作
            System.out.println(list);
            // 大列表里面增加小列表
            all.add(list);
        }
        System.out.println();
    }
    public static void main(String[] args){
        generate();
    }
}