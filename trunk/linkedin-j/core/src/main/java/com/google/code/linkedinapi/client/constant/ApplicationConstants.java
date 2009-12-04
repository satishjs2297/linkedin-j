/**
 *
 */
package com.google.code.linkedinapi.client.constant;

import java.io.IOException;
import java.util.Properties;

/**
 * @author nmukhtar
 *
 */
public final class ApplicationConstants {

    /** Field description */
    public static final String APP_CONSTANTS_FILE =
        "com/google/code/linkedinapi/client/constant/ApplicationConstants.properties";

    /** Field description */
    private static final Properties applicationConstants = new Properties();

    static {
        try {
            applicationConstants.load(
                ApplicationConstants.class.getClassLoader().getResourceAsStream(APP_CONSTANTS_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Field description */
    public static final String VALIDATE_XML =
    	applicationConstants.getProperty("com.google.code.linkedinapi.client.validateXml");

    /** Field description */
    public static final String OAUTH_VERSION =
    	applicationConstants.getProperty("com.google.code.linkedinapi.client.oauthVersion");

    /** Field description */
    public static final String CONTENT_ENCODING =
    	applicationConstants.getProperty("com.google.code.linkedinapi.client.encoding");

    /** Field description */
    public static final String CONTENT_TYPE_XML =
    	applicationConstants.getProperty("com.google.code.linkedinapi.client.contentTypeXml");

    /**
     * Constructs ...
     *
     */
    private ApplicationConstants() {}
}