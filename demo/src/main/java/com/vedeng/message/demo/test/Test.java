package com.vedeng.message.demo.test;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static com.vedeng.message.demo.test.Test04_collection_filter.createPerson;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/6
 * @Description:
 * @version:
 */
public class Test {
    public static void main(String[] args) {

/*        List<Person> people = createPerson();//调用初始化集合的静态方法，初始化一个集合

        List<Person> collect = people.stream().filter(x -> x.getAge() == 33).collect(Collectors.toList());
        collect.stream().forEach( x -> {
            System.out.println(x);
        });*/
/*
List<Student> list  = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("qq");
        list.add(student1);
        Student student2 = new Student();
        student2.setName("qqq");
        student2.setId(2);
        list.add(student2);
    
        Student ss = new Student();
        List<Student> list1 =  new ArrayList<>();
        
        list.stream().forEach( x->{
            ss.setName(x.getName());
            list1.add(ss);
            
        });
        list1.stream().forEach(x -> {
            System.out.println(x.getName());
        });
        
        System.out.println(list1.size());
        
        Optional<Student> cartOptional = list.stream().filter(item -> item.getName().equals("qqq11")).findFirst();
        if (cartOptional.isPresent()) {
            System.out.println("存在");
        }else {
            System.out.println("111111111");
        }
*/
    
    
/*        String[] aa = "aaa,bbb,ccc".split(",");
        System.out.println(aa.length);*/
    
/*        Consumer<String> c = System.out::println;
        Consumer<String> v = x -> {
            if (x.equals("001")){
                System.out.println("我是001");
            }
            if (x.equals("002")) {
                System.out.println("我是002");
            }
        };
        v.accept("002");
        c.accept("my name is xx");
    
        //生产者类型
        Supplier<String> s = ()-> {return "返回值";};
        System.out.println(s.get());
    
        // 创建数组
        int[] arr = {100,20,50,30,99,101,-50};
    
        int maxValue = getMaxValue(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i > max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中的最大值为:" + maxValue);
    
    
    
    
        List<String> list = Arrays.asList("Hello","Lambda","Go","java");
        list = filterStr(list, f->f.contains("o"));
        list.forEach(System.out::println);
    
        String str = strHandler("huangyichun", ts -> ts.toUpperCase());
        System.out.println(str);*/
/*



        int a = 1;
        int b = a++;
        int c = ++a;
            System.out.println(""+a+""+b+""+c);*/


/*        List<Gh> list = Arrays.asList(new Gh("ewew",18,9999.99), new Gh("qwq",25,55555.55));
        System.out.println(list.size());*/
    
    
    
        System.out.print("7.22-7.0=" + (7.22f-7.0f));
        System.out.print("7.22-7.0=" + subtract(7.22,7.0));
    }
    public static double subtract(double v1, double v2) {
    
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }
    //需求用于处理字符串
    public static String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }
    
    
    //需求:将满足条件的字符串添加到集合中
    public static List<String> filterStr(List<String> list, Predicate<String> predicate) {
        List<String> stringList = new ArrayList<>();
        for (String str : list) {
            if (predicate.test(str)) {
                stringList.add(str);
            }
        }
        return stringList;
    }
    
    
    public static int getMaxValue(Supplier<Integer> sup){
        return sup.get();
    }
    
    
    public static void startProgram(String programPath) throws IOException {
        if (StringUtils.isNotBlank(programPath)) {
            try {
                String programName = programPath.substring(programPath.lastIndexOf("/") + 1, programPath.lastIndexOf("."));
                List<String> list = new ArrayList<String>();
                list.add("cmd.exe");
                list.add("/c");
                list.add("start");
                list.add("\"" + programName + "\"");
                list.add("\"" + programPath + "\"");
                ProcessBuilder pBuilder = new ProcessBuilder(list);
                pBuilder.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
