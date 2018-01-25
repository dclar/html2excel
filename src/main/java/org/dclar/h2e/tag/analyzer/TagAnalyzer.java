package org.dclar.h2e.tag.analyzer;


import org.dclar.h2e.tag.Tag;

public interface TagAnalyzer {

    Tag analyse(String rawContent) throws Exception;
}
