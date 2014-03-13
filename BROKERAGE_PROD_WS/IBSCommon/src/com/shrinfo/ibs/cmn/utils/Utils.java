/**
 * 
 */
package com.shrinfo.ibs.cmn.utils;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;


/**
 * This class has general utility methods for use across all layers.
 */
public class Utils {

    private Utils() {} /* To restrict instantiation of this class. */

    // private static final Logger logger = Logger.getLogger( Utils.class );

    /**
     * Returns true if collection is refering to null or the collection is empty
     * 
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        boolean target = true;
        if (collection != null) {
            if (!collection.isEmpty()) {
                target = false;
            }
        }
        return target;
    }

    /**
     * Returns true if map is refering to null or the map is empty
     * 
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map) {
        boolean target = true;
        if (map != null) {
            if (!map.isEmpty()) {
                target = false;
            }
        }
        return target;
    }

    /**
     * Returns true if object is refering to null
     * 
     * @param object
     * @return
     */
    public static boolean isEmpty(Object object) {
        boolean target = true;
        if (object != null) {

            target = false;
        }
        return target;
    }

    /**
     * Returns true if the size of object array or the objects equals to null
     * 
     * @param objects
     * @return
     */
    public static boolean isEmpty(Object[] objects) {
        boolean target = true;
        if (objects != null) {
            if (objects.length != 0) {
                target = false;
            }
        }
        return target;
    }

    /**
     * Returns true if string references to null or the string is empty
     * 
     * @param string
     * @return
     */
    public static boolean isEmpty(String string) {
        boolean target = true;
        if (string != null) {
            if (string.length() != 0)
                target = false;
        }
        return target;
    }

    /**
     * Returns true if string references to null or the string is empty
     * 
     * @param string The string to be checked for emptiness
     * @param trimBeforeCheck A boolean indicating if the String should be trimmed before checking
     *        for emptiness. If true, then the String is trimmed, else it is equivalent to calling
     *        <code>isEmpty( String )</code>.
     * 
     * @return true, if null or of 0 length
     */
    public static boolean isEmpty(String string, boolean trimBeforeCheck) {
        boolean target = true;

        if (trimBeforeCheck) {
            if (string != null) {
                if (string.trim().length() != 0)
                    target = false;
            }
        } else {
            target = isEmpty(string);
        }
        return target;
    }

    /*
     * There are some load-level activities that are essential for the proper functioning of Utils.
     * These will be done here because no instance of this class created for us to do these in the
     * constructor.
     * 
     * NOTE: Please don't change the position of this static block. This has to be after all the
     * isEmpty() methods have been declared!
     */
    static {

    }

