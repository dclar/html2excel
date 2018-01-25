package org.dclar.h2e.tag.fetcher;

import org.dclar.h2e.tag.fetcher.fetchEntitiy.RawTagInfo;

public interface TagFetcher {

    RawTagInfo fetch(RawTagInfo rawTagInfo) throws Exception;
}
