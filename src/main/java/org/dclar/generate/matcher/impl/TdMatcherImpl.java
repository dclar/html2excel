package org.dclar.generate.matcher.impl;

import org.dclar.generate.matcher.AbstractTagMatcher;
import org.dclar.test.Const;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TdMatcherImpl extends AbstractTagMatcher {

    /**
     * 获得tag的html的raw start
     *
     * @return
     */
    @Override
    public List<String> getMatchRawTagHtmlStart() {
        return Arrays.asList(new String[]{Const.HTML_TD_START, Const.HTML_TH_START});
    }
}
