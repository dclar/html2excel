package org.dclar.h2e.processor;

public interface Processor {

    void process(String rawContent, String path) throws Exception;
}
