package com.oiskeletons.android;

/**
 * Created by rubin.apore on 10/28/17.
 */

import com.oiskeletons.android.util.OISkeletonApplicationBase;

/**
 * OI's custom implementation of the standard android application class
 * debug version
 */
public class OISkeletonApplication extends OISkeletonApplicationBase {
    final public String BASE_API_URL = "";
    final public String BASE_NEWS_URL = "";
    final public String GITHUB_BASE_URL = "";

    /**
     * Use debug implementation plantTimber provided by OISkeletonApplicationBase
     */
    @Override
    protected void plantTimber() {
        super.plantTimber();
    }
}
