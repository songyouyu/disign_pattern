package com.imooc.design.pattern.structural.composite;

/**
 * 组合模式
 * @author youyusong
 * @date 2019/1/7
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 15);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程", 2);

        CatalogComponent mmall = new Course("mmall电商", 12);
        CatalogComponent design = new Course("设计模式", 14);

        javaCourseCatalog.add(mmall);
        javaCourseCatalog.add(design);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }

}
