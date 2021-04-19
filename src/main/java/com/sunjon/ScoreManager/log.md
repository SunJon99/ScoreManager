## 1. 关于 Java 中的日期读写
关键：
- SimpleDateFormat
#### 1.1 如何将一个字符串转换成 Date
```java
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    Date date = null;
    try{
        date = sf.parse("2022-01-01");
    }catch(Exception e){
        e.printStackTrace();
    }
```

#### 1.2 如何将 Date 转换成相应的字符串输出
```java
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    Date now = new Date();
    String strNow = sf.format(now);
    System.out.println(strNow)
```