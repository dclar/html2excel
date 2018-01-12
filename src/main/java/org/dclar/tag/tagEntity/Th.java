package org.dclar.tag.tagEntity;

import org.dclar.Const;
import org.dclar.tag.AbstractTag;
import org.dclar.tag.Tag;
import org.dclar.tag.meta.TagEntity;

@TagEntity
public class Th extends AbstractTag {

    private String name = Const.HTML_TAG_TH;

    /**
     * Tag的英文名称，如td，tr，table
     *
     * @return
     */
    @Override
    public String getTagName() {
        return this.name;
    }


}
