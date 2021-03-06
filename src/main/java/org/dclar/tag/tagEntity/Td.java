package org.dclar.tag.tagEntity;

import org.dclar.Const;
import org.dclar.tag.AbstractTag;
import org.dclar.tag.meta.TagAttr;
import org.dclar.tag.meta.TagEntity;

@TagEntity
public class Td extends AbstractTag {

    private String name = Const.HTML_TAG_TD;

    /* Tag <td>的attribute */
    @TagAttr
    private int rowspan;

    @TagAttr
    private int colspan;

    /**
     * Tag的英文名称，如td，tr，table
     *
     * @return
     */
    @Override
    public String getTagName() {
        return this.name;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        addAttribute(Const.HTML_TAG_TD_ROWSPAN, rowspan);
        this.rowspan = rowspan;
    }

    public int getColspan() {
        return colspan;
    }

    public void setColspan(int colspan) {
        addAttribute(Const.HTML_TAG_TD_COLSPAN, colspan);
        this.colspan = colspan;
    }
}
