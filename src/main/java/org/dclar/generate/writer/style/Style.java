package org.dclar.generate.writer.style;

import org.dclar.generate.writer.entity.Bulk;

public interface Style {

    /**
     * 设定cell的style 根据规则
     *
     * @param bulk
     */
    void setStyle(Bulk bulk);
}
