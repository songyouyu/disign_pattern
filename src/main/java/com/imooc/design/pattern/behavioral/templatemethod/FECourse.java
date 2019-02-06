package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class FECourse extends ACourse{

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
