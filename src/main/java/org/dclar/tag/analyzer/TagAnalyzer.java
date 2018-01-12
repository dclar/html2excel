package org.dclar.tag.analyzer;


import org.dclar.tag.Tag;

public interface TagAnalyzer {

    Tag analyse(String rawContent) throws Exception;
}
