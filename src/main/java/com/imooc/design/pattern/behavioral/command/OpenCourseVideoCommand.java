package com.imooc.design.pattern.behavioral.command;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
