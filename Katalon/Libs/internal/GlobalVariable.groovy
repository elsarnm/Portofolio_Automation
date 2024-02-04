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
    public static Object appPath
     
    /**
     * <p></p>
     */
    public static Object appDaki
     
    /**
     * <p></p>
     */
    public static Object appSam
     
    /**
     * <p></p>
     */
    public static Object appHap
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            appPath = selectedVariables['appPath']
            appDaki = selectedVariables['appDaki']
            appSam = selectedVariables['appSam']
            appHap = selectedVariables['appHap']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
