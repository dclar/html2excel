package org.dclar.generate.matcher;

import org.dclar.tag.Tag;

import java.util.List;

public interface TagMatcher {

    /**
     * 判断是否为需要操作的tag
     *
     * @param tag
     * @return
     */
    boolean match(Tag tag);

    /**
     * 获得tag的html的raw start
     *
     * @return
     */
    List<String> getMatchRawTagHtmlStart();

}
