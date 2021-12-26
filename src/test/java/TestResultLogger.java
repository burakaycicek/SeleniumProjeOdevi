import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {

    Log log = new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        String methodName = context.getDisplayName();
        log.info(methodName + "Passed");
    }


    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        String testFailCause = cause.getMessage();
        String methodName = context.getDisplayName();
        log.error(methodName + "Failed with cause: " +testFailCause );
    }
}
