package org.dclar.h2e.generate.writer.style;

import org.dclar.h2e.generate.writer.entity.Bulk;

public interface Style {

    /**
     * 设定cell的style 根据规则
     *
     * @param bulk
     */
    void setStyle(Bulk bulk);
}
