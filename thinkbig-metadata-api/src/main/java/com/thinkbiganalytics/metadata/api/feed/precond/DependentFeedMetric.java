/**
 * 
 */
package com.thinkbiganalytics.metadata.api.feed.precond;

import com.thinkbiganalytics.metadata.sla.api.Metric;

/**
 *
 * @author Sean Felten
 */
public abstract class DependentFeedMetric implements Metric {

    private final String feedName;

    public DependentFeedMetric(String feedName) {
        super();
        this.feedName = feedName;
    }
    
    public String getFeedName() {
        return feedName;
    }
}
