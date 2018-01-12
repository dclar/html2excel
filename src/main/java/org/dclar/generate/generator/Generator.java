package org.dclar.generate.generator;

import org.dclar.generate.writer.entity.Bulk;
import org.dclar.tag.Tag;

public interface Generator {

    void generate(Bulk bulk);
}
