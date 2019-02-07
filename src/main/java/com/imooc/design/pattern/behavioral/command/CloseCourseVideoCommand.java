package com.imooc.design.pattern.behavioral.command;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
