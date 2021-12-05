package com.xiaoming.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.Iterator;

/**
 * @author xiaoming.dong
 * @create 2021-01-18 18:23
 */
public class xmlTest {

    @Test
    public void test() {
        SAXReader saxReader = new SAXReader();
//        System.out.println(saxReader);

        try {
            Document document = saxReader.read("xml//book.xml");
            System.out.println(document);
            Element rootElement = document.getRootElement();
            Iterator iterator = rootElement.elementIterator();

            while(iterator.hasNext()){
                Element next = (Element) iterator.next();
                Element name = next.element("name");
                Element price = next.element("price");
                Element author = next.element("author");
                Book book = new Book(name.getText(), Double.parseDouble(price.getText()), author.getText());
                System.out.println(book);
            }



        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
class Book{
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}