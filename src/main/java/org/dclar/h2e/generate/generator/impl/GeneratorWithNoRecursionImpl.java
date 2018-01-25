package org.dclar.h2e.generate.generator.impl;

import org.dclar.h2e.generate.generator.Generator;
import org.dclar.h2e.generate.matcher.TagMatcher;
import org.dclar.h2e.generate.writer.Writer;
import org.dclar.h2e.generate.writer.entity.Bulk;
import org.dclar.h2e.tag.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneratorWithNoRecursionImpl implements Generator {

    @Autowired
    Writer excelWriterImpl;

    @Autowired
    TagMatcher tdMatcher;

    Logger log = LoggerFactory.getLogger(GeneratorWithNoRecursionImpl.class);

    @Override
    public void generate(Bulk bulk) {

        List<Tag> subTags = bulk.getTag().getSubTags();
        if (subTags != null) {
            subTags.forEach(subtag -> {
                if (tdMatcher.match(subtag)) {
                    bulk.setTag(subtag);
                    log.debug("即将对Tag {} 进行写入，内容为： {}", subtag.getHtmlTagStart(), subtag.getContent());
                    excelWriterImpl.write(bulk);
                } else {
                    log.debug("Tag {} 被忽略写操作，继续递归", subtag.getHtmlTagStart());
                    bulk.setTag(subtag);
                    generate(bulk);
                }
            });
            log.debug("进行excelWriterImpl.writeLn的回车处理");
            excelWriterImpl.writeLn(bulk);
        }
    }
}
