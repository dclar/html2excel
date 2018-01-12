package org.dclar.tag.analyzer.impl;

import org.dclar.tag.Tag;
import org.dclar.tag.TagRepository;
import org.dclar.tag.analyzer.TagAnalyzer;
import org.dclar.tag.fetcher.TagFetcher;
import org.dclar.tag.fetcher.fetchEntitiy.RawTagInfo;
import org.dclar.tag.fetcher.helper.FetcherHelper;
import org.dclar.tag.fetcher.impl.TagFetcherImpl;
import org.dclar.tag.tagEntity.Table;
import org.dclar.tag.tagEntity.Td;
import org.dclar.tag.tagEntity.Th;
import org.dclar.tag.tagEntity.Tr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 分析html内容，解析出Tag结构数据
 */
@Service
public class TagAnalyzerImpl implements TagAnalyzer {


    @Autowired
    TagFetcher tagFetcherImpl;

    @Override
    public Tag analyse(String rawContent) throws Exception {
        RawTagInfo rawTagInfo = tagFetcherImpl.fetch(FetcherHelper.getFirst(rawContent));
        return rawTagInfo.getTag();
    }


    public static void main(String[] args) throws Exception {

        TagAnalyzerImpl tagAnalyzer = new TagAnalyzerImpl();

        tagAnalyzer.tagFetcherImpl = new TagFetcherImpl();

        TagRepository.Tags = new ArrayList<>();

        TagRepository.Tags.add(new Td());
        TagRepository.Tags.add(new Tr());
        TagRepository.Tags.add(new Th());
        TagRepository.Tags.add(new Table());
        String tableFilePath = "/Users/yl/Downloads/table";


        TagRepository.AttrMaps = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("rowspan");
        list.add("colspan");
        TagRepository.AttrMaps.put("<td>", list);

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(tableFilePath))));

        String line = null;


        StringBuffer stringBuffer = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line.replace("\t", ""));
        }

        tagAnalyzer.analyse(stringBuffer.toString());


    }

}

