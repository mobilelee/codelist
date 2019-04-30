package json;

import com.jayway.jsonpath.JsonPath;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonPah {

    static String json ="{\n" +
            "    \"store\": {\n" +
            "        \"book\": [\n" +
            "            {\n" +
            "                \"category\": \"reference\",\n" +
            "                \"author\": \"Nigel Rees\",\n" +
            "                \"title\": \"Sayings of the Century\",\n" +
            "                \"price\": 8.95\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Evelyn Waugh\",\n" +
            "                \"title\": \"Sword of Honour\",\n" +
            "                \"price\": 12.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Herman Melville\",\n" +
            "                \"title\": \"Moby Dick\",\n" +
            "                \"isbn\": \"0-553-21311-3\",\n" +
            "                \"price\": 8.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"J. R. R. Tolkien\",\n" +
            "                \"title\": \"The Lord of the Rings\",\n" +
            "                \"isbn\": \"0-395-19395-8\",\n" +
            "                \"price\": 22.99\n" +
            "            }\n" +
            "        ],\n" +
            "        \"bicycle\": {\n" +
            "            \"color\": \"red\",\n" +
            "            \"price\": 19.95\n" +
            "        }\n" +
            "    },\n" +
            "    \"expensive\": 10\n" +
            "}";

    public static void main(String[] args) {
//        //List<String> authors = JsonPath.read(json,"$.store.book[*].author");
//        List<String> authors = JsonPath.read(json,"$..author");
//        for (String author : authors){
//            System.out.println(author);
//        }
//        List<Double> prices = JsonPath.read(json,"$..price");
//        for (Double price : prices){
//            System.out.println(price);
//        }

//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..book[0,1]");
//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..book[-2:]");
//        for (LinkedHashMap<String,String> book : books){
//            System.out.println(book);
//        }

//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..book[?(@.isbn)]");
//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$.store.book[?(@.price<10)]");
//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..book[?(@.price <= $['expensive'])]");
//          List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..book[?(@.author=~ /.*REES/i)]");

//
//        List<LinkedHashMap<String,String>> books = JsonPath.read(json,"$..*");
//        for (LinkedHashMap<String,String> book : books){
//            System.out.println(book);
//        }

//        List<String> all = JsonPath.read(json,"$..*");
//        for (String single : all){
//            System.out.println(single);
//        }

        List<Integer> lengths = JsonPath.read(json,"$..book.length()");
        for (Integer length:lengths)
        System.out.println(length);




    }
}
