package com.allpai.entity.video.vo;

/**
 * @author sunkai
 * @version 1.0
 * @date 2019/12/12 0012 22:57
 * 短视频热门话题参数输出
 */
public class VideoHotTopicRankOutVo {
    //话题的标题
    private String topicTitle;
    //参与人数
    private Long partakeNum;
    //话题Id
    private Long topicId;

    public Long getTopicId() {
        return topicId;
    }
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }
    public String getTopicTitle() {
        return topicTitle;
    }
    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }
    public Long getPartakeNum() {
        return partakeNum;
    }
    public void setPartakeNum(Long partakeNum) {
        this.partakeNum = partakeNum;
    }
}
