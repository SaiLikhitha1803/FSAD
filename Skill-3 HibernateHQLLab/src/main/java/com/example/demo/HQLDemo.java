package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.example.entity.Product;
import com.example.loader.ProductDataLoader;
import com.example.util.HibernateUtil;

import java.util.List;

public class HQLDemo {

public static void main(String[] args){

SessionFactory factory=HibernateUtil.getSessionFactory();
Session session=factory.openSession();

ProductDataLoader.loadSampleProducts(session);

String hql="FROM Product p ORDER BY p.price ASC";

Query<Product> query=session.createQuery(hql,Product.class);

List<Product> list=query.list();

for(Product p:list){
System.out.println(p);
}

session.close();
factory.close();
}
}