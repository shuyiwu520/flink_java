package wuu.flinkSource;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FlinkDataFromText {

    public static void main(String[] args) throws Exception{
        System.out.println("============== start function ==========");
        /*创建运行环境*/
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        /*读入数据，将要处理的数据加载进来*/
        DataStream<String> dataStream = env.readTextFile("/home/wuu/rt_rz/untitled/src/main/resources/hello.txt");

        /*输出数据到控制台*/
        dataStream.print();

        /*执行环境*/
      env.execute();







    }
}
