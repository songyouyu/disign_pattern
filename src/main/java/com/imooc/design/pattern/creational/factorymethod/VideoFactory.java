package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author youyusong
 * @date 2018/11/8
 */
public abstract class VideoFactory {

    /**
     * 指定规范契约
     * 具体产生什么类型, 由 VideoFactory 子类决定
     * @return
     */
    public abstract Video getVideo();

//    public Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return video;
//    }
//
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//
//        return null;
//    }

}
