package org.dclar.h2e;

import java.io.Serializable;
import java.util.List;

/**
 *    crf缓存数据对象
 * @author XiaYaLing
 * @date 2018/1/12
 * @param
 * @return
 */
public class CrfCacheModel implements Serializable{

    /**
     * load head
     */
    private String head;

    /**
     * load dic
     */
    private List<String> dic;

    /**
     * load alpha
     */
    private List<Float> alpha;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public List<String> getDic() {
        return dic;
    }

    public void setDic(List<String> dic) {
        this.dic = dic;
    }

    public List<Float> getAlpha() {
        return alpha;
    }

    public void setAlpha(List<Float> alpha) {
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return "CrfCacheModel{" +
                "head='" + head + '\'' +
                ", dic=" + dic +
                ", alpha=" + alpha +
                '}';
    }
}