    /**
     * Trims all elements in the passed String array.
     * 
     * @param array
     */
    public static void trimAllEntries(String[] array) {
        if (Utils.isEmpty(array))
            return;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((String) array[i]).trim();
        }
    }

    public static boolean toDefaultFalseBoolean(String input) {
        boolean convertedResult = false;

        if ("YES".equalsIgnoreCase(input) || "Y".equalsIgnoreCase(input)
            || "TRUE".equalsIgnoreCase(input)) {
            convertedResult = true;
        }

        return convertedResult;
    }

    /**
     * This method can be used to ensure that null strings are converted to empty, so that there is
     * no case of a null object being processed upon.
     * 
     * @param input
     * @return Empty string if <code>null</code> is passed, else the passed string
     */
    public static String toNonNullString(String input) {
        String retString = input;
        if (isEmpty(input)) {
            retString = "";
        }

        return retString;
    }

    /**
     * Formats a String in the specified format from the passed date.
     * 
     * @param date
     * @param format
     * @return
     */
    public static String getDateAsString(Date date, String format) {
        if (isEmpty(date))
            return "";

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * Checks if the passed string is numeric in nature.
     * 
     * @param num
     * @return
     */
    public static boolean isNumber(String num) {
        boolean isNumber = true;
        try {
            java.text.NumberFormat nf = new java.text.DecimalFormat();
            Number n = nf.parse(num);
        } catch (java.text.ParseException e) {
            isNumber = false;
        }

        return isNumber;
    }

    /**
     * A convenience method to concatenate multiple strings without the use of the '+' operator.
     * 
     * @param strings
     * @return
     */
    public static String concat(String... strings) {
        if (Utils.isEmpty(strings)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (String s : strings) {
            sb.append(s);
        }

        return sb.toString();
    }

    /* TODO getSingleValueAppSpecificConfig() to be implemented */
    public static String getSingleValueAppConfig(String key) {
        // return Configurations.INSTANCE.getProperty( key, appConfigPropertiesFile );
        return null;
    }

    /**
     * Returns an app config value for the passed key. If the key is not found or is empty,
     * <code>default</code> is returned.
     * 
     * @param key The key for which the value is required
     * @param defaultValue The default value to be used if the key is not present or is set to empty
     *        string
     * 
     * @return
     */
    public static String getSingleValueAppConfig(String key, String defaultValue) {
        String value = getSingleValueAppConfig(key);
        if (Utils.isEmpty(value)) {
            value = defaultValue;
        }

        return value;
    }

    /**
     * Returns an app config value split at ','. This can be used by all app config entries that can
     * have multiple values that don't use ',' in their values. In most cases, this kind of
     * configuration works. However, if ',' is expected to be part of the value itself, then
     * consider using the overloaded method <code>getMultiValueAppConfig( String, String )</code>
     * which takes a separator.
     * 
     * @param key
     * @return
     */
    public static String[] getMultiValueAppConfig(String key) {
        return null;
        // return Configurations.INSTANCE.getMultiValuedProperty( key, appConfigPropertiesFile );
    }

    /**
     * Returns an app config value split at the specified <code>separator</code>. This can be used
     * by all app config entries that can have multiple values that may have ',' in their values.
     * 
     * @param key The key for the property
     * @param separator The separator that should be used to split the value configured
     * @return
     */
    public static String[] getMultiValueAppConfig(String key, String separator) {
        return null;
        // return Configurations.INSTANCE.getMultiValuedProperty( key, appConfigPropertiesFile,
        // separator );
    }

    /**
     * Returns an app config value split at ',' and '#' and transformed into a Map. This can be used
     * by all app config entries which will not have ',' or '#' in their values. This will work in
     * most cases. However, if a different pair of separator is required, consider using the
     * overloaded method <code>getMultiValueAppConfigAsMap( String, String, String )</code>.
     * 
     * @param key The key for the property
     * @return
     */
    public static Map<String, String> getMultiValueAppConfigAsMap(String key) {
        return getMultiValueAppConfigAsMap(key, ",", "#");
    }

    /**
     * Returns an app config value split at the specified <code>separator</code>. This can be used
     * by all app config entries that can have multiple values that may have ',' in their values.
     * 
     * @param key The key for the property
     * @param multiValueSeparator The multi-value separator that should be used to split the value
     *        configured into name-value pairs
     * @param nvPairSeparator The separator for the name-value pair
     * 
     * @return
     */
    public static Map<String, String> getMultiValueAppConfigAsMap(String key,
            String multiValueSeparator, String nvPairSeparator) {

        Map<String, String> configAsMap = null;
        /*
         * String[] multiValues = Configurations.INSTANCE.getMultiValuedProperty( key,
         * appConfigPropertiesFile, multiValueSeparator ); if( !Utils.isEmpty( multiValues ) ){
         * configAsMap = new HashMap<String, String>();
         * 
         * for( String value : multiValues ){ String[] nvPair = value.split( nvPairSeparator );
         * String mapValue = ( nvPair.length > 1 ? nvPair[ 1 ] : null ); configAsMap.put( nvPair[ 0
         * ], mapValue ); } }
         */
        return configAsMap;
    }

    /* TODO getAppSpecificErrorMessage() to be implemented */
    public static String getAppErrorMessage(String errorKey) {
        return errorKey;
        // return Configurations.INSTANCE.getProperty( errorKey, errorMessagePropertiesFile );
    }

}
