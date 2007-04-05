package edu.duke.cabig.c3pr.test.system.util;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: kherm
 * Date: Feb 26, 2007
 * Time: 6:21:37 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractC3prContextBean {
    protected File buildDir;


    /**
     *
     * @param buildDir Basedirectory of the ESB project
     * Utility depends on antDir/build.xml
     */
    protected AbstractC3prContextBean(File buildDir) {
        this.buildDir = buildDir;
    }

    public File getBuildDir() {
        return buildDir;
    }
}
