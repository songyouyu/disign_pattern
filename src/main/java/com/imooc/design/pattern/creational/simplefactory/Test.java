package com.imooc.design.pattern.creational.simplefactory;

/**
 * 简单工厂模式
 * @author youyusong
 * @date 2018/11/8
 */
public class Test {

    public static void main(String[] args) {
//        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }

}
