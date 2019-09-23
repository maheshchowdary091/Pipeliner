package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object passWord
     
    /**
     * <p></p>
     */
    public static Object crmHomePageLink
     
    /**
     * <p></p>
     */
    public static Object loginPageUrl
     
    /**
     * <p></p>
     */
    public static Object defaultWaitTime
     
    /**
     * <p></p>
     */
    public static Object mediumWaitTime
     
    /**
     * <p></p>
     */
    public static Object highWaitTime
     
    /**
     * <p></p>
     */
    public static Object veryHighWaitTime
     
    /**
     * <p></p>
     */
    public static Object basicPipelineDetails
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            userName = selectedVariables['userName']
            passWord = selectedVariables['passWord']
            crmHomePageLink = selectedVariables['crmHomePageLink']
            loginPageUrl = selectedVariables['loginPageUrl']
            defaultWaitTime = selectedVariables['defaultWaitTime']
            mediumWaitTime = selectedVariables['mediumWaitTime']
            highWaitTime = selectedVariables['highWaitTime']
            veryHighWaitTime = selectedVariables['veryHighWaitTime']
            basicPipelineDetails = selectedVariables['basicPipelineDetails']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
