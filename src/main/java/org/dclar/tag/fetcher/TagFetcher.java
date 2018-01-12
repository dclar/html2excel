package org.dclar.tag.fetcher;

import org.dclar.tag.fetcher.fetchEntitiy.RawTagInfo;

public interface TagFetcher {

    RawTagInfo fetch(RawTagInfo rawTagInfo) throws Exception;
}
