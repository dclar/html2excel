package org.dclar.h2e.tag.tagEntity;

import org.dclar.h2e.Const;
import org.dclar.h2e.tag.AbstractTag;
import org.dclar.h2e.tag.meta.TagEntity;

@TagEntity
public class Table extends AbstractTag {

    private String name = Const.HTML_TAG_TABLE;

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