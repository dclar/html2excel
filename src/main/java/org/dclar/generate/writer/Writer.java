package org.dclar.generate.writer;

import org.dclar.generate.writer.entity.Bulk;

public interface Writer {

    void write(Bulk bulk);

    void writeLn(Bulk bulk);
}
