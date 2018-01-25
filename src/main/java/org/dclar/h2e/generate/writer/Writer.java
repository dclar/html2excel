package org.dclar.h2e.generate.writer;

import org.dclar.h2e.generate.writer.entity.Bulk;

public interface Writer {

    void write(Bulk bulk);

    void writeLn(Bulk bulk);
}
